
package com.nk.app;

import com.nk.controller.CMenu;
import com.nk.view.VMenu;

public class App {

    public static CMenu cm;
    public static VMenu vm;
    
    public static void main(String[] args) {
        vm = new VMenu();
        cm = new CMenu(vm);
    }
    
}
