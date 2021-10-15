package com.algaworks.listas;

import java.util.ArrayList;
import java.util.List;

public class Exemplo02 {
   public static void main(String[] args) {

      List<Cliente> clientes = new ArrayList<>();

      clientes.add(new Cliente(1L, "José"));
      clientes.add(new Cliente(2L, "Maria"));
      clientes.add(new Cliente(3L, "João"));

      clientes.forEach(cliente -> System.out.printf("id: %d, name: %s%n", cliente.getId(), cliente.getName()));

   }

}
