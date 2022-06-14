package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.print("введіть номер завдання >> ");
        int x = sc.nextInt();


        if (x == 1) {
            Task1();
        }
        if (x == 2) {
            Task2();
        }
    }
    public static void Task1(){
        quadrangle Quad1 = new quadrangle();

        System.out.println("////////////////////////// \n  Інформація 1 чотирикутника >>");
        Quad1.CreatPoint();
        Quad1.PointInfo();
        Quad1.getInfo();


        File myFile = new File("Quader.txt");

        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(myFile)));
            writer.println(

                            "//////////////////////////   Інформація 2 чотирикутника >>\n"+
                            "сторона 1 >> "  + Quad1.L1()+ " cm\n"+
                            "сторона 2 >> "  + Quad1.L2() + " cm\n"+
                            "сторона 3 >> "  + Quad1.L3() + " cm\n"+
                            "сторона 4 >> "  + Quad1.L4() + " cm\n"+
                            "Діагональ 1 >>" + Quad1.D1() + " cm\n"+
                            "Діагональ 2 >>" + Quad1.D2() + " cm\n"+
                            "Периметр >>"    + Quad1.P() + " cm \n"
            );
            writer.flush();
            writer.close();
        } catch (
                IOException ex) {
            ex.printStackTrace();
        }
    }


    public  static  void Task2(){

        trapezoid Trapez1 = new trapezoid();

        System.out.println("трапеція 1");
        Trapez1.CreatPoint();
        Trapez1.getInfo();
        File myFile = new File("Trapez.txt");

        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(myFile)));
            writer.println(

                    "//////////////////////////   Інформація 1 трапеції >>\n"+
                            "сторона 1 >> "  + Trapez1.L1()+ " cm\n"+
                            "сторона 2 >> "  + Trapez1.L2() + " cm\n"+
                            "сторона 3 >> "  + Trapez1.L3() + " cm\n"+
                            "сторона 4 >> "  + Trapez1.L4() + " cm\n"+
                            "Діагональ 1 >>" + Trapez1.D1() + " cm\n"+
                            "Діагональ 2 >>" + Trapez1.D2() + " cm\n"+
                            "Периметр >>"    + Trapez1.P() + " cm \n"+
                            "Основа 1 >>"    + Trapez1.OL1() + " cm \n"+
                            "Основа 2 >>"    + Trapez1.OL2() + " cm \n"+
                            "Середня лінія >>"    + Trapez1.SL() + " cm \n"
            );
            writer.flush();
            writer.close();
        } catch (
                IOException ex) {
            ex.printStackTrace();
        }
    }
}

