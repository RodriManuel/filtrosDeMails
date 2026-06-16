package ar.edu.unahur.obj2.composite.filtros.filtrosSimples;

import ar.edu.unahur.obj2.composite.interfaz.FiltroStrategy;
import ar.edu.unahur.obj2.composite.mail.Mail;

public abstract class FiltroSimple implements FiltroStrategy {
    protected Mail mail;

    public FiltroSimple(Mail mail) {
        this.mail = mail;
    }

    @Override
    public Boolean aplicar() {
        return doAplicar();
    }

    protected abstract Boolean doAplicar();


}
