package front;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ComponentEvent;

public class Ventana extends JFrame{
    ArrayList<VentanaInfo> ventanaInfos;
    private int indice=0;
    private JLabel lText; // JLabel para el texto

    public Ventana(ArrayList<VentanaInfo> ventanaInfos){
        this.ventanaInfos=ventanaInfos;
        setLayout(new BorderLayout());
        setUndecorated(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        JPanel imagePanel = new JPanel() {
            // Sobreescribimos el método para pintar el componente
            @Override
            protected void paintComponent(Graphics g) {
                if (indice < ventanaInfos.size()) {
                    String imgPath = ventanaInfos.get(indice).getImgPath();
                    ImageIcon imagen = new ImageIcon(imgPath);
                    g.drawImage(imagen.getImage(), 0, 0, getWidth(), getHeight(), null);
                }
            }
        };
        imagePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        lText = new JLabel(ventanaInfos.get(indice).getTexto());
        lText.setForeground(Color.GREEN); // Color del texto
        // Modificamos el tamaño de la fuente del texto
        Font fuente = lText.getFont();
        lText.setFont(new Font(fuente.getName(), fuente.getStyle(), 24)); // Cambia 24 por el tamaño deseado

        // Añadimos el texto al panel
        imagePanel.add(lText, BorderLayout.CENTER);

        // Añadimos el panel a la ventana
        add(imagePanel);

        // Hacemos visible la ventana
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                // Calcular la posición vertical después de que la ventana se ha redimensionado
                lText.setLocation((getWidth() - lText.getWidth()) / 2, getHeight() - lText.getHeight() - 300);
            }
        });

        lText.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Rectangle textBounds = lText.getBounds();
                if (indice < ventanaInfos.size() - 1) {
                    indice++;
                    String texto = ventanaInfos.get(indice).getTexto();
                    lText.setText(texto);
                    lText.setLocation((getWidth() - lText.getWidth()) / 2, getHeight() - lText.getHeight() - 300);
                    repaint();
                } else {
                        // Si no hay más ventanas, cerrar la aplicación
                    dispose();
                }
            }

        }
        );
    }
}