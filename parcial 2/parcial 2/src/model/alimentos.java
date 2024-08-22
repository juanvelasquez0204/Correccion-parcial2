/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import access.ItemDAO;

/**
 *
 * @author USUARIO
 */
public class alimentos extends productos{
    
    

    public alimentos(String nombre, double precio, String alimentos) {
        super(alimentos);
   
        
       
    }
     

    

     @Override
    public int añadir() {
       throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void getItems(){
        ItemDAO itemDao = new ItemDAO();
        itemDao.listItems();
    }
    
}
