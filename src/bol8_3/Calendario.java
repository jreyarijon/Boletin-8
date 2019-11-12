/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol8_3;

/**
 *
 * @author Josemolamazo
 */
public class Calendario {
    private int mes;
    
    public Calendario(){
        
    }
    public Calendario(int mes){
        this.mes = mes;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public int getMes(){
        return mes;
    }
    public void dias(){
        switch(mes){
            case 1: System.out.println("31 días");
            break;
            case 2: System.out.println("28 días");
            break;
            case 3: System.out.println("31 días");
            break;
            case 4: System.out.println("30 días");
            break;
            case 5: System.out.println("31 días");
            break;
            case 6: System.out.println("30 días");
            break;
            case 7: System.out.println("31 días");
            break;
            case 8: System.out.println("31 días");
            break;
            case 9: System.out.println("30 días");
            break;
            case 10: System.out.println("31 días");
            break;
            case 11: System.out.println("30 días");
            break;
            case 12: System.out.println("31 días");
            break;
        }
    }
}
