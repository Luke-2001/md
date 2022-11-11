package mds;

import Sqls.infosql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BdConex {
    Scanner f = new Scanner(System.in);
    int i = 0;

    public void findByInfo() throws SQLException {

        do {
            System.out.print(" \n--MENU DE CADASTROS--\n");
            System.out.print("Opção 1 consultar seu cadastro:\n");
            System.out.print("Opção 2 sair do menu:\n");

            i = f.nextInt();

            switch (i) {
                case 1 -> findByInfos();

                case 2 -> System.out.println("saindo do Menu de cadastros");

                default -> System.out.println("O número informado é invalido! favor informar um valor entre 1 a 2.\n");
            }
        } while (i == 1);
    }

    public void findByInfos() throws SQLException {

        Conexao con = new Conexao();

        Statement st = con.conexao.createStatement();

        st.execute(infosql.find_by_infos);

        ResultSet rs = st.getResultSet();

        while (rs.next()) {
            System.out.println(rs.getString("CODE") + " | " + rs.getString("NOME") + " | " + rs.getString("IDADE")
                    + " | " + rs.getString("SOMADTNASC") + " | " + rs.getString("EMAIL") + " | " + rs.getString("ENDERECO"));
        }
    }
}
