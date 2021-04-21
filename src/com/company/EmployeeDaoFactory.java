package com.company;

import java.awt.color.ICC_ColorSpace;
import java.sql.SQLException;

public class EmployeeDaoFactory {

    private static Employeedao dao;

    public static Employeedao getEmployeedao() throws SQLException {
        if(dao==null){
            dao = new EmployeeDaoImpl();
        }
        return dao;
    }
}