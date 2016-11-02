/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulabanco;

import java.util.concurrent.locks.ReentrantLock;

public class Contas {
   private float quant;
   private int id;
   private ReentrantLock instlLock;
   private static int incr=0;
   public static ReentrantLock lk = new ReentrantLock();
   
   public Contas(float q){
       this.quant=q;
       this.instlLock=new ReentrantLock();
       lk.lock();//para poder incrementar, bloqueio o meu incrementer 
       this.id=incr;       
       incr++;
       lk.unlock();
   }
   
   public Contas(){
       quant=0;
       this.instlLock=new ReentrantLock();
       lk.lock();
       this.id=incr;
       incr++;
       lk.unlock();
   }
   
   public int getID(){
       return this.id;
   }
   
   public float getQuant(){
       float coisa;
       instlLock.lock();
       coisa=this.quant;
       instlLock.unlock();
       return this.quant;
   }
   
   public synchronized void setQuant(float q){
       instlLock.lock();
       this.quant=q;
       instlLock.unlock();
   }
   
      
}
