package cw25.zd1;

public class Card {
    private double balance;

    public double reserveMoney(double many) {
        return balance - many;
    }

    public void rollBack(double many) {
        balance += many;
    }

    public double getMoney(double many) {
        return balance -= many;
    }
    public double getBalance(){
        return balance;
    }
}
