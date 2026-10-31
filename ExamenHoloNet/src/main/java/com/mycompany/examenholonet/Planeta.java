/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenholonet;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
/**
 *
 * @author samah
 */


@Entity
@Table(name = "planetas")
public class Planeta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "planeta_id")
    private int id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombrePlaneta;
    
     @Column(name = "clima")
    private String clima;
    
    @Column(name = "afiliacion", length = 50)
    private String afiliacion;

    @OneToMany(mappedBy = "planetaOrigen", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private java.util.List<Nave> listaNaves = new java.util.ArrayList<>();
    // Constructor obligatorio JPA
    public Planeta() {}

    public Planeta(int id, String nombrePlaneta, String afiliacion, List listaNaves, String clima) {
        this.id=id;
        this.nombrePlaneta = nombrePlaneta;
        this.clima = clima;
        this.afiliacion = afiliacion;
        this.listaNaves = listaNaves;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombrePlaneta() { return nombrePlaneta; }
    public void setNombrePlaneta(String nombrePlaneta) { this.nombrePlaneta = nombrePlaneta; }
    public String getClima() { return clima; }
    public void setClima(String clima) { this.clima = clima; }
    public String getAfiliacion() { return afiliacion; }
    public void setAfiliacion(String afiliacion) { this.afiliacion = afiliacion; }
    public java.util.List<Nave> getListaNaves() { return listaNaves; }
    public void setListaNaves(java.util.List<Nave> listaNaves) { this.listaNaves = listaNaves; }

    @Override
    public String toString() {
        return "Planeta [ID=" + id + ", Nombre=" + nombrePlaneta + ", Sector=" + afiliacion + "]";
    }
    
    // MÉTODO HELPER (Práctica recomendada para sincronizar ambos lados de la relación en memoria)
    public void agregarNave(Nave nave) {
        this.listaNaves.add(nave);
        nave.setPlanetaOrigen(this); // Sincroniza la clave ajena de forma automática en la Nave
    }
}
