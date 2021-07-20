/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author Usuario
 */
public class Chaveiro implements LojaGibe{

    @Override
    public void print() {
        System.out.println("Chaveiro");
        System.out.println("R$:5,00");
    }
    
}
