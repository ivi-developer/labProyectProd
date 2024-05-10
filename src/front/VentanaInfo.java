package front;
public class VentanaInfo {
    private String imgPath;
    private String texto;
    private Integer id;
    public VentanaInfo(String imgPath,String texto){
        this.imgPath=imgPath;
        this.texto=texto;
    }
    public String getImgPath(){return imgPath;}
    public String getTexto(){return texto;}
}
