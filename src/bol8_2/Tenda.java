/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol8_2;

/**
 *
 * @author jreyarijon
 */
public class Tenda {

    private float precio;
    private int unidades;

    public Tenda() {

    }

    public Tenda(float precio, int unidades) {
        this.precio = precio;
        this.unidades = unidades;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public int getUnidades() {
        return unidades;
    }

    public void desconto() {
        if (unidades < 100) {
            System.out.println("Sen descontos");
        } else if (unidades < 200) {
            if (precio > 4000) {
                System.out.println("Aplícase un desconto do 5%" + "\nTotal a pagar = " + (precio * unidades - (precio * 5 / 100)));
            } else {
                System.out.println("Aplícase un desconto do 2%" + "\nTotal a pagar = " + (precio * unidades - (precio * 2 / 100)));
            }
        } else if (unidades >= 200) {
            if (precio > 4000) {
                System.out.println("Aplícase un desconto do 10%" + "\nTotal a pagar = " + (precio * unidades - (precio * 10 / 100)));
            } else {
                System.out.println("Aplícase un desconto do 8%" + "\nTotal a pagar = " + (precio * unidades - (precio * 8 / 100)));
            }
        }
    }

}
