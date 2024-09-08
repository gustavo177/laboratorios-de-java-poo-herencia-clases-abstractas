package org.gustavo.pooclasesabstractas.form.elementos;
import org.gustavo.pooclasesabstractas.form.elementos.select.*;
import org.gustavo.pooclasesabstractas.form.validador.EmailValidador;
import org.gustavo.pooclasesabstractas.form.validador.LargoValidador;
import org.gustavo.pooclasesabstractas.form.validador.RequeridoValidador;

import java.util.Arrays;
import java.util.List;
public class EjemploForm {
    public static void main(String[] args) {
        InputForm username = new InputForm("tavo");
        username.addValidador(new RequeridoValidador());
        InputForm password = new InputForm("clave", "password");
        password.addValidador(new RequeridoValidador())
                .addValidador(new LargoValidador(6,12));
        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());
        InputForm edad = new InputForm("edad", "number");
        TextareaForm experiencia = new TextareaForm("exp", 5,9);
        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addOpcion(new Opcion("1", "Java").setSelected())
        .addOpcion(new Opcion("2", "Python"))
        .addOpcion(new Opcion("3", "JavaScript"))
        .addOpcion( new Opcion("4", "TypeScript"))
        .addOpcion(new Opcion("5", "PHP"));
        ElementoForm saludar = new ElementoForm() {
            @Override
            public String dibujarHtml() {
                return "<input disabled name='"+this.nombre+"' value=\"" + this.valor + "\">";
            }
        };
        saludar.setValor("Hola que tal este campo está deshabilitado!");
        username.setValor("Tavo.doe");
        password.setValor("123456");
        email.setValor("tavo.doe@correo.com");
        edad.setValor("28");
        experiencia.setValor("... 5 años de experiencia ...");
        List<ElementoForm> elementos = Arrays.asList(
                username,
                password,
                email,
                edad,
                experiencia,
                lenguaje,
                saludar
        );

        elementos.forEach(e->{
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });
    }
}
