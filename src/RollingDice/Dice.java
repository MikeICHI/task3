package RollingDice;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Dice extends Player {
    public Dice() {
        //k игральных костей Random
        System.out.println("Введите количество игральных костей: ");
        Scanner in = new Scanner(System.in);

        //количество k игральных костей
        int k = in.nextInt();
        Random rand = new Random();

        //количество очков
        int sum = 0;

        System.out.println("Подбрасываем кости...");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        while (k != 0) {
            int randNum = rand.nextInt(6);
            System.out.print(randNum);
            sum+=randNum;
            k--;
        }

        System.out.println("сумма очков:"+sum);
    }
    //N игроков, компьютер последний

public void Players(){
        Scanner in = new Scanner(System.in);
    System.out.println("Введите количество игроков от 1 до 4 : ");
    int numOfPlayers = in.nextInt();
//
//    while(numOfPlayers>=0){
//        Player
//    }


}

    //7 выигрышей для победителя
    //начинаю игру я

}
