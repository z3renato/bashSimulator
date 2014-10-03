/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author José Renato
 */
public class Arquivo {
    private String nome;
    private String conteudo;
    
    public Arquivo(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }
    public void setConteudo(String conteudo){
        this.conteudo = conteudo;
    
    }
    public String getConteudo(){
        return conteudo;
    }
}
