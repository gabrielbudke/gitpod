package com.algaworks.listas;

public class Cliente {

   private Long id;
   private String name;

   public Cliente(Long id, String name) {
      this.id = id;
      this.name = name;
   }

   public Long getId() {
      return id;
   }

   public String getName() {
      return name;
   }

}
