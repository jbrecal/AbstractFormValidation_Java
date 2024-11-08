package org.juanbrenes.pooclasesabstractas.form.validador;

public class EmailValidador extends Validador{

    protected String mensaje = "El campo %s tiene un formato de correo incorrecto";

    private final static String EMAIL_REGEX = "^(.+)@(.+)$"; // el caracter gorro significa que va a validar el String en el comienzo de la cadena

    @Override
    void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        return valor.matches(EMAIL_REGEX);
    }
}
