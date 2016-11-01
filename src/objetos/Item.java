/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Item {
    
    private int id;
    private int peso;
    private int beneficio;

    public Item(int id, int peso, int beneficio) {
        this.id = id;
        this.peso = peso;
        this.beneficio = beneficio;
    }

    public Item() {
        this.id = 0;
        this.peso = 0;
        this.beneficio = 0;
            
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return the beneficio
     */
    public int getBeneficio() {
        return beneficio;
    }

    /**
     * @param beneficio the beneficio to set
     */
    public void setBeneficio(int beneficio) {
        this.beneficio = beneficio;
    }
    
    
    
    
    
    
    
}
