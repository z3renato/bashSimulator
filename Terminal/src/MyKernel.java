/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Iterator;
import operatingSystem.Kernel;

/**
 * Kernel desenvolvido pelo aluno. Outras classes criadas pelo aluno podem ser
 * utilizadas, como por exemplo: - Arvores; - Filas; - Pilhas; - etc...
 *
 * @author nome do aluno...
 */
public class MyKernel implements Kernel {

    private String result;
    Sistema sistema = new Sistema();

    public MyKernel() {
        sistema.diretorio.setPai(sistema.diretorio);
        sistema.diretorioRaiz = sistema.diretorio;
        cd(sistema.diretorio.getNome());
    }

    public Diretorio percorreDiretorios(Diretorio diretorio, String parameters) {
        Diretorio salva = diretorio;
        String caminho[] = parameters.split("/");
        boolean encontrado = false;
        if (parameters.startsWith("/home/")) {
            diretorio = sistema.diretorioRaiz;
        }
        if(parameters.equals("/home") || parameters.equals("/home/") || parameters.equals("~")||parameters.equals("~/")){
            return sistema.diretorioRaiz;
        }
        if(parameters.equals("")||parameters.equals(" ")){
            encontrado=true;
        }
        if (parameters.equals(".") || parameters.equals("./")) {
            encontrado = true;
        } else if (parameters.equals("..") || parameters.equals("../")) {
            encontrado = true;
            diretorio = diretorio.pai;

        } else {
            for (int i = 0; i < caminho.length; i++) {
                encontrado = false;
                if (caminho[i].equals(".")) {
                    encontrado = true;
                    continue;

                } else if (caminho[i].equals("..")) {
                    diretorio = diretorio.pai;
                    encontrado = true;
                    continue;
                } else {
                    for (int j = 0; j < diretorio.subDiretorios.size(); j++) {
                        if (caminho[i].equals("") || caminho[i].equals(" ")) {
                            
                            continue;
                        } else if (caminho[i].equals(diretorio.subDiretorios.get(j).getNome())) {
                            encontrado = true;
                            diretorio = diretorio.subDiretorios.get(j);
                            break;
                        }

                    }
                }
            }
        }
        if (encontrado) {
            return diretorio;
        } else {
            result = "Diretótio não encontrado";
            return salva;
        }
    }

    public String ls(String parameters) {
        //variavel result deverah conter o que vai ser impresso na tela apos comando do usuário
        
        result = "";

        System.out.println("Chamada de Sistema: ls");
        System.out.println("\tParametros: " + parameters);

        //inicio da implementacao do aluno
        if ( (parameters==null)||parameters.equals("")||parameters.equals(" ")) {
            
        }else{
            sistema.diretorio = percorreDiretorios(sistema.diretorio, parameters);
        }
        if(!result.equals("Diretótio não encontrado"))
        for (int i = 0; i < sistema.diretorio.subDiretorios.size(); i++) {
            result += sistema.diretorio.subDiretorios.get(i).getNome() + "\n";

        }

        //fim da implementacao do aluno
        return result;
    }

    public String mkdir(String parameters) {
        //variavel result deverah conter o que vai ser impresso na tela apos comando do usuário
        String parametros[] = parameters.split(" ");

        String result = "";
        System.out.println("Chamada de Sistema: mkdir");
        System.out.println("\tParametros: " + parameters);

        //inicio da implementacao do aluno
        for (int i = 0; i < parametros.length; i++) {
            sistema.criaDiretorio(parametros[i]);
        }
        //fim da implementacao do aluno

        return result;
    }

