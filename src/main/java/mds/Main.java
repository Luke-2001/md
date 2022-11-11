package mds;

import org.springframework.boot.SpringApplication;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {
        SpringApplication.run(MdApplication.class, args);

        int i = 0;
        BdConex bdConex = new BdConex();
        MdApplication mdApplication = new MdApplication();

        Scanner f = new Scanner(System.in);

        do {
            System.out.print(" \n--MENU DE OPÇÕES--\n");
            System.out.print("Opção 1 novo cadastro:\n");
            System.out.print("Opção 2 verificar pessoas cadastradas:\n");
            System.out.print("Opção 3 sair do menu:\n");

            i = f.nextInt();

            switch (i) {
                case 1 -> mdApplication.findMd();

                case 2 -> bdConex.findByInfo();

                case 3 -> System.out.println("saindo do Menu de Opções");

                default -> System.out.println("O número informado é invalido! favor informar um valor entre 1 a 3.\n");
            }
        } while (i != 3);
    }
}
