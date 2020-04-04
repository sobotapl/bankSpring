package com.example.bank.models;

public class RequestForm {
    private int monthCash;
    private int minusCash;
    private int creditTime;
    private int creditCash;

    public RequestForm(int monthCash, int minusCash, int creditTime, int creditCash) {
        this.monthCash = monthCash;
        this.minusCash = minusCash;
        this.creditTime = creditTime;
        this.creditCash = creditCash;
    }

    public RequestForm() {}

    public int getMonthCash() {
        return monthCash;
    }

    public void setMonthCash(int monthCash) {
        this.monthCash = monthCash;
    }

    public int getMinusCash() {
        return minusCash;
    }

    public void setMinusCash(int minusCash) {
        this.minusCash = minusCash;
    }

    public int getCreditTime() {
        return creditTime;
    }

    public void setCreditTime(int creditTime) {
        this.creditTime = creditTime;
    }

    public int getCreditCash() {
        return creditCash;
    }

    public void setCreditCash(int creditCash) {
        this.creditCash = creditCash;
    }
}