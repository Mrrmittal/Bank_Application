package com.bankapplication.Bank_Application.Service.ServiceImpl;

import com.bankapplication.Bank_Application.Entity.BankInfo;
import com.bankapplication.Bank_Application.Service.Process;

import java.util.Scanner;

public class ProcessImpl implements Process {
    Scanner sc = new Scanner(System.in);
    static BankInfo bankInfo = new BankInfo();

    static {
        bankInfo.setAccType("Savings");
        bankInfo.setAccNumb("2050101025257");
        bankInfo.setUserName("Jatin Mittal");
        bankInfo.setBalance(500000);
        bankInfo.setIfsc("CANB00001");
    }


    @Override
    public void openAccount() {
//      Open a new Account
        System.out.println("Enter Account Type :: ");
        bankInfo.setAccType(sc.nextLine());
        System.out.println("Enter Account Number :: ");
        bankInfo.setAccNumb(sc.nextLine());
        System.out.println("Enter Account User Name ::");
        bankInfo.setUserName(sc.nextLine());
        System.out.println("Enter Account Balance ::");
        bankInfo.setBalance(sc.nextInt());
        System.out.println("Enter Ifsc Code :: ");
        bankInfo.setIfsc(sc.nextLine());

//      Account Details of user
        System.out.println("Your Account Details is ::");
        System.out.println("Account Type :: " +bankInfo.getAccType());
        System.out.println("Account Number :: " +bankInfo.getAccNumb());
        System.out.println("Account Username :: " +bankInfo.getUserName());
        System.out.println("Account Balance :: " +bankInfo.getBalance());
        System.out.println("Account Ifsc Code :: " +bankInfo.getIfsc());

    }

    @Override
    public void demoAccount() {
        System.out.println("Demo Account Details :: ");
        System.out.println("Demo Account Type  :: Savings");
        System.out.println("Demo Account Number :: 20500000010");
        System.out.println("Demo Account Username :: Demo User");
        System.out.println("Demo Account Balance :: 50000");
        System.out.println("Demo Account Ifsc :: CRNB00001");
    }

    @Override
    public void deposit() {
        System.out.println("Enter the Amount you want to deposit :: ");
        long deposit = sc.nextLong();
        Long amount = bankInfo.getBalance()+deposit;
        bankInfo.setBalance(amount);
        System.out.println("Amount "+deposit+ " credit into the account " +bankInfo.getAccNumb());
        System.out.println("Current Balance is :: " +bankInfo.getBalance());

    }

    @Override
    public void withdraw() {
        System.out.println("Enter the Amount you want to withdraw :: ");
        long withdraw = sc.nextLong();
        if(withdraw< bankInfo.getBalance()){
            Long amount = bankInfo.getBalance()-withdraw;
            bankInfo.setBalance(amount);
            System.out.println("Amount "+withdraw+ " credit into the account " +bankInfo.getAccNumb());
            System.out.println("Current Balance is :: " +bankInfo.getBalance());
        }else {
            System.out.println("Insufficient Balance");
        }

    }

    @Override
    public void checkBalance() {
        System.out.println("Your Account Type is           :: " +bankInfo.getAccType());
        System.out.println("Your Account Number is         :: " + bankInfo.getAccNumb());
        System.out.println("Your Account Username is       :: " + bankInfo.getUserName());
        System.out.println("Your Account Balance is        :: " + bankInfo.getBalance());
        System.out.println("Your Account Ifsc Code is      :: " + bankInfo.getIfsc());
        System.out.println("THANKS FOR BALANCE CHECKING ");
    }
}
