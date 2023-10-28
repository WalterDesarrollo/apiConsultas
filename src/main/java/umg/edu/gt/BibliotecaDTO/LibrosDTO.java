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
@Table(name="libros")
public class LibrosDTO {
          
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    
     @Column(name="nombre")
    private String nombre;
     
      @Column(name="descripcion")
    private String descripcion;
      
     @Column(name="fecha_carga")
    private String fecha_carga;
    
     @Column(name="id_tipo_libro")
    private String id_tipo_libro;
     
      @Column(name="id_autor")
    private String id_autor;
      
     @Column(name="disponible")
    private String disponible;

    public LibrosDTO() {
    }

    public LibrosDTO(String nombre, String descripcion, String fecha_carga, String id_tipo_libro, String id_autor, String disponible) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_carga = fecha_carga;
        this.id_tipo_libro = id_tipo_libro;
        this.id_autor = id_autor;
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha_carga() {
        return fecha_carga;
    }

    public void setFecha_carga(String fecha_carga) {
        this.fecha_carga = fecha_carga;
    }

    public String getId_tipo_libro() {
        return id_tipo_libro;
    }

    public void setId_tipo_libro(String id_tipo_libro) {
        this.id_tipo_libro = id_tipo_libro;
    }

    public String getId_autor() {
        return id_autor;
    }

    public void setId_autor(String id_autor) {
        this.id_autor = id_autor;
    }

    public String getDisponible() {
        return disponible;
    }

    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }

    
}
