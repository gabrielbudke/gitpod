package com.algaworks.listas;

import java.util.ArrayList;
import java.util.List;

public class Exemplo01 {
   public static void main(String[] args) {

      List<String> names = new ArrayList<>();

      names.add("João");
      names.add("Maria");
      names.add("José");

      // for (String nome : names) {
      // System.out.println("Nome: " + nome);
      // }

      // names.forEach(new Consumer<String>() {
      // @Override
      // public void accept(String t) {
      // System.out.println(t);
      // }
      // });

      // names.forEach(nome -> System.out.println("Name c/ lambda expression: " + nome));
      names.forEach(System.out::println);

   }

}
