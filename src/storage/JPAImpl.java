package storage;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;

public class JPAImpl<T> implements Dao<T>
{
    private EntityManager entityManager;

    public JPAImpl()
    {
        System.out.println("++++++++ JPA ++++++++");
        entityManager = Persistence.createEntityManagerFactory("eCom").createEntityManager();
    }

    @Override
    public T read(int id)
    {
        return (T) entityManager.createNamedQuery("books.find").setParameter("key", id).getSingleResult();
    }

    @Override
    public List<T> readAll()
    {
        return entityManager.createNamedQuery("books.all").getResultList();
    }

    @Override
    public void update(T object)
    {
        entityManager.merge(object);
    }

    @Override
    public void delete(T object)
    {
        entityManager.remove(object);
    }

    @Override
    public void insert(T object)
    {
        entityManager.persist(object);
    }
}