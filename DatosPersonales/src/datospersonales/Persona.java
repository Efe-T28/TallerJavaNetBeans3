/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datospersonales;

/**
 *
 * @author LENOVO
 */
public class Persona {
    private String nombre;
    private String cc;
    private String telefono;
    private Fecha nacimiento;
    private Direccion ubicacion;

    public Persona(String nombre, String cc, String telefono, Fecha nacimiento, Direccion ubicacion) {
        this.nombre = nombre;
        this.cc = cc;
        this.telefono = telefono;
        this.nacimiento = nacimiento;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Fecha getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Fecha nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Direccion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Direccion ubicacion) {
        this.ubicacion = ubicacion;
    }
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("CC: " + cc);
        System.out.println("Teléfono: " + telefono);
        nacimiento.mostrarFecha();
        ubicacion.indicarDireccion();
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", cc=" + cc + ", telefono=" + telefono + ", nacimiento=" + nacimiento + ", ubicacion=" + ubicacion + '}';
    }
    
}