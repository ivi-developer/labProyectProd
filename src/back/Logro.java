package back;
public class Logro{
    private String descripcion;
    private EstadoDeAcceso estadoDeAcceso;
    public Logro(String descripcion, EstadoDeAcceso estadoDeAcceso) {
        this.descripcion = descripcion;
        this.estadoDeAcceso = estadoDeAcceso;
    }
    public EstadoDeAcceso getEstadoDeAcceso(){return estadoDeAcceso;}
    public void setEstadoDeAcceso(EstadoDeAcceso estadoDeAcceso){this.estadoDeAcceso=estadoDeAcceso;}
}