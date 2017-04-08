import com.cefothe.jpa.entity.Book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Created by cefothe on 08.04.17.
 */
public class Main {

    public static void main(String[] args) {
        Book book = new Book("H2G2", 12.5F, "The Hitchhiker's Guide to the Galaxy",
                "1-84023-742-2", 354, false);

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("chapter04PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction entityTransaction = entityManager.getTransaction();

        //Start transaction
        entityTransaction.begin();

        entityManager.persist(book);

        //Commit transaction
        entityTransaction.commit();

        //Close entity manager and factory about it.
        entityManager.close();
        entityManagerFactory.close();
    }
}
