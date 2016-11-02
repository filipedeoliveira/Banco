/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulabanco;

import java.util.HashMap;
import java.util.Map;


public class AulaBanco {
    private HashMap<Integer,Contas> listaContas;
        
    public AulaBanco(){
        this.listaContas = new HashMap<>();
    }    
        
    public Float consultaD(int id){
        Contas c;
        if(listaContas.containsKey(id)){
            c=listaContas.get(id);
            return c.getQuant();
        }
        else return null;
    } 
    
    public Contas criaConta(float q){
        int ide;
        Contas con=new Contas(q);
        ide=con.getID();
        listaContas.put(ide,con);
        return con;
    }
    
    public void credito(int id, float q){
        Contas co;
        if(listaContas.containsKey(id)){
            co=listaContas.get(id);
            float aux=co.getQuant();
            co.setQuant(q+aux);
        }
        //else{ TIREI porque no enunciado diz que sao um numero fixo de contas, logo nao se criam mais
            //Contas nova=criaConta(q);
        //}
    }
    
    public void debito(int id, float q){
        Contas co;
        if(listaContas.containsKey(id)){
            co=listaContas.get(id);
            float aux2=co.getQuant();
            co.setQuant(aux2-q);
        }
        else return;
    }
    
    public float veMoney(){
        float q=0;
        for(Contas c:listaContas.values())
            q+=c.getQuant();
        return q;
    }
    
    public void transferencia(int id,int id2,int q){
        Contas co, co2;
        if(listaContas.containsKey(id) && listaContas.containsKey(id2)){
            co=listaContas.get(id);
            co2=listaContas.get(id2);
            float aux=co.getQuant();
            co.setQuant(aux-q);
            float aux2=co2.getQuant();
            co2.setQuant(aux2+q);
        }
        else return;
    }
    
    
    void coisa(){
        for(Contas c:listaContas.values())
            System.out.println(c.getID()+" : "+c.getQuant());
    }
}
