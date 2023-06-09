package models;

public class Sucursal extends Vehiculo{
    private String ciudad;
    private String direccion;
    private String telefono;

    public Sucursal() {
    }

    public Sucursal(String ciudad, String direccion, String telefono) {
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Sucursal(String modelo, int kilometros, int año, int codigo, int tarifaFija, int costo, String ciudad, String direccion, String telefono) {
        super(modelo, kilometros, año, codigo, tarifaFija,costo);
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "ciudad='" + ciudad + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
