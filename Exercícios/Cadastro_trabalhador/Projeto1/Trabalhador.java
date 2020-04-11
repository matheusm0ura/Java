package POO.Enum.classes.Projeto1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
    private String nome;
    private NivelTrabalhador nivel;
    private Double sal_base;
    private Departamento departamento;
    private List<ContratoHora> contratos = new ArrayList<>();

    public Trabalhador(String nome, NivelTrabalhador nivel, Double sal_base, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.sal_base = sal_base;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelTrabalhador getNivel() {
        return nivel;
    }

    public void setNivel(NivelTrabalhador nivel) {
        this.nivel = nivel;
    }

    public Double getSal_base() {
        return sal_base;
    }

    public void setSal_base(Double sal_base) {
        this.sal_base = sal_base;
    }

    public void addContrato(ContratoHora contrato){
        contratos.add(contrato);
    }
    public void removeContrato(ContratoHora contrato){
        contratos.remove(contrato);
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Double ganhos(int mes, int ano){
        double soma = sal_base;
        Calendar cal = Calendar.getInstance();
        for(ContratoHora c : contratos){
            cal.setTime(c.getDate());
            int c_mes = 1 + cal.get(Calendar.MONTH);
            int c_ano = cal.get(Calendar.YEAR);
            if(mes == c_mes && ano == c_ano){
                soma += c.valorTotal();
            }
        }
        return soma;
    }
}
