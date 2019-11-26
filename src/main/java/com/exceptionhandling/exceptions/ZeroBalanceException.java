package main.java.com.exceptionhandling.exceptions;

public class ZeroBalanceException extends BalanceException{

    private static final String ZERO_BALANCE_MESSAGE = "Your current balance is zero. Nothing to withdraw..........";

    public ZeroBalanceException(){
        super(ZERO_BALANCE_MESSAGE);
    }

}
