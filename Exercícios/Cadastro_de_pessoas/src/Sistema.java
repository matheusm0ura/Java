import java.util.ArrayList;

public class Sistema {
    private  static ArrayList<Pessoa> cadastro = new ArrayList<>();


    public static ArrayList<Pessoa> getCadastro() {
        return cadastro;
    }

    public static void cadastrar(Pessoa p){
        cadastro.add(p);
    }

    public static String listar(){
        String saida = "";
        int i = 1;
        for (Pessoa p : cadastro){
            saida += String.format("\n============ PESSOA %d ===========", i++);
            saida += p.dados() + "\n";
        }
        return saida;
    }

    public static boolean excluir(String nome){
        for(Pessoa p : cadastro) {
            if(p.getNome().equalsIgnoreCase(nome)) {
                cadastro.remove(p);
                return true;
            }
        }
        return false;
    }

    public static String pesquisar(String nome){
        String saida = "";
        int aux = 0;
        for(Pessoa p : cadastro){
            aux++;
            if (p.getNome().equalsIgnoreCase(nome)){
                saida += p.dados() + "\n";
            }
            else if(aux == cadastro.size()){
                System.out.print("\nNome nao encontrado.");
            }
        }
        return saida;
    }

}
