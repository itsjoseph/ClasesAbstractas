package org.jlag.poo.clasesabstractas.form.elementos.validador;

public class EmailValidador extends Validador{

    protected String mensaje = "El formato del email es invalido";

    private final static String EMAIL_REGEX = "^(.+)@(.+)$";
    @Override
    void setmensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getmensaje() {
        return this.mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        return valor.matches(EMAIL_REGEX);
    }
}
