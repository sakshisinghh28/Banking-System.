package bank.business.impl;

import bank.business.AccountOperationService;
import bank.business.domain.AccountType;
import bank.business.domain.BankAccount;
import bank.business.domain.Transaction;
import bank.data.Database;

import java.util.ArrayList;
import java.util.List;

public class AccountOperationServiceImpl implements AccountOperationService {

    private final Database database;

    public AccountOperationServiceImpl(Database database) {
        this.database = database;
    }

    @Override
    public int getBalance(long accountNumber) {
        BankAccount account = database.getAccount(accountNumber);
        if (account != null) {
            return account.getBalance();
        }
        throw new IllegalArgumentException("Account number not found.");
    }

    @Override
    public void deposit(long accountNumber, int amount) {
        BankAccount account = database.getAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
            account.addTransaction(new Transaction("Deposit", amount));
        } else {
            throw new IllegalArgumentException("Account number not found.");
        }
    }

    @Override
    public void withdraw(long accountNumber, int amount) {
        BankAccount account = database.getAccount(accountNumber);
        if (account != null) {
            if (account.withdraw(amount)) {
                account.addTransaction(new Transaction("Withdrawal", amount));
            } else {
                throw new IllegalStateException("Insufficient balance or withdrawal amount exceeds limit.");
            }
        } else {
            throw new IllegalArgumentException("Account number not found.");
        }
    }

    @Override
    public List<Transaction> getTransactionHistory(long accountNumber) {
        BankAccount account = database.getAccount(accountNumber);
        if (account != null) {
            return account.getTransactions();
        }
        throw new IllegalArgumentException("Account number not found.");
    }

    @Override
    public void addAccount(long accountNumber, AccountType accountType) {
        if (database.getAccount(accountNumber) == null) {
            database.addAccount(new BankAccount(accountNumber, accountType));
        } else {
            throw new IllegalArgumentException("Account number already exists.");
        }
    }

    @Override
    public void deleteAccount(long accountNumber) {
        if (database.getAccount(accountNumber) != null) {
            database.deleteAccount(accountNumber);
        } else {
            throw new IllegalArgumentException("Account number not found.");
        }
    }
}
