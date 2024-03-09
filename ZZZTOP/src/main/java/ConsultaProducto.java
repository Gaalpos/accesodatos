import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ConsultaProducto {
    public static void main(String[] args) {
        // Configura la sesión de Hibernate
        
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Productos.class)
                .buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        
        try {
            // Inicia la transacción
            //session.beginTransaction();
            
            // Realiza la consulta para obtener todos los productos
            List<Productos> losProductos = session.createQuery("from Productos").getResultList();
            
            // Muestra los productos
            for (Productos tempProducto : losProductos) {
                System.out.println(tempProducto);
            }
            
            // Cierra la transacción
            session.getTransaction().commit();
            
            System.out.println("Hecho!");
        } finally {
            factory.close();
        }
    }
    
    private static SessionFactory buildSessionFactory() {
        try {
            // Crea el SessionFactory desde hibernate.cfg.xml
            return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        } 
        catch (Throwable ex) {
            // Muestra un mensaje de error en caso de fallo
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

}
