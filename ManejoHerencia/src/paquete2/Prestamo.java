/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.*;
/** 
 *
 * @author reroes
 * Crear una clase Préstamo en lenguaje Java:

Atributos:
beneficiario - de tipo Persona
tiempo de préstamo en meses
ciudad del préstamo (de tipo String)
La clase debe tener un constructor 
* que reciba los parámetros para 
* beneficiario, tiempo de préstamo 
* en meses y ciudad del préstamo.
 */
public class Prestamo {
   //private Persona beneficiario; 
   protected Persona beneficiario;
   protected int meses; 
   protected String ciudad; 
    
   public Prestamo(Persona p, int mes, String ciu){
        beneficiario = p;
        meses = mes;
        ciudad  = ciu;
        
   }

    public Persona obtenerBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Persona beneficiario) {
        this.beneficiario = beneficiario;
    }

    public int obtenerMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
   
    @Override
    public String toString() {

        String mensaje = String.format("-Datos del Beneficiario:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Username: %s\n"
                + "Meses: %d\n"
                + "Ciudad: %s\n\n",
                beneficiario.obtenerNombre(),
                beneficiario.obtenerApellido(),
                beneficiario.obtenerUsername(),
                obtenerMeses(),obtenerCiudad());

        return mensaje;

    }
    
    
   
   
   
    
}
