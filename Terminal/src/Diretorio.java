
import java.lang.reflect.Array;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author José Renato
 */
public class Diretorio {
    
    private String  nome;
    private String caminho = "";
    private String permissao;
    ArrayList <Arquivo> arquivos = new ArrayList<Arquivo>();
    ArrayList <Diretorio> subDiretorios = new ArrayList<Diretorio>();
    
    public String getCaminho(){
    return caminho;
}
    Diretorio pai ;
    public Diretorio(String nome, Diretorio pai, String caminho){
        this.nome = nome;
        this.pai = pai;
        this.caminho = caminho+nome+"/";
        permissao = "drwxrwxrwx";
     
    }
    public void setPermissao(String permissao){
        this.permissao = permissao;
    }
    public String getPermissao(){
        return permissao;
    }
    public void setPai(Diretorio pai){
        this.pai = pai;
    }

    public Diretorio() {
        
    }
    
    public String getNome(){
        return nome;
    }
    
    
   
    
    
    
}
