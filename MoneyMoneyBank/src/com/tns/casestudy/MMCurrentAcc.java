package com.tns.casestudy;

public class MMCurrentAcc extends CurrentAcc {
    private float creditLimit;
    
    public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
        super(accNo, accNm, accBal);
        this.creditLimit = creditLimit;
    }
    
    // Lazy initialization 
    public float getCreditLimit() {
    	if (creditLimit == 0) {
            creditLimit = 50000.0f;
        }
        return creditLimit;
    }
    
    @Override
    public void withdraw(float amount) {
    	if (amount > creditLimit + getAccBal()) {
            System.out.println("Minimum balance must be maintained.");
        }
    	else {
        	setAccBal(getAccBal() - amount);
        	System.out.println("Withdrawal successful.");
        }
    }
    
    @Override
    public String toString() {
    	return "Current Acc-> "+"Account Number: " + getAccNo() + ", Account Name: " + getAccNm() + ", Account Balance: " 
              + getAccBal() + ", Credit Limit: " + creditLimit;
    }
}

