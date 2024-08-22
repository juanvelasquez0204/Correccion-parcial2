/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.FirebaseDatabase;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author afprietoa
 */
public class Facade {

   private static FirebaseDatabase firebaseDB = null;
    
    public static FirebaseDatabase getConnection(){
        try {
            if(firebaseDB == null){
            FirebaseOptions firebaseOptions = new FirebaseOptions.Builder()
                    .setDatabaseUrl("https://base-de-datos-parcial-d2196-default-rtdb.firebaseio.com/")
                    .setServiceAccount(new FileInputStream(new File("C:\\Users\\pipevelasquezj\\Documents\\NetBeansProjects\\parcial 2\\parcial 2/datos.json")))
                    .build();

            FirebaseApp.initializeApp(firebaseOptions);
            firebaseDB = FirebaseDatabase.getInstance();
            } 
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        
        return firebaseDB;
    }
    
    
}
