package com.alex;

public class Main {

    public static void main(String[] args) {
	for(int i=8; i>1; i--){
        System.out.println(calculateInterest(i,10000));



    }
    }
public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));




}



}





