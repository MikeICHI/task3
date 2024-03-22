package RollingDice;

import java.util.Random;

public class RollingDice {
    private final int N; // Количество игроков
    private final int K; // Количество кубиков
    private final int[] wins; // Очки каждого игрока
    private final int[] score; // Очки каждого игрока
    private int currentPlayer; // Текущий игрок
    private final int WINNING_SCORE = 7; // Количество побед для победы

    public RollingDice(int N, int K) {
        this.N = N;
        this.K = K;
        wins = new int[N];
        score = new int[N];
        currentPlayer = 0;
    }

    public void play() {
        while (!checkWinner()) {
            int roundScore = rollDice();
            score[currentPlayer] += roundScore;
            System.out.println("Player " + currentPlayer + " rolled: " + roundScore);
            currentPlayer = (currentPlayer + 1) % N;
        }
        int winner = findWinner(wins);
        System.out.println("Player " + winner + " wins the game!");
    }

    private int rollDice() {
        Random random = new Random();
        int total = 0;
        for (int i = 0; i < K; i++) {
            total += random.nextInt(6) + 1; // Генерируем случайное число от 1 до 6
        }
        return total;
    }

    private boolean checkWinner() {
        if (currentPlayer == 0) {
            int winner = findWinner(score);
            wins[winner]++;
            int totalScore = score[winner];
            if (totalScore > 0) {
                System.out.println("Player " + winner + " winner, total score: " + totalScore);
                System.out.println("-----------------------------------------");
            }
            for (int i = 0; i < score.length; i++) score[i] = 0;

        }
        for (int win : wins) {
            if (win >= WINNING_SCORE) {
                return true;
            }
        }
        return false;
    }

    private int findWinner(int[] players) {
        int maxScore = 0;
        int winner = 0;
        for (int i = 0; i < N; i++) {
            if (players[i] > maxScore) {
                maxScore = players[i];
                winner = i;
            }
        }
        return winner;
    }

    public static void main(String[] args) {
        int players = 4; // Измените количество игроков по вашему выбору
        int diceCount = 2; // Измените количество кубиков по вашему выбору
        RollingDice game = new RollingDice(players, diceCount);
        game.play();
    }
}