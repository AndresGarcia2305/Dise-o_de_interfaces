/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioherencia3;

/**
 *
 * @author ANDRES
 */
public class EmpleadoTiempoCompleto extends Empleado{
    private int horasextras;

    public EmpleadoTiempoCompleto(int horasextras, String nombre, double salario) {
        super(nombre, salario);
        this.horasextras = horasextras;
    }
    
    @Override
    public double CalcularSalario(){
        return salario+horasextras;
    }

    @Override
    public String toString() {
        return "Empleado: "+nombre+ " salario: "+salario+" y horas extras: "+horasextras;
    }
    
    
    
}
