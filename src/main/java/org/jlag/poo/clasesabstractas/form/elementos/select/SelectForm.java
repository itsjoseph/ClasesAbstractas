package org.jlag.poo.clasesabstractas.form.elementos.select;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends Opcion.ElementoForm {
    private List<Opcion> opciones;

    public SelectForm(String nombre) {
        super(nombre);
        this.opciones = new ArrayList<Opcion>();
    }

    public SelectForm(String nombre, List<Opcion> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    @Override
    public String dibujarhtml() {
        StringBuilder sb = new StringBuilder("<select");
        sb.append(" name=\"").append(this.nombre).append("\"");

        for (Opcion opcion : this.opciones) {
            sb.append("\n<Option value=\"").append(opcion.getValor()).append("'");
            if (opcion.isSelected()) {
                sb.append(" selected");
                this.valor = opcion.getValor();
            }
            sb.append(">").append(opcion.getNombre()).append("</Option>");

        }
        sb.append("\n</select>");
        return sb.toString();
    }

    public SelectForm addOpciones(Opcion opcion) {
        this.opciones.add(opcion);
        return this;
    }
}
