package com.project.dao;

import java.util.List;
import java.util.Optional;

public interface DaoInterface<Entity> {
    Optional<Entity> getByID(int id);
    List<Entity> getAll();
    void save(Entity entity);
    void update(Entity entity, String[] params);
    void delete(Entity entity);

}
