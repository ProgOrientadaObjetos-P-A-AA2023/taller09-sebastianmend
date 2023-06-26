/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;
import paquete2.*;
import paquete1.*;

/**
 *
 * @author reroes}
 * 
 */
public class PrestamoEducativo extends Prestamo {
    
    private String niv_est;
    private InstitucionEducativa centro;
    private double valor;
    private double val_mens;
    
     public PrestamoEducativo(Persona p, int mes, String ciu,
            String ne, InstitucionEducativa c, double g ) {
        super(p, mes, ciu.toUpperCase());
        
        niv_est = ne;
        centro = c;
        valor = g;   
     }

    public void establecerNiv_est(String niv_est) {
        this.niv_est = niv_est;
    }

    public void establecerCentro(InstitucionEducativa centro) {
        this.centro = centro;
    }

    public void establecerValor(double valor) {
        this.valor = valor;
    }

    public void calcularVal_mens() {
        this.val_mens = (valor/meses)-((valor/meses)*0.1);
    }

    public String obtenerNiv_est() {
        return niv_est;
    }

    public InstitucionEducativa obtenerCentro() {
        return centro;
    }

    public double obtenerValor() {
        return valor;
    }

    public double obtenerVal_mens() {
        return val_mens;
    }
    
     @Override
    public String toString() {

        String mensaje =String.format("\n--Prestamo Educativo\n");
             
         mensaje = String.format("%s %s",mensaje,super.toString());

        mensaje = String.format("%s"
                + "Nivel de estudio: %s\n"
                + "Centro educativo: %s(%S)\n"
                + "Valor de la carrera: %.2f\n"
                + "Valor Mensual:  %.2f\n", 
                mensaje,
                obtenerNiv_est(),
                centro.getNombre(),
                centro.getSiglas(),
                obtenerValor(),
                obtenerVal_mens());

        return mensaje;

    }
     
     
     
     
}
