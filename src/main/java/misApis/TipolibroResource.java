/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package misApis;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.List;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import umg.edu.gt.BibliotecaDTO.TipoLibroDTO;


@Path("tipolibro")
public class TipolibroResource {

    //creando la fabrica de sesiones 
    private static final SessionFactory sessionFactory = buildSessionFactory();
    private static final Gson gson = new GsonBuilder().create();
    private static SessionFactory buildSessionFactory() {
    try {
    return new Configuration().configure().buildSessionFactory();
    } catch (Throwable ex) {
    throw new ExceptionInInitializerError(ex);
    }
  }

    @GET
    @Produces(MediaType.APPLICATION_JSON) //para que nos de respuesta json
    public String obtenerTipoLibro() {
        Session session = sessionFactory.openSession();  //Abriendo la sesion creada anteriormente
        session.beginTransaction();

        List<TipoLibroDTO> tipoLibro = session.createQuery("FROM TipoLibroDTO ", TipoLibroDTO.class).list();

        session.getTransaction().commit();
        session.close();

        return gson.toJson(tipoLibro);
    }
}
