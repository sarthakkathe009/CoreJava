package com.tns.casestudy;

public abstract class BankAcc {
    private final int accNo;
    private String accNm;
    private float accBal;
    
    
	public BankAcc(int accNo, String accNm, float accBal) {
        this.accNo = accNo;
        this.accNm = accNm;
        this.accBal = accBal;
    }
    
    public int getAccNo() {
        return accNo;
    }
    
    public String getAccNm() {
        return accNm;
    }
    
    public void setAccNm(String accNm) {
        this.accNm = accNm;
    }
    
    public float getAccBal() {
        return accBal;
    }
    
    public void setAccBal(float accBal) {
		this.accBal = accBal;
	}

    public void deposite(float amt) {
        accBal += amt;
    }
    
    public abstract void withdraw(float amt);
    
    @Override
    public String toString() {
        return "BankAcc{" + "accNo=" + accNo + ", accNm='" + accNm + '\'' + ", accBal=" + accBal + '}';
    }
}

