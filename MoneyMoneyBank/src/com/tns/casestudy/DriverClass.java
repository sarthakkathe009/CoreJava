package com.tns.casestudy;

public class DriverClass {
    public static void main(String[] args) {
        System.out.println("MONEY MONEY BANK\n");
        
    	// a. Assign instance of MMBankFactory to BankFactory reference.
        BankFactory factory = new MMBankFactory();
        
        // b. Instantiate MMSavingAcc and refer it through reference SavingAcc.
        SavingAcc savingAcc = factory.getNewSavingAcc(1001, "Sarthak Kathe", 5000.0f, true);
        
        // c. Instantiate MMCurrentAcc and refer it through reference CurrentAcc.
        CurrentAcc currentAcc = factory.getNewCurrentAcc(2001, "Shreyash Kamankar", 10000.0f, 5000.0f);
        
        // d. Invoke withdraw() method.
        savingAcc.withdraw(2000.0f);
        currentAcc.withdraw(12000.0f);
        
        // e. Invoke toString() method
        System.out.println(savingAcc.toString());
        System.out.println(currentAcc.toString());
    }
}

