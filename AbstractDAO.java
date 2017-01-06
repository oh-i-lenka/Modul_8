package Modul_9;

import java.util.ArrayList;
import java.util.List;

public interface AbstractDAO<T>{

    List<T> save(T obj);
    void delete(T obj);
    void deleteAll(ArrayList<T> list);
    void saveAll(ArrayList<T> list);
    List <T> getList();
    void deleteById(long id);
    T get(long id);

}
