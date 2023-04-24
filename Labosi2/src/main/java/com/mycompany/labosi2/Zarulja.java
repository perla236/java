/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labosi2;

/**
 *
 * @author Lovro
 */
public class Zarulja {
    private boolean Stanje; 


    Zarulja(){
        Stanje = false;

}

public void PritisniPrekidac(){
    if (Stanje == false){
    
    Stanje = true;
}
    else {
    Stanje = false;
    }
}

    public void Provjeri(){
    
    if (Stanje == false){
    
    System.out.println("Mrak je");
}
    else {
    
    System.out.println("Svjetli");
    }
    
    }

}
