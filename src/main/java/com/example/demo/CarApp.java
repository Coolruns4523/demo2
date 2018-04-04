package com.example.demo;

import java.util.Scanner;

public class CarApp {

        public static void main (String[] args)
        {
            Scanner scan=new Scanner(System.in);

            Car c = new Car();
            System.out.println("Enter your car model: ");
            scan.nextLine();
            c.setModelName("Porche");

            System.out.println("Enter in car color:");
            scan.nextLine();
            c.setColor("red");
            c.setSpeed(20);

            System.out.println("Enter in amount of acceleration");
            c.accelerate(scan.nextInt());

            print(c.start());
            print(String.valueOf(c.getSpeed()));


            print(c.stop());
            print("This car is "+ c.getColor()+" and the model is "+ c.getModelName());
        }
        private static void print(String s){
            System.out.println(s);
        }
    }


