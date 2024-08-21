package com.xworks.privateObj;

public class Garland {

    private String size;
    private double cost;
    private String name;

    Garland(String size, double cost, String name){
        this.cost = cost;
        this.size= size;
        this.name=name;
    }
    public void display(){
        System.out.println("The name: "+ name );
        System.out.println("The size is: "+ size );
        System.out.println("The cost:  "+ cost );
    }
}

