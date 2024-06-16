package back;
public class Logro{
    private String descripcion;
    private LogrosTitle logrosTitle;
    private EstadoDeAcceso estadoDeAcceso;
    public Logro(LogrosTitle logrosTitle, String descripcion) {
        this.logrosTitle=logrosTitle;
        this.descripcion = descripcion;
        estadoDeAcceso=EstadoDeAcceso.BLOQUEADO;
    }
    public LogrosTitle getLogrosTitle(){return logrosTitle;}
    public EstadoDeAcceso getEstadoDeAcceso(){return estadoDeAcceso;}
    public void setEstadoDeAcceso(EstadoDeAcceso estadoDeAcceso){this.estadoDeAcceso=estadoDeAcceso;}

    @Override
    public String toString() {
        return "{" +
                "Titulo=" + logrosTitle +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}