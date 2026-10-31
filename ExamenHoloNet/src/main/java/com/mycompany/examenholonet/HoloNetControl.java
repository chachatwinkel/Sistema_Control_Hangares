package com.mycompany.examenholonet;

import org.hibernate.query.Query;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Samah
 */
public class HoloNetControl {
    
    public List<CazaLigero> obtenerCazasOperativosPorBando(String bando) {

    String hql = "FROM Nave n " +
            "INNER JOIN n.planetaOrigen p " +
            "WHERE TYPE(n) = CazaLigero " +
            "AND p.afiliacion = :bando " +
            "AND n.estadoSistema <> 'Mantenimiento'";

    try (Session session =HibernateUtil.getSessionFactory().openSession()) {
    Query<CazaLigero> query = session.createQuery(hql, CazaLigero.class);
    query.setParameter("bando", bando);
    
     return query.getResultList();
    }
}
    
    
    
    public List<Nave> obtenerFlotaCriticaPolimorfica() {

    String hql ="FROM Nave n " +
            "INNER JOIN FETCH n.planetaOrigen " +
            "WHERE n.estadoSistema = 'Critico'";

   try (Session session =HibernateUtil.getSessionFactory().openSession()) {
    return session.createQuery(hql, Nave.class).getResultList();
    }
}
    
    
    public List<Object[]> obtenerReporteGeneralFiltrado() {
  String hql =
            "SELECT n.nombre, TYPE(n), p.nombrePlaneta " +
            "FROM Nave n " +
            "LEFT JOIN n.planetaOrigen p";

    try (Session session =HibernateUtil.getSessionFactory().openSession()) {
    Query<Object[]> query =session.createQuery(hql, Object[].class);
         return query.getResultList();
    }
}
    
   
    
    
}