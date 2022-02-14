package br.com.comercio.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAHibernateUtil {

    private static EntityManagerFactory ENTITY_MANAGER_FACTORY= null;

    public static EntityManager getEntityManagerComercioEletronico() {
        if (ENTITY_MANAGER_FACTORY == null) {
            ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("COMERCIO_E");
        }
        return ENTITY_MANAGER_FACTORY.createEntityManager();
    }
}
