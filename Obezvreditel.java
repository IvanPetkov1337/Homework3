package com.company;
import java.util.Scanner;
import  java.util.Random;


/*The buyer of this product lives in a village that has a lot of rats and mice and he need a robot that can be permanently ON and deal with them. If our brave robot
Obezvreditel2.0 doesn't do his job right , the poor guy will lose most of his Kompoti to the evil rats. Obezvreditel2.0 does not give up, even if he kills all the plague going around!*/

public class Obezvreditel {

    static int Battery = 4;

    public static void main(String[] args) {
        while (Battery > 0) {
            Movement();
            FightingSystem();
            Communication();
            System.out.print( "Battery level is: " + Battery + "\n");
        } System.out.println( "Obezvreditel2.0 ran out of batteries, time to recharge" + "\n" ); Charger();

    }

    public static void Movement() {
        System.out.print("Enter object: Chair/Wall/Nothing :" + "\n");
        Scanner ScanObject = new Scanner(System.in);
        String Object = ScanObject.nextLine();
        if (Object.equals("Chair") || Object.equals("Wall") || Object.equals("Nothing")) {
            switch (Object) {
                case "Chair":
                    System.out.print("Obezvreditel2.0 encountered " + Object + " uses Jump to get over it" + "\n" );
                    break;
                case "Wall":
                    System.out.print("Obezvreditel2.0 encountered " + Object + " goes Sideways to get around  it" + "\n" );
                    break;
                case "Nothing":
                    System.out.print("Obezvreditel2.0 encountered " + Object + "  continue walking Forward" + "\n" );
                    break;
            }
        } else{
            System.out.print("Invalid object" + "\n");
            Movement();
        }

    }

    public static void FightingSystem() {

        System.out.print( "Number of pixels : " + "\n");
        Scanner ScanPixels = new Scanner(System.in);
        int Pixels = ScanPixels.nextInt();
        if (Pixels % 2 == 0) {
            Battery--;
            Random HitRNG = new Random();
            int Hit = HitRNG.nextInt(10 + 1);


            if (Hit == 5) {
                System.out.print("Oops, seems like Obezvreditel2.0 was about to break all the furniture, fortunately he stops himself right before that happens" + "\n");
                Battery++;
            }
            else System.out.print("Obezvreditel2.0 successfully determined the mouse, YAY" + "\n" );


        } else System.out.print("No mouses found");

    }


    public static void Charger(){
        Random ChargeRNG = new Random();
        int ChargeChance1   = ChargeRNG.nextInt(1000 + 1);
        int ChargeChance2  = ChargeRNG.nextInt(1000 + 1);
        if ( ChargeChance1 > ChargeChance2){
            System.out.print("\n" + "Obezvreditel2.0 found a charger and successfully  recharged his batteries " + "\n"  );
            Battery = 4;
        }
        else if  ( ChargeChance1 == ChargeChance2) {
            System.out.print("Something magical happened, Obezvreditel2.0 got confused and has to retake his action"  + "\n");
            Charger();
        }

        else System.out.print("\n" + "Obezvreditel2.0 found a empty charger, no battery recharge for this bad boy. He won't give up and he'll try again !" + "\n"); Charger();




    }
    public static void Communication(){
        for(int i = 10; i > 0 ; i--){
            if (i%2 == 0) System.out.print("I am a Robottttt " + i + "\n" );
        }

    }


}
