/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulabanco;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws InterruptedException{
        AulaBanco ab=new AulaBanco();
        for(int i=0;i<=49;i++)
            ab.criaConta(1000);
        ArrayList<MyThread> aux = new ArrayList<MyThread>();
        for(int j=0; j<10; j++){
            MyThread t = new MyThread(ab);
            t.start();
            aux.add(t);
        }
        for(MyThread tt:aux){
            tt.join();
        }
        ab.coisa();
        System.out.println(ab.veMoney());
    }
   
}
