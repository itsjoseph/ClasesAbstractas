package org.jlag.poo.clasesabstractas.form.elementos.validador;

public class NumeroValidador extends Validador{
    protected String mensaje = "Debe ser numero";

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
        try {
            Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
