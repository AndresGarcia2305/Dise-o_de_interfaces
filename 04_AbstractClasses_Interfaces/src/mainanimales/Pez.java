/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainanimales;

/**
 *
 * @author ANDRES
 */
public class Pez extends Animal implements Nadador{

    public Pez(String nombre, int edad) {
        super(nombre, edad);
    }

        @Override
    public String hacerSonido(){
        String sonido="";
        return sonido;
    }
    
    @Override
   public void nadar(){
       System.out.println("El pez nada entre las algas");
   }
}
