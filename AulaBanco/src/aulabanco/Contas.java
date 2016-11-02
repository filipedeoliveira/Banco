/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulabanco;

public class Contas {
   private float quant;
   private int id;
   private static int incr=0;
   
   public Contas(float q){
       this.quant=q;
       this.id=incr;
       incr++;
   }
   
   public Contas(){
       quant=0;
       id=incr;
       incr++;
   }
   
   public int getID(){
       return this.id;
   }
   
   public float getQuant(){
       return this.quant;
   }
   
   public void setQuant(float q){
       this.quant=q;
   }
   
      
}
