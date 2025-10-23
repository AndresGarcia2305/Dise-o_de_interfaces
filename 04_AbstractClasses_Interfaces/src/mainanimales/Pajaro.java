/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainanimales;

/**
 *
 * @author ANDRES
 */
public class Pajaro extends Animal implements Volador{

    public Pajaro(String nombre, int edad) {
        super(nombre, edad);
    }
    
        @Override
    public String hacerSonido(){
        String sonido="Pio pio";
        return sonido;
    }

    @Override
    public void volar() {
        System.out.println("El pájaro vuela alto");
    }
}
