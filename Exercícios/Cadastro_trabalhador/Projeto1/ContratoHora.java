package POO.Enum.classes.Projeto1;

import java.util.Date;

public class ContratoHora {
    private Date date;
    private Double valor_por_hora;
    private Integer horas;

    public ContratoHora(Date date, Double valor_por_hora, Integer horas) {
        this.date = date;
        this.valor_por_hora = valor_por_hora;
        this.horas = horas;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValor_por_hora() {
        return valor_por_hora;
    }

    public void setValor_por_hora(Double valor_por_hora) {
        this.valor_por_hora = valor_por_hora;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Double valorTotal(){
        return valor_por_hora * horas;
    }
}
