package com.my.javapractise.java9;

public class CustomerA implements OnlinePaymentMode , OfflinePaymentMode{

    public static void main(String[] args) {
        CustomerA c1 = new CustomerA();
        c1.UPIPayment(500);
        c1.walletPaymnet(500);

        CustomerA c2 = new CustomerA();
        c2.cardPayment(1000);
    }
}
