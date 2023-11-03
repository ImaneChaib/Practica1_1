/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1_1;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;//for Document
import org.w3c.dom.Document;
import java.util.*;
import java.io.*;//clase File
public class AccesoDOM {
Document doc;
public int abriXMLaDOM (File f){
    
try{
System.out.println("Abriendo archivo XML file y generando DOM....");



DocumentBuilderFactory factory =
DocumentBuilderFactory.newInstance();


factory.setIgnoringComments(true);
factory.setIgnoringElementContentWhitespace(true);


DocumentBuilder builder=factory.newDocumentBuilder();
doc=builder.parse(f);

System.out.println("DOM creado con éxito.");
return 0;//si el método funciona
}catch(Exception e){
System.out.println(e);
return -1;//if the method aborta en algún punto
}
}

   
}//fin clase
