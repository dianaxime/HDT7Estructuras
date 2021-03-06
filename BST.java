/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package hdt7;

import java.text.Collator;

/**
 *
 * @author DIANA
 */

//Fatima Albeño 18060
//Diana de Leon 18607

// Implementacion del Binary Search Tree
//Unicamente metodos de buscar, insertar e in-order
//Referencias de:
//https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
//http://www.java67.com/2016/08/binary-tree-inorder-traversal-in-java.html

public class BST {
     
    Nodo root; 
    Collator comparador = Collator.getInstance();
    
    
    BST() {  
        root = null;  
    } 
  
    public void insertar(String key, String val) { 
       root = insertarRec(root, key, val); 
    } 
      
    //funcion recursiva para insertar
    public Nodo insertarRec(Nodo root, String key, String val) { 
        comparador.setStrength(Collator.SECONDARY);
        
        //Si esta vacio crea la raiz 
        if (root == null) { 
            root = new Nodo(key, val); 
            return root; 
        } 
  
        // Si no recorrer el arbol buscando 
        if (comparador.compare(key, root.key)<0){
            root.left = insertarRec(root.left, key, val); 
        } else if (comparador.compare(key,root.key)>0) 
            root.right = insertarRec(root.right, key, val); 
  
        //Devuelve la raiz sin modificarse
        return root; 
    } 
    public  void inorder()  { 
       inorderRec(root); 
    } 
    public void inorderRec(Nodo root) { 
        if (root != null) { 
            inorderRec(root.left); 
            Main.jTextArea1.append(root.data() + "\n"); 
            inorderRec(root.right); 
        } 
    } 
    // busca el item correspondiente
    public String buscar(String item){
        return busqueda(root, item).getvalue();
    }
    //utiliza recursion para encontrar el item
    public Nodo busqueda(Nodo root, String item) { 
        comparador.setStrength(Collator.SECONDARY);
        if (root==null || comparador.compare(root.key,item)==0 ) {
            return root;
        } else if (comparador.compare(root.key ,item)>0){
            return busqueda(root.left, item);
        }
        else{
            return busqueda(root.right, item);
        } 
    } 
    // busca el item correspondiente
    public boolean existe(String item){
        Nodo a = existir(root, item);
        if (a==null){
            return false;
        }
        return true;
    }
    //utiliza recursion para encontrar el item
    public Nodo existir(Nodo root, String item) { 
        comparador.setStrength(Collator.SECONDARY);
        if (root==null || comparador.compare(root.key,item)==0 ) {
            return root;
        } else if (comparador.compare(root.key ,item)>0){
            return busqueda(root.left, item);
        }
        else{
            return busqueda(root.right, item);
        } 
    } 
}
