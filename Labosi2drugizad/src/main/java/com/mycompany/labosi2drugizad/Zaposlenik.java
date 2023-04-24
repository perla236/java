/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labosi2drugizad;

/**
 *
 * @author Lovro
 */
public class Zaposlenik {
    private int staz;
    private int starost;
    private int placa;

    public Zaposlenik(int staz, int starost, int placa) {
        this.staz = staz;
        this.starost = starost;
        this.placa = placa;
    }

    public int getStaz() {
        return staz;
    }

    public void setStaz(int staz) {
        this.staz = staz;
    }

    public int getStarost() {
        return starost;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }
    
    static void racun(Zaposlenik Lovro){
        int placaLovro = Lovro.getPlaca();
        int stazLovro = Lovro.getStaz();
        int starostLovro = Lovro.getStarost();
        
        int izracun = placaLovro*(stazLovro*12);
        
        System.out.println(izracun);
        
        
        
     }
    
    public void zbroj (){
        int suma = placa*(staz*12);
        System.out.println(suma);
    
    }
}
