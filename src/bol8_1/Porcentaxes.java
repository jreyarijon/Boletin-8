/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol8_1;


/**
 *
 * @author jreyarijon
 */
public class Porcentaxes {
    private int cantidade;
    
    public Porcentaxes(){
        
    }
    public Porcentaxes(int cantidade){
        this.cantidade = cantidade;
    }
    public void setCantidade(int cantidade){
        this.cantidade=cantidade;
    }
    public int getCantidade(){
        return cantidade;
    }
    public void porcentaxe(int mais){
        cantidade = mais;
        if(cantidade < 500)
            System.out.println("Incremento do 50%"+"\nCantidad final = "+ (cantidade+(cantidade*50/100)));
        else if(cantidade < 1000)
            System.out.println("Incremento de 7%"+"\nCantidad final = "+ (cantidade+(cantidade*7/100)));
        else if(cantidade < 5000)
            System.out.println("Incremento de 15%"+"\nCantidad final = "+ (cantidade+(cantidade*15/100)));
        else 
            System.out.println("Decremento de 3%"+"\nCantidad final = "+(cantidade-(cantidade*3/100)));
        
    }
    
    
}
