package org.mvpigs.Bicipalma;

/**
 * TarjetaUsuario
 */
public class TarjetaUsuario {

    private int id = 0;
    private boolean activada = false;

    public TarjetaUsuario() {

    }

    public TarjetaUsuario(int id) {
        this.id = id;

    }

    public TarjetaUsuario(int id, boolean activada) {
        this.id = id;
        this.activada = activada;

    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the activada
     */
    public boolean isActivada() {
        return activada;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param activada the activada to set
     */
    public void setActivada(boolean activada) {
        this.activada = activada;
    }

}