package com.nk.idao;

import com.nk.datasource.Conexion;
import java.util.List;

// una clase implementar interfaz
// una interfaz extendiende de otra interfaz
public interface IClienteDAO<T, K> extends IObjectIDAO<T, K> {

    public static final String SQL_CREATE = "INSERT INTO `tb_customer`(`dni`, "
            + "`names`, `last_names`, `telefono`, `eliminado`) VALUES "
            + "(?,?,?,?,?)";
    public static final String SQL_READ = "SELECT * FROM `tb_customer` WHERE dni = ?";
    public static final String SQL_READ_ALL = "SELECT * FROM `tb_customer`";
    public static final String SQL_UPDATE = "UPDATE `tb_customer` SET "
            + "`names`=?,`last_names`=?,"
            + "`telefono`=?,`eliminado`=? WHERE dni=?";
    public static final String SQL_DELETE = "UPDATE tb_customer set eliminado = 1 "
            + "where dni=?";
    public static final Conexion CONEXION = Conexion.getConexion();

}
