package com.br;

import com.br.model.Gato;

public class Main {

    public static void main(String[] args) {
        /*int a = 5;
        int b = 3;

        System.out.println("A Soma é de "+a+" com "+b+" é: "+(a+b));*/

        Gato gato = new Gato();

        gato.setCor("azul");
        gato.setNome("Neguinho");
        gato.setIdade(25);

        System.out.println(gato);

    }
}
