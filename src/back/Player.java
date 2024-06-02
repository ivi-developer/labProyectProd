package back;

import java.util.*;

import java.util.stream.Collectors;

public class Player extends User{
    protected LinkedHashMap<LogrosTitle,Logro> logros;
    protected Integer puntoGuardado;
    protected Player(){
        super();
        puntoGuardado=0;
        logros=new LinkedHashMap<>();
        //ventana=new Ventana(new ArrayList<>());
    }
    //protected Ventana ventana;
    public void verLogros(){
        List<Logro>logroList=logros.values().stream().filter(logro -> logro.getEstadoDeAcceso().equals(EstadoDeAcceso.DESBLOQUEADO)).collect(Collectors.toList());
        Collections.reverse(logroList);
        System.out.println(logroList);
    }
    protected void setPuntoGuardado(Integer puntoGuardado){this.puntoGuardado=puntoGuardado;}
    @Override
    public String toString() {
        return super.toString()+ "Player{" +
                "logros=" + logros +
                ", puntoGuardado=" + puntoGuardado +
                '}';
    }
}
