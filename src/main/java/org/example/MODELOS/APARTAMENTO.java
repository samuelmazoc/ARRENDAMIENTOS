package org.example.MODELOS;

public class APARTAMENTO {

    private String barrio;

    private String ciudad;

    private String parqueadero;

    private String direccion;

    private String servicios;

    private Integer area;

    private Integer piso;

    public APARTAMENTO() {
    }

    public APARTAMENTO(String barrio, String ciudad, String parqueadero, String direccion, String servicios, Integer area, Integer piso) {
        this.area = area;
        this.piso = piso;
        this.barrio = barrio;
        this.ciudad = ciudad;
        this.parqueadero = parqueadero;
        this.direccion = direccion;
        this.servicios = servicios;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getPiso() {
        return piso;
    }

    public void setPiso(Integer piso) {
        this.piso = piso;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getParqueadero() {
        return parqueadero;
    }

    public void setParqueadero(String parqueadero) {
        this.parqueadero = parqueadero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }

    @Override
    public String toString() {
        return "APARTAMENTO{" +
                "area=" + area +
                ", piso=" + piso +
                ", barrio='" + barrio + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", parqueadero='" + parqueadero + '\'' +
                ", direccion='" + direccion + '\'' +
                ", servicios='" + servicios + '\'' +
                '}';
    }
}
