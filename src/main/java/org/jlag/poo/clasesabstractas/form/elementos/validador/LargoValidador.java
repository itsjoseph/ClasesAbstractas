package org.jlag.poo.clasesabstractas.form.elementos.validador;

public class LargoValidador extends Validador {

    protected String mensaje = "EL campo debe tener minimo %d caracteres y máximo %d caracteres";
    private int min;
    private int max = Integer.MAX_VALUE;

    public LargoValidador(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public LargoValidador() {
    }

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
        this.mensaje = String.format(this.mensaje, this.min, this.max);
        if (valor == null) {
            return true;
        }
        int largo = valor.length();
        return (largo >= this.min && largo <= this.max);
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
