package org.jlag.poo.clasesabstractas.form.elementos.validador;

abstract public class Validador {
    protected String mensaje;

    abstract void setmensaje(String mensaje);

    abstract public String getmensaje();

    abstract public boolean esValido(String valor);
}
