import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner lerint = new Scanner(System.in);

        String nome, rg, cpf, data, endere;
        Pessoa objPessoa;
        int op;

        menu();

        do {
            System.out.print("Digite a opção desejada: ");
            op = lerint.nextInt();
            switch (op){

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                case 1:
                    System.out.print("\nDigite o nome da Pessoa: ");
                    nome = input.nextLine();

                    System.out.print("Endereço: ");
                    endere = input.nextLine();

                    System.out.print("CPF: ");
                    cpf = input.nextLine();

                    System.out.print("Digite a data de nascimento: ");
                    data = input.nextLine();

                    System.out.print("Digite o RG: ");
                    rg = input.nextLine();

                    objPessoa = new Pessoa(nome, rg, cpf, data, endere);
                    Sistema.cadastrar(objPessoa);
                    break;

                case 2:
                    if(! (Sistema.getCadastro().isEmpty())){
                        System.out.println(Sistema.listar());
                    }

                    else {
                        System.out.println("Nenhuma Pessoa cadastrada.");
                        break;
                    }
                    break;

                case 3:
                    if(! (Sistema.getCadastro().isEmpty())){
                        System.out.print("\nNome da pessoa que deseja excluir: ");
                        nome = input.nextLine();
                        if(Sistema.excluir(nome)) { // booleano
                            System.out.println("Pessoa removida com sucesso.");
                        }
                        else if(!Sistema.excluir(nome)){
                            System.out.println("Pessoa não encontrada.");
                        }
                    }

                    else {
                        System.out.println("Nenhuma Pessoa cadastrada.");
                    }
                    break;

                case 4:
                    if(! (Sistema.getCadastro().isEmpty())) {
                        System.out.print("\nNome que deseja pesquisar: ");
                        nome = input.nextLine();
                        System.out.println(Sistema.pesquisar(nome));

                    }
                    else {
                        System.out.println("Nenhuma pessoa cadastrada.");
                    }
                    break;

                default:
                    System.out.println("Opção inválida");

            }
        }while (op != 0);
    }
    private static void menu(){
        System.out.println("-------------------------------------------------------------------");
        System.out.println("        C A D A S T R O   D E    P E S S O A S");
        System.out.println("            0 - SAIR     ");
        System.out.println("            1 - CADASTRAR");
        System.out.println("            2 - EXIBIR TODOS OS CLIENTES");
        System.out.println("            3 - EXCLUIR");
        System.out.println("            4 - PESQUISAR PESSOAS");
        System.out.println("-------------------------------------------------------------------");
    }
}
