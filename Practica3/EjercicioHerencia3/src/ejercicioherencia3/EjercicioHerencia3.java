/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioherencia3;
import java.util.ArrayList;
/**
 *
 * @author ANDRES
 */
public class EjercicioHerencia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Empleado> listaempleados=new ArrayList<>();
        
        Empleado emp1=new Empleado("Carlos Jose",1100.50);
        EmpleadoTiempoCompleto emp2=new EmpleadoTiempoCompleto(10,"Peter",1300.25);
        EmpleadoporHoras emp3=new EmpleadoporHoras(200,12,"Valentin",1100.50);
        
        listaempleados.add(emp1);
        listaempleados.add(emp2);
        listaempleados.add(emp3);
        
        System.out.println("Empleados: ");
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        
        System.out.println("Salario de cada empleado: ");
        System.out.println("Salario1: "+emp1.CalcularSalario());
        System.out.println("Salario2: "+emp2.CalcularSalario());
        System.out.println("Salario3: "+emp3.CalcularSalario());
    }
    
}
