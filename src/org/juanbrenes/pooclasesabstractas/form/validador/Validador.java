package org.juanbrenes.pooclasesabstractas.form.validador;

abstract public class Validador {

    protected String mensaje;

    abstract void setMensaje(String mensaje);
    abstract public String getMensaje();

    abstract public boolean esValido(String valor);
}
