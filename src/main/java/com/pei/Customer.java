package com.pei;

public class Customer {
    String id;
    int money;
    int discont;
    int cost;
    public Customer(String id, int money, int discont, int cost){
        this.id = id;
        this.money = money;
        this.discont = discont;
        this.cost = cost;
    }
    public void print(){
        String s = "";
        if (money<1000){
            s = " ";
            System.out.println(id + "\t" + money + s +"\t"+ discont + "\t\t" + cost);
        }
        else {
            System.out.println(id + "\t" + money + "\t" + discont + "\t\t" + cost);
        }
    }
}
