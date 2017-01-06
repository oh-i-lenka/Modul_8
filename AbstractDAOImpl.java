package Modul_9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AbstractDAOImpl<T extends AbstractEntity> implements AbstractDAO<T> {
    List<T> list = new ArrayList<>();

    @Override
    public List<T> save(T obj) {
        list.add((T) obj);
        return list;
    }

    @Override
    public void delete(T obj) {
        list.remove(obj);
    }

    @Override
    public void deleteAll(ArrayList list) {
        list.clear();
    }

    @Override
    public void saveAll(ArrayList list) {
        list.addAll(list);
    }

    @Override
    public List<T> getList() {
        return list;
    }

    @Override
    public void deleteById(long id) {

        Iterator<T> iter = list.iterator();
        while (iter.hasNext()) {
            if (iter.next().getId() == id) {
                iter.remove();
            }
        }
    }

    @Override
    public T get(long id) {

        T objByID = null;
        Iterator<T> iter = list.iterator();
        while (iter.hasNext()) {
            if (iter.next().getId() == id) {
                objByID = iter.next();
            }
        }

        return objByID;
    }
}
