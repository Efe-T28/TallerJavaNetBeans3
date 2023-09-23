/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datospersonales;

/**
 *
 * @author LENOVO
 */
public class Direccion {
    private String direccionD;
    private String direccionT;       

    public Direccion(String direccionD, String direccionT) {
        this.direccionD = direccionD;
        this.direccionT = direccionT;
    }

    public String getDireccionD() {
        return direccionD;
    }

    public void setDireccionD(String direccionD) {
        this.direccionD = direccionD;
    }

    public String getDireccionT() {
        return direccionT;
    }

    public void setDireccionT(String direccionT) {
        this.direccionT = direccionT;
    } 
    
    public void indicarDireccion() {
        System.out.println("Dirección de Domicilio: " + direccionD);
        System.out.println("Dirección de Trabajo: " + direccionT);
    }
}

