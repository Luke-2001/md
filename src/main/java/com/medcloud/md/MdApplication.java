package com.medcloud.md;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
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
        md.setNome(ler.nextLine());

        System.out.print("Seu Email: \n");
        md.setEmail(ler.nextLine());

        System.out.print("Seu endereço: \n");
        md.setEndereco(ler.nextLine());

        System.out.print("Sua idade: \n");
        md.setIdade(ler.nextInt());

        md.somaDtNasc = year - md.idade;

        System.out.printf("Seu nome é: " + md.getNome() +"\n" +
                "Você nasceu no ano: " + md.getSomaDtNasc() +"\n" +
                "Possui o email: " + md.getEmail() +"\n" +
                "E mora no endereço: " + md.getEndereco());
    }
}