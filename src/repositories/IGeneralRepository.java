package repositories;

import java.util.ArrayList;
import java.util.List;

public interface IGeneralRepository<T> {

    int count();
    List<T> findAll();
    T findElementById(int id);
    T updateElementById(int id, T newElement);
    boolean deleteElement(T element);
    boolean deleteElementById(int id);
    void clear();
}
