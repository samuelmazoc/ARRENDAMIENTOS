package org.example.MODELOS;

public class PROPIETARIO {
    private String nombre;

    private String apelido;

    private String documentoIdentidad;

    private String celular;

    private String direccion;

    private Integer costos;

    private Integer edad;

    public PROPIETARIO() {
    }

    public PROPIETARIO(String nombre, String apelido, String documentoIdentidad, String celular, String direccion, Integer costos, Integer edad) {
        this.nombre = nombre;
        this.apelido = apelido;
        this.documentoIdentidad = documentoIdentidad;
        this.celular = celular;
        this.direccion = direccion;
        this.costos = costos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getCostos() {
        return costos;
    }

    public void setCostos(Integer costos) {
        this.costos = costos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
