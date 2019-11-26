package main.java.com.exceptionhandling;

import main.java.com.exceptionhandling.exceptions.BalanceException;
import main.java.com.exceptionhandling.exceptions.LowBalanceException;
import main.java.com.exceptionhandling.exceptions.ZeroBalanceException;

import java.io.*;

public class App {

    private int totalAmount;

    public App(int totalAmount){
        this.totalAmount = totalAmount;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your amount :: ");
        String requestedAmount =reader.readLine();

        App app = new App(1000);

        try {
            app.totalAmount = app.balanceDeduction(Integer.parseInt(requestedAmount));
        }catch (ZeroBalanceException | LowBalanceException exception){
             System.out.println(exception.getLocalizedMessage());
        }finally {
            System.out.println("Account Balance :: " + app.totalAmount);
        }

    }

    private int balanceDeduction(int requested_money) throws BalanceException {

        if(totalAmount == 0 && requested_money > 0)
            throw new ZeroBalanceException();

        else if(requested_money > totalAmount)
            throw new LowBalanceException();

        return (totalAmount - requested_money);
    }
}
