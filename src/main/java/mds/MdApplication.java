package mds;

import Sqls.infosql;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@SpringBootApplication
public class MdApplication {

    public void findMd() throws SQLException {
        Scanner ler = new Scanner(System.in);

        LocalDate current_date = LocalDate.now();
        int year = current_date.getYear();

        Infos md;
        md = new Infos();

        System.out.print("Informe seu nome: \n");
        md.setNome(ler.nextLine());

        System.out.print("Seu Email: \n");
        md.setEmail(ler.nextLine());

        System.out.print("Seu endereço: \n");
        md.setEndereco(ler.nextLine());

        System.out.print("Sua idade: \n");
        md.setIdade(ler.nextInt());

        md.somaDtNasc = year - md.idade;

        adiciona(md);
    }

    public String adiciona(Infos infos) {

        Map<String, Object> params = new HashMap<>();
        params.put("nome", infos.getNome());
        params.put("email", infos.getEmail());
        params.put("endereco", infos.getEndereco());
        params.put("idade", infos.getIdade());
        params.put("somaDtNasc", infos.getSomaDtNasc());

         return infosql.inser_informacoes;
    }
}