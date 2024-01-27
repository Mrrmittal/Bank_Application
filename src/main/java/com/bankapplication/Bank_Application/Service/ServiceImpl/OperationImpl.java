package com.bankapplication.Bank_Application.Service.ServiceImpl;

import com.bankapplication.Bank_Application.Entity.BankInfo;
import com.bankapplication.Bank_Application.Service.Operation;

import java.security.Key;
import java.util.Scanner;

public class OperationImpl implements Operation {

    @Override
    public void bankInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("_________________________________________________________________________________________________________________________");
        System.out.println("*** Banking Application **** \n Please Choose your operation");
        System.out.println("_________________________________________________________________________________________________________________________");
        System.out.println("1. Create a new account");
        System.out.println("2. Check Balance");
        System.out.println("3. Deposit Amount");
        System.out.println("4. Withdraw Amount");
        System.out.println("5. Check Demo Account ");
        System.out.println("6. Exit");
        System.out.println("");
        System.out.println("Enter Your Choice :: ");

        int key = sc.nextInt();
        operation(key);
    }

    @Override
    public void operation(int key){
        Scanner sc = new Scanner(System.in);
        BankInfo bankInfo = new BankInfo();
        ProcessImpl process = new ProcessImpl();

        switch (key){
            case 1:
                System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
                process.openAccount();
                System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println();
                System.out.println("MAIN PAGE_:: PRESS 1 ::");
                if (sc.nextInt()==1)
                    bankInfo();
                break;

            case 2:
                System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
                process.checkBalance();
                System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("MAIN PAGE_:: PRESS 1 ::");
                if (sc.nextInt()==1)
                    bankInfo();
                break;

            case 3:
                System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
                process.deposit();
                System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println();
                System.out.println("MAIN PAGE_:: PRESS 1 ::");
                if (sc.nextInt()==1)
                    bankInfo();
                break;

            case 4:
                System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
                process.withdraw();
                System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println();
                System.out.println("MAIN PAGE_:: PRESS 1 ::");
                if (sc.nextInt()==1)
                    bankInfo();
                break;

            case 5:
                System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
                process.demoAccount();
                System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println();
                System.out.println("MAIN PAGE_:: PRESS 1 ::");
                if (sc.nextInt()==1)
                    bankInfo();
                break;

            case 6:
                System.out.println("THANKS FOR USING OUT BANK APPLICATION");
                break;
        }
    }
}
