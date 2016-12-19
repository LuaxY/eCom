package storage;

import java.util.List;

public interface Dao<T>
{
    public T read(int id);

    public List<T> readAll();

    public void update(T object);

    public void delete(T object);

    public void insert(T object);
}