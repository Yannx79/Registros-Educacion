package com.nk.interfaces;

public interface IObjectOB<K> {

    public abstract Object[] fullRead(K key);
    
    public abstract Object[] fullRead();
    
    public abstract Object[] summaryRead(K key);
    
    public abstract Object[] summaryRead();
        
}
