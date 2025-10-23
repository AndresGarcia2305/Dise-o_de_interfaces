/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainanimales;

/**
 *
 * @author ANDRES
 */
public class Perro extends Animal{

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String hacerSonido(){
        String sonido="Guau guau";
        return sonido;
    }
    
   
}
