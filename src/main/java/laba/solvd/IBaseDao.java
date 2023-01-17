package laba.solvd;

import java.util.List;
import java.util.Optional;

public interface IBaseDao<T> {
    Optional<T> getEntityById(int id);
    List<T> getAll();
    void save(T entity);
    void update(T entity, String[] params);
    void delete(T entity);
}
