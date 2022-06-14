package com.company;

import java.util.ArrayList;

public class Storage {

    private ArrayList<quadrangle> quadr = new ArrayList<quadrangle>();
    private ArrayList<trapezoid> trapez = new ArrayList<trapezoid>();

    public void savedataQ(ArrayList<quadrangle> quadr) {
        this.quadr = (ArrayList<quadrangle>) quadr.clone();
    }

    public ArrayList<quadrangle> loaddataQ() {
        return quadr;
    }

    public void savedataT(ArrayList<trapezoid> trapez) {
        this.trapez = (ArrayList<trapezoid>) trapez.clone();
    }

    public ArrayList<trapezoid> loaddataT() {
        return trapez;
    }
/*///////////////////////////*/
    public quadrangle searchByIndex(int index) {
        if (index < 0 || index >= quadr.toArray().length) {
            System.out.println("nepravilniu index");
            return null;
        }
        return quadr.get(index);
    }

    public quadrangle searchByData(quadrangle dat) {
        for (int i = 0; i < quadr.toArray().length; i++) {
            if (quadr.get(i) == dat) {
                return quadr.get(i);
            }
        }
        System.out.println("nemae danux");
        return null;
    }
    /*
    public quadrangle searchByPer(float P){
        for (int i = 0; i < quadr.toArray().length; i++) {
            if (quadr.get(i).P() == P) {
                return quadr.get(i);
            }
        }
        System.out.println("nemae danux z takim perimetrom");
        return null;
    }

    public  void ShowInfo(){
        for (int i = 0; i < quadr.toArray().length; i++) {
            if (quadr.get(i) instanceof trapezoid) {
                System.out.println("Trapezoid info from list");
                ((trapezoid)quadr.get(i)).getInfo();
            }
            else {
                System.out.println("Quadroid info from list");
                quadr.get(i).getInfo();
            }
        }
    }
    */

    public void AddDataQ(quadrangle quadr) {
        this.quadr.add(quadr);
    }

    public void AddDataT(trapezoid trapez){
        this.trapez.add(trapez);
    }
}
