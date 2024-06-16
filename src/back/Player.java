package back;

import com.google.gson.reflect.TypeToken;

import java.util.*;
import java.util.stream.Collectors;

public class Player extends User{
    protected HashmapHandler<LogrosTitle,Logro> logros=new HashmapHandler<>();
    protected Integer puntoGuardado;
    //protected Ventana ventana;
    protected Player(){
        setEstadoDeAcceso(EstadoDeAcceso.DESBLOQUEADO);
        cargarLogrosAjson();
        puntoGuardado=0;
        setLogros();
        //ventana=new Ventana(new ArrayList<>());
    }
    private void cargarLogrosAjson(){
        Logro felizAniversario=new Logro(LogrosTitle.FELIZ_ANIVERSARIO,"Tu primer año como agente en la YTP y no paras de romper logros");
        Logro encuentrosCercanosDelTercerTipo=new Logro(LogrosTitle.ENCUENTROS_CERCANOS_DEL_TERCER_TIPO,"De tu somnoliento viaje al mundo de los sueños te trajiste con vos una mausekeherramienta misteriosa");
        Logro aTrabajar=new Logro(LogrosTitle.A_TRABAJAR,"Mr.Increible: ");
        Logro noMeDejanSalir=new Logro(LogrosTitle.NO_ME_DEJAN_SALIR,"Estas verde pibe");
        Logro bienvenidosAlAbismoDeLosLamentos=new Logro(LogrosTitle.BIENVENIDOS_AL_ABISMO_DE_LOS_LAMENTOS,"Nuevo mapa desbloqueado: la China de Gengis");
        Logro chinChonChin=new Logro(LogrosTitle.CHIN_CHON_CHIN,"Manuel hablablo chino perfecto, vos solo entendias: ");
        Logro algunasCosas=new Logro(LogrosTitle.ALGUNAS_COSAS,"Esa maldita frase");
        Logro imTheOneWhoKnocks=new Logro(LogrosTitle.IM_THE_ONE_WHO_KNOCKS,"Lo que yo propongo es un imperio");
        Logro cuandoLlega=new Logro(LogrosTitle.CUANDO_LLEGA,"La empresa de trasporte no reporto salidas de unidades en este horario");
        Logro unaMuyViejaConocida=new Logro(LogrosTitle.UNA_MUY_VIEJA_CONOCIDA,"Tu encuentro con el oraculo te da la sospecha de haber...soñado con ella?");
        logros.agregarElemento(felizAniversario.getLogrosTitle(),felizAniversario);
        logros.agregarElemento(encuentrosCercanosDelTercerTipo.getLogrosTitle(),encuentrosCercanosDelTercerTipo);
        logros.agregarElemento(aTrabajar.getLogrosTitle(),aTrabajar);
        logros.agregarElemento(noMeDejanSalir.getLogrosTitle(),noMeDejanSalir);
        logros.agregarElemento(bienvenidosAlAbismoDeLosLamentos.getLogrosTitle(),bienvenidosAlAbismoDeLosLamentos);
        logros.agregarElemento(chinChonChin.getLogrosTitle(),chinChonChin);
        logros.agregarElemento(algunasCosas.getLogrosTitle(),algunasCosas);
        logros.agregarElemento(imTheOneWhoKnocks.getLogrosTitle(),imTheOneWhoKnocks);
        logros.agregarElemento(cuandoLlega.getLogrosTitle(),cuandoLlega);
        logros.agregarElemento(unaMuyViejaConocida.getLogrosTitle(),unaMuyViejaConocida);
        logros.cargarHashmapAJson(ARCHIVO_LOGROS);
    }
    public void setLogros(){logros = new HashmapHandler<>(logros.recibirHashmapDesdeJson(ARCHIVO_LOGROS,new TypeToken<HashMap<LogrosTitle, Logro>>() {}.getType()));}
    public List<Logro> verLogros(){
        List<Logro>logroList=logros.getHashMap().values().stream().filter(logro -> logro.getEstadoDeAcceso().equals(EstadoDeAcceso.DESBLOQUEADO)).collect(Collectors.toList());
        Collections.reverse(logroList);
        return logroList;
    }
    protected void setPuntoGuardado(Integer puntoGuardado){this.puntoGuardado=puntoGuardado;}
    public StringBuilder verPlayer() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("Player{ nick= ").append(getNick()).append(", logros= ").append(verLogros()).append("}");
        return stringBuilder;
    }
}
