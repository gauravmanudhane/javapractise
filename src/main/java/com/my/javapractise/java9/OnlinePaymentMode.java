package com.my.javapractise.java9;

public interface OnlinePaymentMode {
    //this method only belogs to interface
    private static String printInvoice(){ //private method acts as utility for static methods.
        return "invoice generated";
    }
    default void walletPaymnet(double amount) {
        System.out.println("please enter your upi for payment of rupees "+ amount);
    }

    default void cardPayment(double amount) {
        System.out.println("please enter your cardnumber, cvv and expirydate for payment of rupees "+amount);
    }
}
