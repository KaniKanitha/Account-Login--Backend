package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Account {
    @Id
    private int CardId;
    private String CardName;
    private int CardNumber;
    private int DepositAmount;
    private int WithdrawAmount;
    public Account(int cardId, String cardName, int cardNumber, int depositAmount, int withdrawAmount) {
        CardId = cardId;
        CardName = cardName;
        CardNumber = cardNumber;
        DepositAmount = depositAmount;
        WithdrawAmount = withdrawAmount;
    }
    public int getCardId() {
        return CardId;
    }
    public void setCardId(int cardId) {
        CardId = cardId;
    }
    public String getCardName() {
        return CardName;
    }
    public void setCardName(String cardName) {
        CardName = cardName;
    }
    public int getCardNumber() {
        return CardNumber;
    }
    public void setCardNumber(int cardNumber) {
        CardNumber = cardNumber;
    }
    public int getDepositAmount() {
        return DepositAmount;
    }
    public void setDepositAmount(int depositAmount) {
        DepositAmount = depositAmount;
    }
    public int getWithdrawAmount() {
        return WithdrawAmount;
    }
    public void setWithdrawAmount(int withdrawAmount) {
        WithdrawAmount = withdrawAmount;
    }
    public Account() {
    }
}