package com.tns.casestudy;

public class MMSavingAcc extends SavingAcc {
    private static final float MINBAL = 1000.0f;

    public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
        super(accNo, accNm, accBal, isSalaried);
    }

    @Override
    public void withdraw(float amt) {
        if (getAccBal() - amt < MINBAL) {
            System.out.println("Minimum balance must be maintained.");
        } else {
        	setAccBal(getAccBal() - amt);
        	System.out.println("Withdrawal successful.");
        }
    }

    @Override
    public String toString() {
        return "Saving Acc-> "+"Acc Number: " + getAccNo() + ", Acc Name: " + getAccNm() + ", Acc Balance: " + getAccBal() + 
        		", Salaried=" + isSalaried();
    }
}

