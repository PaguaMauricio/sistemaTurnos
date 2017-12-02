/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import com.mycompany.agendaturnos.Cliente;
import connection.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author pagua
 */
public class ClienteControl {
    public static void guardarCliente(Cliente cli){
        Session con = HibernateUtil.getSessionFactory().openSession();
        con.beginTransaction();
        con.save(cli);
        con.getTransaction().commit();
        con.close();
    }
    public static List<Cliente> getClientes(){
        Session con = HibernateUtil.getSessionFactory().openSession();
        con.beginTransaction();
        List<Cliente> clientes = (List<Cliente>) con.createQuery("From Cliente").list();
        con.getTransaction().commit();
        con.close();
        return clientes;
    }
}
