
package uesocc.edu.sv.ingenieria.prn335.leertexto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stany
 */
public class lerxd {
    
    public List<String> leertxt(String direccion){
        
        String texto="";
        List<String> ejemplo= new ArrayList<>();
        try{
        BufferedReader bf=new BufferedReader(new FileReader(direccion));
        String temp="";
        String bfRead;
        while((bfRead = bf.readLine()) != null){
        //bulce mientras se lee lon datos
        ejemplo.add(temp= temp+bfRead);
        //guardar el texto del archivo
        }
        ejemplo.size();
        texto=temp;
        
        }catch(Exception e){
        System.out.println("No se encontro archivo");
        }
    
   return ejemplo;
    }
    
}
