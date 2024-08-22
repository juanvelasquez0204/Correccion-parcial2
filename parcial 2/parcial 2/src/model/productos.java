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
public abstract class productos{
    
    protected String tipo;

    public productos(String tipo) {
        this.tipo = tipo;
    }   
    public void getItems(){
        ItemDAO itemDao = new ItemDAO();
        itemDao.listItems();
    }
    
   
    
    
    public abstract int añadir();
    public abstract int mostrar(); 

}
