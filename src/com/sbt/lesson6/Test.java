package com.sbt.lesson6;

public class Test {
    private double money = 100000;
    private String pin = "4321";
    private long block = 0;
    private int attempt = 0;

    public static final String MONDAY = "MONDAY1";
    public static final String Tuesday = "Tuesday";
    public static final String Wednesday = "Wednesday";
    public static final String Thursday = "Thursday";
    public static final String Friday = "Friday";



    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public long getBlock() {
        return block;
    }

    public void setBlock(long block) {
        this.block = block;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }
}
