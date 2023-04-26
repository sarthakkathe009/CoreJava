package com.tns.casestudy;

public abstract class CurrentAcc extends BankAcc {
    private final float creditLimit;
    
    public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
        super(accNo, accNm, accBal);
        this.creditLimit = creditLimit;
    }
    
    // Lazy initialization 
    public CurrentAcc(int accNo, String accNm, float accBal) {
        super(accNo, accNm, accBal);
        this.creditLimit = 0;
    }
    
    public float getCreditLimit() {
        return creditLimit;
    }

    @Override
    public void withdraw(float amt) {
        if (amt <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amt > getAccBal() + creditLimit) {
            System.out.println("Withdrawal amount exceeds balance");
        } else {
        	setAccBal(getAccBal() - amt);
        	System.out.println("Withdrawal successful");
        }
    }
    
    @Override
    public String toString() {
        return "Current Acc-> "+"Account Number: " + getAccNo() + ", Account Name: " + getAccNm() + ", Account Balance: " + getAccBal() + ", Credit Limit: " + creditLimit;
    }
}

