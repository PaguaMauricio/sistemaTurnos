/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import com.mycompany.agendaturnos.Cliente;
import connection.HibernateUtil;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author pagua
 */
public class pruebasHib {
    public static void main (String [] args){
        Session con = HibernateUtil.getSessionFactory().openSession();
        con.beginTransaction();
        List<Cliente> clientes = (List<Cliente>)con.createQuery("from Cliente").list();
        for(Cliente cli: clientes){
            System.out.println(cli.getNombre());
            
        }
            
        con.getTransaction().commit();
        con.close();
        
    }
}
