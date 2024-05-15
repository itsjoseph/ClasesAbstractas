package org.jlag.poo.clasesabstractas.form.elementos;

import org.jlag.poo.clasesabstractas.form.elementos.select.InputForm;
import org.jlag.poo.clasesabstractas.form.elementos.select.SelectForm;
import org.jlag.poo.clasesabstractas.form.elementos.select.TextAreaForm;
import org.jlag.poo.clasesabstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InputForm username = new InputForm("username");
        InputForm password = new InputForm("clave", "password");
        InputForm email = new InputForm("email");
        InputForm edad = new InputForm("edad", "number");

        TextAreaForm experiencia = new TextAreaForm("xp",5,9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        Opcion java = new Opcion("1","java");
        lenguaje.addOpciones(java);
        lenguaje.addOpciones(new Opcion("2","Python"));
        lenguaje.addOpciones(new Opcion("3","Javascript"));
        lenguaje.addOpciones(new Opcion("4","TypeScript"));
        lenguaje.addOpciones(new Opcion("5","PHP"));

        username.setValor("luis");
        password.setValor("123");
        email.setValor("luis@gmail.com");
        edad.setValor("25");
        experiencia.setValor("mas de 10 años de experiencia");

        java.setSelected(true);

        List<Opcion.ElementoForm> elementoForms = new ArrayList<>();
        elementoForms.add(username);
        elementoForms.add(password);
        elementoForms.add(email);
        elementoForms.add(edad);
        elementoForms.add(experiencia);
        elementoForms.add(lenguaje);

        for (Opcion.ElementoForm elementoForm : elementoForms) {
            System.out.println(elementoForm.dibujarhtml());
        }
    }
}