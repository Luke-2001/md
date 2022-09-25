package com.medcloud.md;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

@SpringBootApplication
public class MdApplication {

    public static void main(String[] args) {
        SpringApplication.run(MdApplication.class, args);
        Scanner ler = new Scanner(System.in);

        LocalDate current_date = LocalDate.now();
        int year = current_date.getYear();

        Infos md;
        md = new Infos();

        System.out.print("Informe seu nome: \n");
        md.nome = ler.nextLine();

        System.out.print("Seu Email: \n");
        md.email = ler.nextLine();

        System.out.print("Seu endereço: \n");
        md.endereco = ler.nextLine();

        System.out.print("Sua idade: \n");
        md.idade = ler.nextInt();

        md.somaDtNasc = year - md.idade;

        System.out.printf("Seu nome é: " + md.nome +"\n" +
                "Você nasceu no ano: " + md.somaDtNasc +"\n" +
                "Possui o email: " + md.email +"\n" +
                "E mora no endereço: " + md.endereco);
    }
}