/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainanimales;

/**
 *
 * @author ANDRES
 */
public class MainAnimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro p1=new Perro("Bobby",4);
        Gato g1=new Gato("Michu",7);
        Pajaro pj1=new Pajaro("Manuel",3);
        Pez pz1=new Pez("Nemo",2);
        
        System.out.println("Perro: ");
        System.out.println(p1.toString());
        System.out.println("Sonido del perro: "+p1.hacerSonido());
        
        System.out.println("Gato: ");
        System.out.println(g1.toString());
        System.out.println("Sonido del gato: "+g1.hacerSonido());
        
        System.out.println("Pajaro: ");
        System.out.println(pj1.toString());
        System.out.println("Sonido del pajaro: "+pj1.hacerSonido());
        pj1.volar();
        
        System.out.println("Pez: ");
        System.out.println(pz1.toString());
        System.out.println("Sonido del pez: "+pz1.hacerSonido());
        pz1.nadar();
    }
    
}
