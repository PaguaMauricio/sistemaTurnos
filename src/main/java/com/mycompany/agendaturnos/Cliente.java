package com.mycompany.agendaturnos;
// Generated 01/12/2017 19:43:32 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * Cliente generated by hbm2java
 */
@Entity
@Table (name="cliente")
public class Cliente  implements java.io.Serializable {

     private Integer idcliente;
     private String nombre;
     private String telefono;
     private String descripcion;
     private Set turnos = new HashSet(0);

    public Cliente() {
    }

	
    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    public Cliente(String nombre, String telefono){
        this.nombre = nombre;
        this.telefono = telefono;
    }
    public Cliente(String nombre, String telefono, String descripcion, Set turnos) {
       this.nombre = nombre;
       this.telefono = telefono;
       this.descripcion = descripcion;
       this.turnos = turnos;
    }
    @Id
   @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    public Integer getIdcliente() {
        return this.idcliente;
    }
    
    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }
    @Column (name="nombre")
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Column (name="telefono")
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    @Column (name="descripcion")
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public Set getTurnos() {
        return this.turnos;
    }
    
    public void setTurnos(Set turnos) {
        this.turnos = turnos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idcliente=" + idcliente + ", nombre=" + nombre + ", telefono=" + telefono + ", descripcion=" + descripcion + ", turnos=" + turnos + '}';
    }

    


}


