package org.gustavo.pooclasesabstractas.form.elementos;
import org.gustavo.pooclasesabstractas.form.elementos.select.*;
import java.util.Arrays;
import java.util.List;
public class EjemploForm {
    public static void main(String[] args) {
        InputForm username = new InputForm("tavo");
        InputForm password = new InputForm("clave", "password");
        InputForm email = new InputForm("email", "email");
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
//        java.setSelected(true);
        List<ElementoForm> elementos = Arrays.asList(
                username,
                password,
                email,
                edad,
                experiencia,
                lenguaje,
                saludar
        );
//        for (ElementoForm e: elementos){
//            System.out.println(e.dibujarHtml());
//            System.out.println("<br>");
//        }
        elementos.forEach(e->{
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });
    }
}
