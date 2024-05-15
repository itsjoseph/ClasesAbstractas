package org.jlag.poo.clasesabstractas.form.elementos.validador;

public class RequeridoValidador extends Validador{
    protected String mensaje = "El campo es requerido";

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
        return (valor != null && valor.length() > 0);
    }
}
