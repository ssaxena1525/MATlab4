package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class BankAccountTest {

    @Test
    public void testZeoInitialBalance(){
        BankAccount account = new BankAccount(0.0);
        assertEquals(0.0, account.getBalance());
    }
    
    @Test
    public void testDepositPositiveAmount(){
        BankAccount account = new BankAccount(100.0);
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance());
    }

    @Test
    public void testDepositNegativeAmount(){
        BankAccount account = new BankAccount(100.0);
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-50.0));
    }

    @Test
    public void testWithdrawPositiveAmount(){
        BankAccount account = new BankAccount(100.0);
        account.withdraw(30.0);
        assertEquals(70.0, account.getBalance());
    }

    @Test
    public void testWithdrawNegativeAmount(){
        BankAccount account = new BankAccount(100.0);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-20.));
    }

    @Test
    public void testWithdrawInsufficientAmount(){
        BankAccount account = new BankAccount(100.0);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(200.0));
    }
}
