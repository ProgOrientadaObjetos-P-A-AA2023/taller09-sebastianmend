/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.*;
import paquete1.*;

/**
 *
 * @author reroes
 *
 */
public class PrestamoAutomovil extends Prestamo {

    private String tipo;
    private String marca;
    private Persona garante1;
    private double valor;
    private double val_mens;

    public PrestamoAutomovil(Persona p, int mes, String ciu,
            String t, String m, Persona g, double v) {
        super(p, mes, ciu.toLowerCase());

        tipo = t;
        marca = m;
        garante1 = g;
        valor = v;
        

    /*    Agregar los métodos correspondientes; además agregar un método toString
          El valor mensual del pago del préstamo del valor de la carrera es
        igual al (valor de la carrera dividido para el número de meses) menos 10% 
        del (resultado del valor de la carrera dividido para el número de meses)
        
          Personalizar el método toString; usar el método de la superclase. 
        El método para establecer la ciudad del préstamo de tipo PrestamoEducativo
        debe asignar el valor siempre en mayúscula.
    */    
    }

   public void establecerCiudad() {
        this.ciudad = ciudad.toLowerCase();
    }

    public void establecerTipo(String tipo) {
        this.tipo = tipo;
    }

    

    public void establecerMarca(String marca) {
        this.marca = marca;
    }

    

    public void establecerGarante1(Persona garante1) {
        this.garante1 = garante1;
    }

    

    public void establecerValor(double valor) {
        this.valor = valor;
    }

    

    public void establecerVal_mens() {
        this.val_mens = valor/meses;
    }
    
     public String obtenerTipo() {
        return tipo;
    }
     
     public double obtenerVal_mens() {
        return val_mens;
    }
     
     public double obtenerValor() {
        return valor;
    }
     
     public Persona obtenerGarante1() {
        return garante1;
    }
     
     public String obtenerMarca() {
        return marca;
    }

     
    /* private String tipo;
    private String marca;
    private Persona garante1;
    private double valor;
    private double val_mens;*/
     
     
    @Override
    public String toString() {

        String mensaje =String.format("\n--Prestamo automovil\n");
             
         mensaje = String.format("%s %s",mensaje,super.toString());

        mensaje = String.format("%sTipo de auto: %s\n"
                + "Marca del auto: %s\n"
                + "Nombre del Garante: %s\n"
                + "Apellido del Garante: %s\n"
                + "Username del Garante: %s\n"
                + "Valor: %.2f\n"
                + "Valor Mensual:  %.2f\n", mensaje,
                obtenerTipo(),
                obtenerMarca(), 
                garante1.obtenerNombre(),garante1.obtenerApellido(),
                garante1.obtenerUsername(),
                obtenerValor(), 
                obtenerVal_mens());

        return mensaje;

    }
    
     
     
     
     
}
