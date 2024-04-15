package Logica;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author alber
 */
public class Anfitrion extends Cliente {
   
    //Atributos
    private LocalDate fechaRegistro;
    private boolean superanfitrion;
    private ArrayList<Inmueble> inmuebles = new ArrayList<>();

    //Constructor
    public Anfitrion(LocalDate fechaRegistro, String dni, String nombre, String correo, String clave, String telefono) {
        super(dni, nombre, correo, clave, telefono);
        this.fechaRegistro = fechaRegistro;
    }
    
    //Métodos
    //falta documentar set/add inmuebles y set superanfitrion ##############################
    
    //G&S

    public ArrayList<Inmueble> getInmuebles() {
        return inmuebles;
    }

    public void addInmuebles(Inmueble inmueble) {
        this.inmuebles.add(inmueble);
        this.setSuperanfitrion();
    }
     
    
    
    /**
     * Get the value of superanfitrion
     *
     * @return the value of superanfitrion
     */
    public boolean isSuperanfitrion() {
        return superanfitrion;
    }

    /**
     * Set the value of superanfitrion
     *
     * @param superanfitrion new value of superanfitrion
     */
    public void setSuperanfitrion() {
        int calificacion=0;
        int cantidad=0;
        for (Inmueble i : inmuebles) {
           calificacion+=i.getCalificacion();
           cantidad++;
        }
        int notamedia = calificacion/cantidad;
        if (notamedia>=4)
            this.superanfitrion = true;
        else
            this.superanfitrion = false;
    }

    
    /**
     * Get the value of fechaRegistro
     *
     * @return the value of fechaRegistro
     */
    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * Set the value of fechaRegistro
     *
     * @param fechaRegistro new value of fechaRegistro
     */
    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
 
}
