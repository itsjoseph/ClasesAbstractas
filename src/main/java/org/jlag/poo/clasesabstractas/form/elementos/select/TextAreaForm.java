package org.jlag.poo.clasesabstractas.form.elementos.select;

public class TextAreaForm extends ElementoForm {
    private int filas;
    private int columns;

    public TextAreaForm(String nombre) {
        super(nombre);
    }

    public TextAreaForm(String nombre, int filas, int columns) {
        super(nombre);
        this.filas = filas;
        this.columns = columns;
    }

    @Override
    public String dibujarhtml() {
        return "<textarea name='" + this.nombre + "' cols='" + this.columns + "' rows='" + this.filas + "' >" + this.valor + "</textarea>";
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }
}
