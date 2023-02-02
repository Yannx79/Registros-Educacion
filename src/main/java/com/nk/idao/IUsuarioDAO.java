package com.nk.idao;

import com.nk.datasource.Conexion;

public interface IUsuarioDAO<T, K> extends IObjectIDAO<T, K> {

    public static final String SQL_CREATE = "";
    public static final String SQL_READ = "";
    public static final String SQL_READ_ALL = "SELECT * FROM `tb_users`";
    public static final String SQL_UPDATE = "";
    public static final String SQL_DELETE = "";
    public static final Conexion CONEXION = Conexion.getConexion();

}
