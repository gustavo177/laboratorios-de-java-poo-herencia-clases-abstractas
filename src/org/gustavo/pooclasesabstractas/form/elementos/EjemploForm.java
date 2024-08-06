package org.gustavo.pooclasesabstractas.form.elementos;

import org.gustavo.pooclasesabstractas.form.elementos.select.*;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm username = new InputForm("tavo");
        InputForm password = new InputForm("clave", "password");
        InputForm email = new InputForm("email", "email");
        InputForm edad = new InputForm("edad", "number");

        TextareaForm experiencia = new TextareaForm("exp", 5,9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        Opcion java = new Opcion("1", "Java");
        lenguaje.addOpcion(java);
        lenguaje.addOpcion(new Opcion("2", "Python"));
        lenguaje.addOpcion(new Opcion("3", "JavaScript"));
        lenguaje.addOpcion(new Opcion("4", "TypeScript"));
        lenguaje.addOpcion(new Opcion("5", "PHP"));

        username.setValor("Tavo.doe");
        password.setValor("123456");
        email.setValor("tavo.doe@correo.com");
        edad.setValor("28");
        java.setSelected(true);
    }
}
