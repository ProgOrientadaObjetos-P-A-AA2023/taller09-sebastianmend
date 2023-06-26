/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author sebas
 */
public class InstitucionEducativa {

    private String nombre;
    private String siglas;

    public InstitucionEducativa(String n, String s) {
        setNombre(n);
        setSiglas(s);

    }

    public void setNombre(String n) {
        nombre = n;
    }

    public void setSiglas(String n) {
        siglas = n;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSiglas() {
        return siglas;
    }

    /*@Override
    public String toString(){
        return String.format("Institucion Educativa\nNombre: %s - Siglas: %s", 
                getNombre(), getSiglas());
    }*/
}
