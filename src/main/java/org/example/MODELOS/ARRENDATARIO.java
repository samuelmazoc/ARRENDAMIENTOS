package org.example.MODELOS;

public class ARRENDATARIO {
    private String nombre;

    private  String apellido;

    private String documento;

    private String celular;

    private String certificadoBancario;

    private Integer edad;

    private String certifiacdoLboral;

    public ARRENDATARIO() {
    }

    public ARRENDATARIO(String nombre, String apellido, String documento, String celular, String certificadoBancario, Integer edad, String certifiacdoLboral) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.celular = celular;
        this.certificadoBancario = certificadoBancario;
        this.edad = edad;
        this.certifiacdoLboral = certifiacdoLboral;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCertificadoBancario() {
        return certificadoBancario;
    }

    public void setCertificadoBancario(String certificadoBancario) {
        this.certificadoBancario = certificadoBancario;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getCertifiacdoLboral() {
        return certifiacdoLboral;
    }

    public void setCertifiacdoLboral(String certifiacdoLboral) {
        this.certifiacdoLboral = certifiacdoLboral;
    }
}
