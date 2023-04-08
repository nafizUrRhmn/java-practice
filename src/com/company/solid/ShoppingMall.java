package com.company.solid;

public class ShoppingMall {

    private BankCardService bankCardService;
    ShoppingMall(BankCardService bankCardService){
        this.bankCardService =bankCardService;
    }
    void buyingStaff(Long price){
        bankCardService.doTransaction(price);
        System.out.println("Transaction complete");
    }


    public static void main(String args[]){
        BankCardService bankCardService = new CreditCard();
        ShoppingMall shoppingMall = new ShoppingMall(bankCardService);
        shoppingMall.buyingStaff(5000L);

    }
}
