package sql;

import java.sql.*;

public abstract class SQL {
    protected static final String
        DB_TYPE = "postgres",
        DB_NAME = "ddi5r09r1qrmur",
        USER = "gwuzbrjdjjzgcb",
        PASS = "bb84192c13bf8c74adc719bf7113a406f095076720f57e571af0207f6579ce79",
        HOST = "ec2-34-200-94-86.compute-1.amazonaws.com",
        PORT = "5432",
        URL = DB_TYPE + "://" + USER + ":" + PASS + "@" + HOST + ":" + PORT + "/" + DB_NAME;

    protected static Statement getStmt() throws Exception {
        return DriverManager
                .getConnection(URL, USER, PASS)
                .createStatement();
    }
    
    protected static PreparedStatement getPreStmt(String sql) throws Exception {
        return DriverManager
                .getConnection(URL, USER, PASS)
                .prepareStatement(sql);
    }
}
