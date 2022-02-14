package br.com.comercio.util.test;

import br.com.comercio.util.JPAHibernateUtil;

import javax.persistence.EntityManager;

public class MainTest {

    public static void main(String[] args) {

        MainTest mainTest = new MainTest();
        mainTest.run();

    }

    public static void run(){
        EntityManager entityManager = null;

        try {
            entityManager = JPAHibernateUtil.getEntityManagerComercioEletronico();
        }finally {
            if (entityManager != null){
                entityManager.close();
            }
        }{

        }
    }
}
