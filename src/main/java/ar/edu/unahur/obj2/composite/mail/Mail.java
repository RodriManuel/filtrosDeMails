package ar.edu.unahur.obj2.composite.mail;

import ar.edu.unahur.obj2.composite.filtros.filtrosSimples.DefaultFiltroSimpleStrategy;
import ar.edu.unahur.obj2.composite.interfaz.FiltroStrategy;

public class Mail {
    private String from;
    private String to;
    private String asunto;
    private Integer tamanno;
    private Boolean adjunto;
    private String cuerpo;

    private FiltroStrategy filtro;

    public Mail(String from, String to, String asunto, Integer tamanno, Boolean adjunto, String cuerpo) {
        this.from = from;
        this.to = to;
        this.asunto = asunto;
        this.tamanno = tamanno;
        this.adjunto = adjunto;
        this.cuerpo = cuerpo;
        filtro = new DefaultFiltroSimpleStrategy(this);
    }

//************************************************************************

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getAsunto() {
        return asunto;
    }

    public Integer getTamanno() {
        return tamanno;
    }

    public Boolean getAdjunto() {
        return adjunto;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public FiltroStrategy getFiltro() {
        return filtro;
    }

//************************************************************************
    
    public Boolean configurarFiltro() {
        return filtro.aplicar();
    }

}
