/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica1_1;

import java.io.File;

/**
 *
 * @author IMANE
 */
public class Practica1_1 {

    public static void main(String[] args) {
        
        AccesoDOM a= new AccesoDOM();
        File f=new File("Libros.xml");
        a.abriXMLaDOM ( f);
    }
}
