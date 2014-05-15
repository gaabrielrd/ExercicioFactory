/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lanche;

/**
 *
 * @author groda
 */
public class Ingrediente {
    String nome;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Ingrediente(String nome){
        setNome(nome);
    }
    
    public String toString(){
        return null;
    }
}
