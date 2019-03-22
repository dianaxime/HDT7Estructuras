/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt7;

/**
 *
 * @author DIANA
 */
//Fatima Albeño 18060
//Diana de Leon 18607


//Clase Nodo que almacena la "clave" y su "significaado"
public class Nodo {
    String key;
    String value;
    Nodo left, right; 
  
    public Nodo(String item, String val) { 
        key = item; 
        value = val;
        left = right = null; 
    } 
    public String getkey (){
        return this.key;
    }
    
    public String getvalue(){
        return this.value;
    }
    
    public String data(){
        return this.key + ": "+ this.value;
    }
}
