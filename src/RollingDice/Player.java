package RollingDice;

public abstract class Player {
    private String name;
    private int sum=0;

    public String getName(){
        return name;
    }
    public int getSum(){
        return sum;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setSum(int sum){
        this.sum+=sum;
    }

}
