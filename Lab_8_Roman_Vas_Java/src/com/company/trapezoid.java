package com.company;

public class trapezoid extends quadrangle {

    public static void main(String[] args) {

    }


    @Override
    public void CreatPoint() {
        while (true) {
            super.CreatPoint();
            if (IsTrapetia()) {
                SL();
                break;
            }
        }
    }

    private Boolean IsTrapetia() {
        if (cory[0] == cory[1] && cory[2] == cory[3]) {
            return true;
        } else {
            return false;
        }
    }

    public float OL1() {
        return (float) Math.sqrt(Math.pow((double) corx[0] - (double) corx[1], 2) + Math.pow((double) cory[0] - (double) cory[1], 2));
    }

    public float OL2() {
        return (float) Math.sqrt(Math.pow((double) corx[2] - (double) corx[3], 2) + Math.pow((double) cory[2] - (double) cory[3], 2));
    }

    public float SL() {
        return (OL1() + OL2()) / 2;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Основа трапеції 1 >> " + OL1());
        System.out.println("Основа трапеції 2 >> " + OL2());
        System.out.println("Середня лінія трапеції >> " + SL()+"\n");

    }


}
