

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//import jpa.Clientes; // Importa la clase Clientes

public class MainApp {

    public static void main(String[] args) {
        // Configura y crea una sesión de Hibernate
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = null;
        try {
            // Inicia una transacción
            transaction = session.beginTransaction();

            // Crea y configura una entidad Clientes
            Clientes cliente = new Clientes();
            cliente.setCodCliente("12348");
            cliente.setNombre("Paco");
            cliente.setCodRepresentante("102");
            cliente.setLimiteCredito(1000.0);

            // Guarda la entidad en la base de datos
            //session.save(cliente);
            session.persist(cliente);

            // Compromete la transacción
            transaction.commit();
        } catch (RuntimeException e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            // Cierra la sesión
            session.close();
        }
    }
}
