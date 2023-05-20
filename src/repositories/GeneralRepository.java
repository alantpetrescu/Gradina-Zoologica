package repositories;

import java.util.ArrayList;
import java.util.List;

public class GeneralRepository<T> implements IGeneralRepository<T> {
    private final List<T> elements = new ArrayList<>();

    @Override
    public int count() {
        return elements.size();
    }

    @Override
    public List<T> findAll() {
        return elements;
    }

    @Override
    public T findElementById(int id) {
        return elements.get(id);
    }

    @Override
    public T updateElementById(int id, T newElement) {
        try {
            elements.set(id, newElement);
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }

        return newElement;
    }

    @Override
    public boolean deleteElement(T element) {
        try {
            elements.remove(element);
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }

        return true;
    }

    @Override
    public boolean deleteElementById(int id) {
        try {
            elements.remove(id);
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }

        return true;
    }

    @Override
    public void clear() {
        elements.clear();
    }
}
