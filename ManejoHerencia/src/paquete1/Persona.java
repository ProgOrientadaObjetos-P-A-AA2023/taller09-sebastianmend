/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author sebas
 */
public class Persona {

    private String nombre;
    private String apellido;
    private String username;

    public Persona(String n, String a, String u) {
        establecerNombre(n);
        establecerApellido(a);
        establecerUsername(u);
    }
    
    /*
    public Persona(String n, String a, String u) {
        Nombre = n;
        Apellido = a;
        Username = u;
    }
    */

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String n) {
        apellido = n;
    }

    public void establecerUsername(String n) {
        username = n;
    }

    public String obtenerUsername() {
        return username;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

   /* @Override
    public String toString() {
        return String.format("Nombre: %s - Apellido %s - Username %s",
                getNombre(), getApellido(), getUsername());
    }*/

}
