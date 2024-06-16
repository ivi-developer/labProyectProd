package back;
public abstract class User{
    protected static final String ARCHIVO_JUGADORES="jugadores";
    protected static final String ARCHIVO_LOGROS="logros";
    protected static final String PAPELERA_JUGADORES="jugadoresBorrados";
    private String nick;
    private String password;
    private EstadoDeAcceso estadoDeAcceso;
    protected void setNick(String nick){this.nick=nick;}
    protected String getNick(){return nick;}
    public EstadoDeAcceso getEstadoDeAcceso(){return estadoDeAcceso;}
    public void setEstadoDeAcceso(EstadoDeAcceso estadoDeAcceso){this.estadoDeAcceso = estadoDeAcceso;}
    protected void setPassword(String password){this.password=password;}
    protected String getPassword(){return password;}

    @Override
    public String toString() {
        return "User{" +
                " nick='" + nick + '\'' +
                '}';
    }
}
