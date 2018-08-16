
package uesocc.edu.sv.ingenieria.prn335.leertexto;

import java.util.List;

/**
 *
 * @author stany
 */
public class Lamain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // leer txt
        
        lerxd a = new lerxd();
        
        List<String> s1=a.leertxt("/home/stany/PlacasGuia2");
        
        System.out.println(s1);
    }
    
}
