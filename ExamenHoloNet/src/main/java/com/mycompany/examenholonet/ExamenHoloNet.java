/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examenholonet;

import java.util.List;

/**
 *
 * @author chafi
 */
public class ExamenHoloNet {

    public static void main(String[] args) {
        HoloNetControl control = new HoloNetControl();
        
        List<CazaLigero> cazas =control.obtenerCazasOperativosPorBando("Imperio");
          
        for (CazaLigero c : cazas) {
            System.out.println("Cazas Operativos por bando ");
            System.out.println("Nombre: " + c.getNombre());
            System.out.println("Modelo: " + c.getModelo());
            System.out.println("Potencia: " + c.getPotenciaFuego());

        }


        List<Nave> flota =control.obtenerFlotaCriticaPolimorfica();

        for (Nave n : flota) {
         System.out.println("Cazas Operativos por bando ");
         System.out.println("Nave: "+ n.getNombre());
         System.out.println("Estado: " + n.getEstadoSistema());

         if (n.getPlanetaOrigen() != null) {
               System.out.println("Planeta: " + n.getPlanetaOrigen().getNombrePlaneta());
            }

        }

       
        List<Object[]> reporte =control.obtenerReporteGeneralFiltrado();

        for (Object[] fila : reporte) {
            System.out.println("Reporte General");
            System.out.println("Nombre: " + fila[0]);
            System.out.println("Tipo: " + fila[1]);
            System.out.println("Planeta: " + fila[2]);

        }

        HibernateUtil.shutdown();
    }
}
