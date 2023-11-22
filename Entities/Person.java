package Entities;

import exceptions.BusinessException;

import java.util.Date;
public abstract class Person {
    protected String name;
    protected Double balance;
    protected Double withdrawLimit;

    public Person(String name, Double balance, Double withdrawLimit) {
        this.name = name;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amountDeposit) {
        balance += amountDeposit;
        System.out.printf("R$ %.2f depositado com sucesso!%n", amountDeposit);;
    }

    public void withdraw(double amountWithdraw) {
        validateWithdraw(amountWithdraw);
        balance -= amountWithdraw;
        System.out.printf("R$ %.2f sacado com sucesso!%n", amountWithdraw);;
    }

    private void validateWithdraw (double amountWithdraw) {
        if (amountWithdraw > getWithdrawLimit()) {
            throw new BusinessException("Erro de saque. A quantia excede o limite de saque!");
        }
        if (amountWithdraw > balance) {
            throw new BusinessException("Erro de saque. Saldo insuficiente!");
        }
    }

    public abstract String data();
}



