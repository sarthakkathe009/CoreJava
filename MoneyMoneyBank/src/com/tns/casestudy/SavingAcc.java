package com.tns.casestudy;

public abstract class SavingAcc extends BankAcc {
    private final boolean isSalaried;
    private static final float MINBAL = 1000.0f;

    public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
        super(accNo, accNm, accBal);
        this.isSalaried = isSalaried;
    }

    public boolean isSalaried() {
        return isSalaried;
    }

    public static float getMinBal() {
        return MINBAL;
    }

    @Override
    public void withdraw(float amount) {
        float bal = getAccBal() - amount;
        if (bal < MINBAL) {
            System.out.println("Withdrawal Failed");
        } else {
            setAccBal(bal);
        	System.out.println("Withdrawal Successful.");
        }
    }

    @Override
    public String toString() {
        return "Account No: " + getAccNo() + "\nAccount Name: " + getAccNm() +
               "\nAccount Type: Savings\nBalance: " + getAccBal() + "\nIs Salaried: " + isSalaried;
    }
}

