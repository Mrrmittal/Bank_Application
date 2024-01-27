package com.bankapplication.Bank_Application.Entity;

/**
 * Project: Bank Application
 * Description: Console Based Project
 * Author: Jatin Mittal
 * Date: 28 jan 2024
*/

public class BankInfo {
    private String accType;
    private String userName;
    private String accNumb;
    private long balance;
    private String ifsc;

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAccNumb() {
        return accNumb;
    }

    public void setAccNumb(String accNumb) {
        this.accNumb = accNumb;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }
}
