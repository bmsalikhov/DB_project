package services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.Closeable;

public class EntityService implements Closeable {
    private final EntityManagerFactory entityManagerFactory;
    private final EntityManager entityManager;
    public EntityService() {
        entityManagerFactory = Persistence.createEntityManagerFactory("some");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public void close() {
        entityManager.close();
        entityManagerFactory.close();
    }
}
