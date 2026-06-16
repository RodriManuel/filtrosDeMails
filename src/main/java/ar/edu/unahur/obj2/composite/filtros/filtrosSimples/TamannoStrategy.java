package ar.edu.unahur.obj2.composite.filtros.filtrosSimples;

import ar.edu.unahur.obj2.composite.mail.Mail;

public class TamannoStrategy extends FiltroSimple {
    private Integer valorMinimo;

    public TamannoStrategy(Mail mail, Integer valorMinimo) {
        super(mail);
        this.valorMinimo = valorMinimo;
    }

    @Override
    protected Boolean doAplicar() {
        return Boolean.valueOf(this.mail.getTamanno() >= valorMinimo);
    }
    
}
