package com.lunatic.mybitis_dao.mapper;

import java.util.List;

public interface BaseDao<T> {
    public Boolean insert(T var);

    public Boolean delete(T var);

    public Boolean update(T var);

    public List<T> select(T var);
}