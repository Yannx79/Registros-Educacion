package com.nk.utility;

import com.nk.interfaces.IObjectOB;
import com.nk.ob.ClienteOB;
import java.util.Arrays;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Present {

    public static void main(String[] args) {
        toListInConsole(ClienteOB.parseDtoToOb(), true);
    }
    
    public static void toListInTable(List<? extends IObjectOB> list, JTable jTable,
            String[] header, boolean isComplete) {
        DefaultTableModel dtm = new DefaultTableModel(null, header);
        jTable.setModel(dtm);
        for (IObjectOB x : list) {
            if (isComplete) {
                dtm.addRow(x.fullRead());
            } else {
                dtm.addRow(x.summaryRead());
            }
        }
    }

    public static void toListInTextArea() {

    }

    public static void toListInConsole(List<? extends IObjectOB> list, 
            boolean isComplete) {
        if (isComplete) {
            list.forEach(x -> System.out.println(Arrays.toString(x.fullRead())));
        } else {
            list.forEach(x -> System.out.println(Arrays.toString(x.summaryRead())));
        }
    }

}
