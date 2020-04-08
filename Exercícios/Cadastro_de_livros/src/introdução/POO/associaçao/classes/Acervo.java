package introdução.POO.associaçao.classes;
import java.util.ArrayList;

public class Acervo {

    private static ArrayList<LivroLivraria> livros = new ArrayList<>();

    public static ArrayList<LivroLivraria> getLivros() {
        return livros;
    }


    public static void adicionar(LivroLivraria l){
        livros.add(l);

    }

    public static String listar(){
        String saida = "";
        int i = 1;

        for(LivroLivraria l : livros){
            saida += "\nLivro " + (i++);
            saida += l.dados() + "\n";
        }

        return saida;
    }

    public static int pesquisar(String genero){
        int qnt = 0;
        for(LivroLivraria l : livros){
            if(l.getGenero().equalsIgnoreCase(genero)){ // nao se preocupa com caixa alta.
                qnt += 1;
            }
        }
        return qnt;
    }

    public static int pesquisar(double vInicial, double vFinal){
        int qnt = 0;

        for(LivroLivraria l : livros){
            if(l.getPreco() >= vInicial && l.getPreco() <= vFinal){
                qnt++;
            }
        }
        return qnt;
    }

    public static boolean remover(String titulo){
        for(LivroLivraria l : livros){
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                livros.remove(l);
                return true;
            }

        }
        return false;
    }

    public static double calcularTotalacervo(){
        double total =  0.0;
        for(LivroLivraria l : livros){
            total += l.getPreco();
        }
        return total;
    }

}
