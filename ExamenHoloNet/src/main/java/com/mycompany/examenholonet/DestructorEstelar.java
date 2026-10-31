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
 * @author chafi
 */
 @Entity
@DiscriminatorValue("DESTRUCTOR")
public class DestructorEstelar extends Nave {

    @Column(name = "capacidad_escudos")
    private int capacidadEscudos;

    public DestructorEstelar() {
    }

    public DestructorEstelar( int capacidadEscudos) {
        this.capacidadEscudos = capacidadEscudos;
    }

    public int getCapacidadEscudos() {
        return capacidadEscudos;
    }

    public void setCapacidadEscudos(int capacidadEscudos) {
        this.capacidadEscudos = capacidadEscudos;
    }
}