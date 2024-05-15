package org.jlag.poo.clasesabstractas.form.elementos.select;

import org.jlag.poo.clasesabstractas.form.elementos.select.Opcion;

public class InputForm extends Opcion.ElementoForm {

    private String tipo = "text";

    public InputForm(String nombre) {
        super(nombre);
    }

    public InputForm(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    public String dibujarhtml() {
        return "<input type=\"" + this.tipo + "\" name=\"" + this.nombre + "\" value=\"" + this.valor + "\">";
    }

    @Override
    public void setValor(String valor) {
        super.setValor(valor);
    }

    public String getTipo() {
        return tipo;
    }
}
