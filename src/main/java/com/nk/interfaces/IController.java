package com.nk.interfaces;

public abstract class IController {

    public void build() {
        instanceAll();
        addAllListener();
        buildView();
    }
    
    public abstract void instanceAll();
    
    public abstract void addAllListener();
    
    public abstract void buildView();
    
}
