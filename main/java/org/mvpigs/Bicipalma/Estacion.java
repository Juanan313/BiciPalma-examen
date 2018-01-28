package org.mvpigs.Bicipalma;

/**
 * Estacion
 */
public class Estacion {

    private int Id = 0;
    private String direccion = null;
    private int numeroAnclajes = 0;

    public Estacion() {
                
    }

    public Estacion(int id, String direccion, int numeroAnclajes) {
        this.Id = id;
        this.direccion = direccion;
        this.numeroAnclajes = numeroAnclajes;
        
    }
    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.Id = id;
    }

    /**
     * @param numeroAnclajes the numeroAnclajes to set
     */
    public void setNumeroAnclajes(int numeroAnclajes) {
        this.numeroAnclajes = numeroAnclajes;
    }

    /**
     * @return the id
     */
    public int getId() {
        return Id;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @return the numeroAnclajes
     */
    public int getNumeroAnclajes() {
        return numeroAnclajes;
    }

    public String consultarEstacion() {

        return "Id: "+getId()+", Direccion: "+getDireccion()+", numero de anclajes: "+getNumeroAnclajes();
        
    }
}