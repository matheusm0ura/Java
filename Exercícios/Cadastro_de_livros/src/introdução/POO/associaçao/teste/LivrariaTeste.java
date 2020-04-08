package introdução.POO.associaçao.teste;
import introdução.POO.associaçao.classes.Acervo;
import introdução.POO.associaçao.classes.LivroLivraria;
import java.util.Locale;
import java.util.Scanner;

public class LivrariaTeste {
    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);
        Scanner input = new Scanner(System.in); input.useLocale(Locale.US);

        int menu;
        double vInicial, vFinal;

        LivroLivraria objLivro; // referencia para a classe LivroLivraria.

        String titulo, autor, genero;
        float preco;
        int isbn;

        exibirMenu();

        do{
            System.out.print("Opção: ");
            menu = input.nextInt();
            switch (menu){
                case 1:
                    System.out.print("\nTitulo: ");
                    titulo = inputString.nextLine();

                    System.out.print("\nAutor: ");
                    autor = inputString.nextLine();

                    System.out.print("\nGênero: ");
                    genero = inputString.nextLine();

                    System.out.print("\nPreço: ");
                    preco = input.nextFloat();

                    System.out.print("\nISBN: ");
                    isbn = input.nextInt();

                    objLivro = new LivroLivraria(titulo,autor, isbn, genero, preco);
                    Acervo.adicionar(objLivro);
                    break;

                case 2:
                    if(! (Acervo.getLivros().isEmpty())){
                    System.out.print("\nListagem de livros");
                    System.out.println(Acervo.listar());
                    }

                    else {
                        System.out.println("Nenhum livro cadastrado");
                        break;
                    }
                    break;

                case 3:
                    System.out.print("\nExclusão do livro");
                    System.out.print("\nDigite o título: ");
                    titulo = inputString.nextLine();

                    if( ! (Acervo.getLivros().isEmpty())){
                        if(Acervo.remover(titulo)) {
                            System.out.print("\nLivro removido com sucesso.");
                        }
                    }
                        else {
                        System.out.print("Não existem livros no acervo.");
                    }
                    break;

                case 4:
                    System.out.print("\nPesquisa por gênero");
                    System.out.print("\nDigite o gênero: ");
                    genero = inputString.nextLine();
                    System.out.printf("Existem %d livro(s) do gênero %s", Acervo.pesquisar(genero), genero);
                    break;

                case 5:
                    System.out.print("Faixa de preço");
                    System.out.print("\nDigite a faixa de preço inicial: ");
                    vInicial = input.nextDouble();

                    System.out.print("\nDigite a faixa de preço final: ");
                    vFinal = input.nextDouble();

                    System.out.printf("\nExistem %d livro(s) com preço entre R$ %.2f e R$ %.2f", Acervo.pesquisar(vInicial, vFinal), vInicial, vFinal);
                    break;

                case 6:
                    System.out.printf("\nO total em R$ de livros no acervo é de: %.2f", Acervo.calcularTotalacervo());
                    break;

                case 7:
                    System.out.print("\nPrograma encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");

            }
        }while (menu != 7);
    }
    static void exibirMenu(){
        System.out.println("\n1 - CADASTRAR");
        System.out.println("2 - LISTAR");
        System.out.println("3 - EXCLUIR LIVRO");
        System.out.println("4 - PESQUISAR GENERO");
        System.out.println("5 - PESQUISAR POR FAIXA DE PREÇO");
        System.out.println("6 - CALCULAR TOTAL DO ACERVO");
        System.out.println("7 - SAIR");


    }
}
