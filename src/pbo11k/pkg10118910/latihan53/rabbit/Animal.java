/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan53.rabbit;

/**
 * @author
 * NAMA             : Muhamad Syifa Amruloh
 * NIM              : 10118910
 * KELAS            : IF11K
 * Deskripsi Program  : Program untuk menampilkan siapa kamu berdasarkan status konsep pewarisan class
 */
public class Animal {
   protected boolean vegetarian;
   protected String eats;
   protected int noOfLegs;
   
   public Animal(boolean vegetarian, String food, int legs) {
       this.eats = food;
       this.vegetarian = vegetarian;
       this.noOfLegs = legs;
   }
   public boolean isVegetarian(){
       return vegetarian;
   }
   public String getEats() {
       return eats;
   }
   public int getnoOfLegs() {
       return noOfLegs;
   }
}