    public String cd(String parameters) {
        result = "";
        String currentDir = "";
        Diretorio origem = sistema.diretorio;
        sistema.diretorio = percorreDiretorios(sistema.diretorio, parameters);
        if (!sistema.diretorio.getPermissao().startsWith("d") && !sistema.diretorio.getPermissao().contains("x")) {

            result = "Diretório não pode ser acessado";
            sistema.diretorio = origem;
        }
        //variavel result deverah conter o que vai ser impresso na tela apos comando do usuário
        currentDir = sistema.diretorio.getCaminho();
        System.out.println("Chamada de Sistema: cd");
        System.out.println("\tParametros: " + parameters);

        //inicio da implementacao do aluno
        //indique o diretório atual. Por exemplo... /
        //setando parte gráfica do diretorio atual
        operatingSystem.fileSystem.FileSytemSimulator.currentDir = currentDir;

        //fim da implementacao do aluno
        return result;

    }

    public String rmdir(String parameters) {
        //variavel result deverah conter o que vai ser impresso na tela apos comando do usuário
        String result = "";
        System.out.println("Chamada de Sistema: rmdir");
        System.out.println("\tParametros: " + parameters);

        //inicio da implementacao do aluno
        //fim da implementacao do aluno
        return result;
    }

    public String cp(String parameters) {
        //variavel result deverah conter o que vai ser impresso na tela apos comando do usuário
        String result = "";
        System.out.println("Chamada de Sistema: cp");
        System.out.println("\tParametros: " + parameters);

        //inicio da implementacao do aluno
        //fim da implementacao do aluno
        return result;
    }

    public String mv(String parameters) {
        //variavel result deverah conter o que vai ser impresso na tela apos comando do usuário
        String result = "";
        System.out.println("Chamada de Sistema: mv");
        System.out.println("\tParametros: " + parameters);

        //inicio da implementacao do aluno
        //fim da implementacao do aluno
        return result;
    }

    public String rm(String parameters) {
        //variavel result deverah conter o que vai ser impresso na tela apos comando do usuário
        String result = "";
        System.out.println("Chamada de Sistema: rm");
        System.out.println("\tParametros: " + parameters);

        //inicio da implementacao do aluno
        //fim da implementacao do aluno
        return result;
    }

    public String chmod(String parameters) {
        //variavel result deverah conter o que vai ser impresso na tela apos comando do usuário
        String result = "";
        System.out.println("Chamada de Sistema: chmod");
        System.out.println("\tParametros: " + parameters);

        //inicio da implementacao do aluno
        //fim da implementacao do aluno
        return result;
    }

    public String createfile(String parameters) {
        //variavel result deverah conter o que vai ser impresso na tela apos comando do usuário
        String result = "";
        System.out.println("Chamada de Sistema: createfile");
        System.out.println("\tParametros: " + parameters);

        //inicio da implementacao do aluno
        //fim da implementacao do aluno
        return result;
    }

    public String cat(String parameters) {
        //variavel result deverah conter o que vai ser impresso na tela apos comando do usuário
        String result = "";
        System.out.println("Chamada de Sistema: cat");
        System.out.println("\tParametros: " + parameters);

        //inicio da implementacao do aluno
        //fim da implementacao do aluno
        return result;
    }

    public String batch(String parameters) {
        //variavel result deverah conter o que vai ser impresso na tela apos comando do usuário
        String result = "";
        System.out.println("Chamada de Sistema: batch");
        System.out.println("\tParametros: " + parameters);

        //inicio da implementacao do aluno
        //fim da implementacao do aluno
        return result;
    }

    public String dump(String parameters) {
        //variavel result deverah conter o que vai ser impresso na tela apos comando do usuário
        String result = "";
        System.out.println("Chamada de Sistema: dump");
        System.out.println("\tParametros: " + parameters);

        //inicio da implementacao do aluno
        //fim da implementacao do aluno
        return result;
    }

    public String info() {
        //variavel result deverah conter o que vai ser impresso na tela apos comando do usuário
        String result = "";
        System.out.println("Chamada de Sistema: info");
        System.out.println("\tParametros: sem parametros");

        //nome do aluno
        String name = "Fulano da Silva";
        //numero de matricula
        String registration = "2001.xx.yy.00.11";
        //versao do sistema de arquivos
        String version = "0.1";

        result += "Nome do Aluno:        " + name;
        result += "\nMatricula do Aluno:   " + registration;
        result += "\nVersao do Kernel:     " + version;

        return result;
    }

}
