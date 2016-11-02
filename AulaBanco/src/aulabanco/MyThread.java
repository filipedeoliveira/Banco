/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulabanco;

import java.util.Random;


public class MyThread extends Thread {
    //int behavior;
    AulaBanco ba;
    public MyThread(AulaBanco b){
    //    this.behavior=b;
        this.ba=b;
    }
    public void run(){
        Random r=new Random();
        //if(behavior==0)
        for(int i=0;i<10;i++){
            int primeiro = r.nextInt(50);
            int segundo = r.nextInt(50);
            ba.transferencia(primeiro, segundo, 100);
        }
    }
}
