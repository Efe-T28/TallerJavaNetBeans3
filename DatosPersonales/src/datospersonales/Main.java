/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datospersonales;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fecha fechaNacimiento = new Fecha(15, 9, 1990);
        Direccion direccion = new Direccion("Calle #24-15, Valledupar", "Avenida 15-14, Valledupar");
        Persona persona = new Persona("Juan Velazquez ", "123456789", "3128978901", fechaNacimiento, direccion);
        
       
        Fecha fechaNacimiento2 = new Fecha(20, 5, 1985);
        Direccion direccion2 = new Direccion("Carrera 30 #23-40, Codazzi", "Calle 20 #50-18, Codazzi");
        Persona persona2 = new Persona("María García", "987654321", "3216743412", fechaNacimiento2, direccion2);
        
        System.out.println("Datos de Persona:");
        persona.mostrarDatos();
        
        System.out.println("Datos de Persona 2:");
        persona2.mostrarDatos();
    }
}
