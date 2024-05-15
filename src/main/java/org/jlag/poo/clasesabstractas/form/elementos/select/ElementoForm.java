package org.jlag.poo.clasesabstractas.form.elementos.select;

import org.jlag.poo.clasesabstractas.form.elementos.validador.Validador;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {

    protected String valor;
    protected String nombre;

    private List<Validador> validadors;
    private List<String> errores;

    public ElementoForm() {
        this.validadors = new ArrayList<>();
        this.errores = new ArrayList<String>();
    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public ElementoForm addValidador(Validador validador) {
        this.validadors.add(validador);
        return this;
    }

    public List<String> getErrores() {
        return errores;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public boolean esValido() {
        for (Validador v: this.validadors) {
            if (!v.esValido(this.valor)){
                this.errores.add(v.getmensaje());
            }
        }
        return this.errores.isEmpty();
    }

}

