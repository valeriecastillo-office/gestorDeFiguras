/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Punto;
import Modelo.Rectangulo;

/**
 *
 * @author valerie
 */
public class ControladorRectangulo {

    private Rectangulo rect;
 
    public void crear(double x1, double y1, double x2, double y2) 
    {
        
        rect = new Rectangulo(new Punto(x1, y1), new Punto(x2, y2));
        
    }
 
    public boolean hayRectangulo() 
    { 
        return rect != null; 
    }
    
    public Rectangulo getRectangulo() 
    { 
        return rect; 
    }
 
    public double calcularArea() 
    { 
        return rect.calcularArea(); 
    }
 
    public boolean puntoDentro(double x, double y) 
    {
        
        double minX = Math.min(rect.getP1().getX(), rect.getP2().getX());
        double maxX = Math.max(rect.getP1().getX(), rect.getP2().getX());
        double minY = Math.min(rect.getP1().getY(), rect.getP2().getY());
        double maxY = Math.max(rect.getP1().getY(), rect.getP2().getY());
        return x >= minX && x <= maxX && y >= minY && y <= maxY;
        
    }
 
    public void escalar(double factor) 
    {
        
        if (factor <= 0) throw new IllegalArgumentException("El factor debe ser mayor que 0");
        Punto a = rect.getP1(), b = rect.getP2();
        double cx = (a.getX() + b.getX()) / 2, cy = (a.getY() + b.getY()) / 2;
        a.setX(cx + (a.getX() - cx) * factor); a.setY(cy + (a.getY() - cy) * factor);
        b.setX(cx + (b.getX() - cx) * factor); b.setY(cy + (b.getY() - cy) * factor);
        
    }
 
    public void mover(double dx, double dy) 
    { 
        rect.mover(dx, dy); 
    }
}
