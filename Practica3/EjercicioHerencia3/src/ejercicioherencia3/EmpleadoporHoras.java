/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioherencia3;

/**
 *
 * @author ANDRES
 */
public class EmpleadoporHoras extends Empleado{
    private int horastrabajadas;
    private double tarifahora;

    public EmpleadoporHoras(int horastrabajadas, double tarifahora, String nombre, double salario) {
        super(nombre, salario);
        this.horastrabajadas = horastrabajadas;
        this.tarifahora = tarifahora;
    }
    
    @Override
    public double CalcularSalario(){
        return salario=horastrabajadas*tarifahora;
    }

    @Override
    public String toString() {
         return "Empleado: "+nombre+ " salario: "+salario+" horas trabajadas: "+horastrabajadas+" y la tarifa por hora: "+tarifahora;
    }
    
    
    
}
