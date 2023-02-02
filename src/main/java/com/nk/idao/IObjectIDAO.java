
package com.nk.idao;

import java.util.List;

public interface IObjectIDAO <T, K> {

    public abstract boolean create(T t);
    
    public abstract T read(K key);
    
    public abstract List<T> readAll();
    
    public abstract boolean update(T t);
    
    public abstract boolean delete(K key);
    
}
