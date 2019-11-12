/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol8_3;

import java.util.Scanner;

/**
 *
 * @author Josemolamazo
 */
public class Bol8_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendario año = new Calendario();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Teclee el mes(número):");
        año.setMes(sc.nextInt());
        
        año.dias();
        
    }
    
}
