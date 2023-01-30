package gr.aueb.cf.ch19.genInterface;

import java.util.List;

public interface IGenericDAO<T> {
    boolean save(T t);
    T update(T oldT, T newT);
    T deleteT(T t);
    T get(Object id);
    List<T> getAll();
}
