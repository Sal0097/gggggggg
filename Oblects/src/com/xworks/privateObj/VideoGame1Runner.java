package com.xworks.privateObj;

public class VideoGame1Runner {
    public static void main(String[] args){
        VideoGame1 game = new VideoGame1("FPS shooter",1500,75,"CS2");
        VideoGame1 game1 =new VideoGame1("FPS Shooter",3000,80,"Call of Duty") ;
        VideoGame1 game2 = new VideoGame1("RPG",1580,25,"SimCity");
        VideoGame1 game3 = new VideoGame1("Stealth",600,95,"Hitman") ;
        VideoGame1[] arry ={game,game1,game2,game3};

        for(int i=0; i< arry.length;i++){
            System.out.println("the loop index is in: "+i);
            VideoGame1 ref  = arry[i];
            ref.display();
        }
        System.out.println("------------------------------------------------------------------------------------------------------------");
        Garland gar = new Garland("large",90,"Yellow garland");
        Garland gar1 = new Garland("large",90,"Red garland");
        Garland gar2 = new Garland("small",30,"Yellow garland");
        Garland[] arry1 ={gar,gar1,gar2,};

        for(int i=0; i< arry1.length;i++){
            System.out.println("the loop index is in: "+i);
            Garland ref  = arry1[i];
            ref.display();
        }
        System.out.println("------------------------------------------------------------------------------------------------------------");
        GiantWheel gia = new GiantWheel("large",90,"Yellow GiantWheel");
        GiantWheel gia1 = new GiantWheel("large",90,"Red GiantWheel");
        GiantWheel gia2 = new GiantWheel("small",30,"Yellow GiantWheel");
        GiantWheel[] arry2 ={gia,gia1,gia2,};

        for(int i=0; i< arry1.length;i++){
            System.out.println("the loop index is in: "+i);
            GiantWheel ref  = arry2[i];
            ref.display();
        }
        System.out.println("------------------------------------------------------------------------------------------------------------");
        Banner ban = new Banner("large",90,"Yellow GiantWheel");
        Banner ban1 = new Banner("large",90,"Red GiantWheel");
        Banner ban2 = new Banner("small",30,"Yellow GiantWheel");
        Banner[] arry3 ={ban,ban1,ban2,};

        for(int i=0; i< arry1.length;i++){
            System.out.println("the loop index is in: "+i);
            Banner ref  = arry3[i];
            ref.display();
        }
    }
}
