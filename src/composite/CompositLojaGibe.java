/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class CompositLojaGibe implements LojaGibe{
    
    private List<LojaGibe>comprasLoja = new ArrayList<LojaGibe>();
    
    @Override
    public void print(){
        for(LojaGibe lojaGibe : comprasLoja){
            lojaGibe.print();
        }
    }
    
    public void add(LojaGibe lojaGibe){
        comprasLoja.add(lojaGibe);
    }
    
    public void remove(LojaGibe lojaGibe){
        comprasLoja.remove(lojaGibe);
    }
}
