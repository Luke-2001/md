package com.medcloud.md;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BdConex {

    public static void main(String[] args) throws SQLException {

        Conexao con = new Conexao();

        Statement st = con.conexao.createStatement();

        st.execute("select * from infos");

        ResultSet rs = st.getResultSet();

        while (rs.next()) {
            System.out.println(rs.getString("code") + "\n" + rs.getString("nome") + "\n" + rs.getString("idade")
             + "\n" + rs.getString("somaDtNasc") + "\n" + rs.getString("email")+ "\n" + rs.getString("endereco"));
        }
    }

}
