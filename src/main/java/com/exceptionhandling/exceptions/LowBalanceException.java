package main.java.com.exceptionhandling.exceptions;

public class LowBalanceException extends BalanceException {

    private static final String LOW_BALANCE_MESSAGE = "Transaction unsuccessful.. Insufficient balance..........";

    public LowBalanceException(){
        super(LOW_BALANCE_MESSAGE);
    }
}
