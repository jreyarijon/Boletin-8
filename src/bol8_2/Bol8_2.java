/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol8_2;

import java.util.Scanner;

/**
 *
 * @author jreyarijon
 */
public class Bol8_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tenda artigo = new Tenda();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Teclee unidades vendidas: ");
        artigo.setUnidades(sc.nextInt());
        System.out.println("Teclee prezo unitario: ");
        artigo.setPrecio(sc.nextFloat());
        
        artigo.desconto();
        
    }
}
