/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.BibliotecaDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity //para decirle que es una entidad(BD)
@Table(name="prestamos")
public class PrestamosDTO {
      
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    
     @Column(name="id_libro")
    private String id_libro;
     
      @Column(name="id_cuenta")
    private String id_cuenta;
      
     @Column(name="fecha_prestamo")
    private String fecha_prestamo;
    
     @Column(name="fecha_devolucion")
    private String fecha_devolucion;

    public PrestamosDTO() {
    }

    public PrestamosDTO(String id_libro, String id_cuenta, String fecha_prestamo, String fecha_devolucion) {
        this.id_libro = id_libro;
        this.id_cuenta = id_cuenta;
        this.fecha_prestamo = fecha_prestamo;
        this.fecha_devolucion = fecha_devolucion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getId_libro() {
        return id_libro;
    }

    public void setId_libro(String id_libro) {
        this.id_libro = id_libro;
    }

    public String getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(String id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public String getFecha_prestamo() {
        return fecha_prestamo;
    }

    public void setFecha_prestamo(String fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public String getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(String fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }
 
    
}
