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
public class Nodo {
    String key;
    String value;
    Nodo left, right; 
  
    public Nodo(String item, String val) { 
        key = item; 
        value = val;
        left = right = null; 
    } 
}
