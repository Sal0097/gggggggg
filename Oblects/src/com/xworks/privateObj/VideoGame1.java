package com.xworks.privateObj;

public class VideoGame1 {

    private String genre;
    private double cost;
    private double gameSize;
    private String name;

     VideoGame1(String genre, double cost,double gameSize, String name){
         this.cost = cost;
         this.gameSize=gameSize;
         this.genre=genre;
         this.name=name;
    }
    public void display(){
         System.out.println("The name of the game: "+ name );
        System.out.println("The genre is: "+ genre );
        System.out.println("The Game size in GB: "+ gameSize );
        System.out.println("The cost of game: "+ cost );
    }
}
