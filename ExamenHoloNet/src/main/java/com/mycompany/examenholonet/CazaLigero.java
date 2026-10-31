/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenholonet;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

/**
 *
 * @author samah
 */
 @Entity
@DiscriminatorValue("CAZA")
public class CazaLigero extends Nave {

    @Column(name = "potencia_fuego")
    private int potenciaFuego;

    public CazaLigero() {
    }

    public CazaLigero(int potenciaFuego) {  
        this.potenciaFuego = potenciaFuego;
    }

    public int getPotenciaFuego() {
        return potenciaFuego;
    }

    public void setPotenciaFuego(int potenciaFuego) {
        this.potenciaFuego = potenciaFuego;
    }
}
      