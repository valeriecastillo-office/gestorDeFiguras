/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Vista;

import Controlador.ControladorRectangulo;
import Modelo.Punto;
import Modelo.Rectangulo;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
 
// Panel donde se dibuja el rectangulo.
// El origen (0,0) esta en la esquina superior izquierda.
public class PanelDibujo extends JPanel {
    private final ControladorRectangulo controlador;
    private Punto puntoPrueba;
 
    public PanelDibujo(ControladorRectangulo controlador) {
        this.controlador = controlador;
        setBackground(Color.WHITE);
    }
 
    public void setPuntoPrueba(Punto p) {
        puntoPrueba = p;
    }
 
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
 
        if (controlador.hayRectangulo()) {
            Rectangulo r = controlador.getRectangulo();
            int x = (int) Math.min(r.getP1().getX(), r.getP2().getX());
            int y = (int) Math.min(r.getP1().getY(), r.getP2().getY());
            int base = (int) r.getBase();
            int altura = (int) r.getAltura();
 
            g.setColor(Color.CYAN);
            g.fillRect(x, y, base, altura);
            g.setColor(Color.BLUE);
            g.drawRect(x, y, base, altura);
        }
 
        if (puntoPrueba != null) {
            g.setColor(Color.RED);
            g.fillOval((int) puntoPrueba.getX() - 4, (int) puntoPrueba.getY() - 4, 8, 8);
        }
    }
}
