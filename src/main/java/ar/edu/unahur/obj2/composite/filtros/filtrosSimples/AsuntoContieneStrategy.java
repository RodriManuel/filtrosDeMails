package ar.edu.unahur.obj2.composite.filtros.filtrosSimples;

import ar.edu.unahur.obj2.composite.mail.Mail;

public class AsuntoContieneStrategy extends FiltroSimple {
    private String palabra;

    public AsuntoContieneStrategy(Mail mail, String palabra) {
        super(mail);
        this.palabra = palabra;
    }

    @Override
    protected Boolean doAplicar() {
        return this.mail.getAsunto().contains(palabra);
    }

}
