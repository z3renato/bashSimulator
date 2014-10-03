
import java.util.ArrayList;
import operatingSystem.fileSystem.FileSytemSimulator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author José Renato
 */
public class Sistema {
    
    
    Diretorio diretorio = new Diretorio("home", null, "");
    Diretorio diretorioRaiz = diretorio;
    
    public void criaDiretorio(String nome){
        diretorio.subDiretorios.add(new Diretorio(nome, diretorio, diretorio.getCaminho()));
    }
    
    
    
}
