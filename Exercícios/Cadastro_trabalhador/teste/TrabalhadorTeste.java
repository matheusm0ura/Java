package POO.Enum.teste;

import POO.Enum.classes.Projeto1.ContratoHora;
import POO.Enum.classes.Projeto1.Departamento;
import POO.Enum.classes.Projeto1.NivelTrabalhador;
import POO.Enum.classes.Projeto1.Trabalhador;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class TrabalhadorTeste {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in); input.useLocale(Locale.US);
        Scanner str = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //data precisa ser assim.
        System.out.print("Nome do departamento: ");
        String departamento = str.nextLine();

        System.out.print("DADOS DO TRABALHADOR");
        System.out.print("\nNome: ");
        String nome = str.nextLine();

        System.out.print("Nível: ");
        String nivel = str.nextLine();

        System.out.print("Salário base: ");
        double sal_base = input.nextDouble();

        Trabalhador trabalhador  = new Trabalhador(nome, NivelTrabalhador.valueOf(nivel), sal_base, new Departamento(departamento));

        System.out.print("Quantos contratos esse trabalhador possui? ");
        int n = input.nextInt();

        for(int i = 0; i < n; i++){
            System.out.printf("CONTRATO %d", i + 1);
            System.out.print("\nData (DD/MM/YYYY): ");
            Date data = sdf.parse(str.next());
            System.out.print("Valor por hora: ");
            double valor = input.nextDouble();
            System.out.print("Duração: ");
            int horas = input.nextInt();
            ContratoHora contrato = new ContratoHora(data, valor, horas);
            trabalhador.addContrato(contrato);
            System.out.println();
        }
        System.out.println();
        System.out.print("Mês e ano que deseja calcular os ganhos (MM/YYYY): ");
        String mes_ano = str.next();
        int mes = Integer.parseInt(mes_ano.substring(0,2));
        int ano = Integer.parseInt(mes_ano.substring(3));
        System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
        System.out.println("Ganhos de " + mes_ano + ": " + String.format("%.2f", trabalhador.ganhos(mes, ano)));

    }
}
