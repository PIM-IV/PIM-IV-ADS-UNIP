package com.sha.gestaoHoteleira.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**  
* @Author Vinícius
* @see Class
* @apiNote Modelo para as classes (que serão relacionadas às colunas do banco de dados)
*/

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Contact {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private Long id;

   @Column(name = "name")
   private String name;
   
   @Column(name = "email")
   private String email;

   @Column(name = "phone")
   private String phone;

}