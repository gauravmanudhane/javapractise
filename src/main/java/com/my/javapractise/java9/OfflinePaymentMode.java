package com.my.javapractise.java9;

public interface OfflinePaymentMode {
    default void UPIPayment(double amount) {
        System.out.println("please enter your upi for payment of rupees "+ amount);
        closePayment(); //code reusability
    }
    private String closePayment(){ //private method for code reusability
        return "cash recieved from customer payment closed";
    }

    default void cashPayment(double amount) {
        System.out.println("please provide cash for payment of rupees "+amount);
        closePayment(); //code reusability
    }
}
