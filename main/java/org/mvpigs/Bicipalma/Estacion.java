package org.mvpigs.Bicipalma;

/**
 * Estacion
 */
public class Estacion {

    private int Id = 0;
    private String direccion = null;
    private int numeroAnclajes = 0;
    private Bicicleta[] anclajes 	 = null;

    public Estacion() {
                
    }

    public Estacion(int id, String direccion, int numeroAnclajes) {
        this.Id = id;
        this.direccion = direccion;
        this.numeroAnclajes = numeroAnclajes;
        this.anclajes = new Bicicleta[numeroAnclajes];   
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
     * @param anclajes the anclajes to set
     */
    public void setAnclajes(Bicicleta[] anclajes) {
        this.anclajes = anclajes;
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

    /**
     * @return the anclajes
     */
    public Bicicleta[] getAnclajes() {
        return anclajes;
    }

    public String consultarEstacion() {

        return "Id: "+getId()+", Direccion: "+getDireccion()+", numero de anclajes: "+getNumeroAnclajes();
        
    }

    public void mostrarAnclaje(Bicicleta bicicleta, int numeroAnclaje) {

        // Muestra por consola el Id de la bicicleta y el anclaje en el que está
        System.out.println("Id bicicleta: "+bicicleta.getId()+", Numero de Anclaje: "+numeroAnclaje); 
        
    }

    public void anclarBicicleta(Bicicleta bicicleta) {

        for (int i=0 ; i < anclajes.length; i++) {
             if (anclajes[i] == null) {
                 this.anclajes[i] = bicicleta;
                 mostrarAnclaje(bicicleta, i);
                 break;

             }
        }
    }

    public boolean leerTarjetaUsuario(TarjetaUsuario tarjetaUsuario) {
        
        return tarjetaUsuario.isActivada();
    }
}