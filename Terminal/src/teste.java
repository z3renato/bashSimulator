//String result = "";
//        if (parameters.equals("..") || parameters.equals("../")) {
//            sistema.diretorio = sistema.diretorio.pai;
//        } else {
//            int indice = -1;
//            for (int i = 0; i < sistema.diretorio.subDiretorios.size(); i++) {
//                if (sistema.diretorio.subDiretorios.get(i).getNome().equals(parameters)) {
//                    indice = i;
//                    break;
//                }
//
//            }
//            if (indice == -1) {
//                result = "Diretório não encontrado";
//            } else {
//                sistema.diretorio = sistema.diretorio.subDiretorios.get(indice);
//            }
//        }
//        //variavel result deverah conter o que vai ser impresso na tela apos comando do usuário
//
//        String currentDir = "";
//        System.out.println("Chamada de Sistema: cd");
//        System.out.println("\tParametros: " + parameters);
//        currentDir = sistema.diretorio.getNome();
//        //inicio da implementacao do aluno
//
//        //indique o diretório atual. Por exemplo... /
//        currentDir = sistema.diretorio.getNome();
//
//        //setando parte gráfica do diretorio atual
//        operatingSystem.fileSystem.FileSytemSimulator.currentDir = currentDir;
//
//        //fim da implementacao do aluno
//        return result;

public class teste{
    public static void main(String[] args) {
        String parametros = "../renato";
        String caminho[] = parametros.split("/");
        System.out.println(caminho.length);
        for (int i = 0; i < caminho.length; i++) {
            System.out.println(caminho[i]);
        }
    }
}

