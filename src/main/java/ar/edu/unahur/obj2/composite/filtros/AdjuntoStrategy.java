package ar.edu.unahur.obj2.composite.filtros;

import ar.edu.unahur.obj2.composite.mail.Mail;

public class AdjuntoStrategy extends FiltroSimple {

    public AdjuntoStrategy(Mail mail) {
        super(mail);
    }

    @Override
    protected Boolean doAplicar() {
        return this.mail.getAdjunto();
    }

}
