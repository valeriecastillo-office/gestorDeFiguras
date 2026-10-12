/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author isaac
 */
public class Rectangulo extends FiguraGeometrica {
    private final Punto p1; // un vertice
    private final Punto p2; // el vertice opuesto
 
    public Rectangulo(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
 
    public Punto getP1() {
        return p1;
    }
 
    public Punto getP2() {
        return p2;
    }
 
    public double getBase() {
        return Math.abs(p2.getX() - p1.getX());
    }
 
    public double getAltura() {
        return Math.abs(p2.getY() - p1.getY());
    }
 
    @Override
    public double calcularArea() {
        return getBase() * getAltura();
    }
 
    @Override
    public void mover(double dx, double dy) {
        p1.setX(p1.getX() + dx);
        p1.setY(p1.getY() + dy);
        p2.setX(p2.getX() + dx);
        p2.setY(p2.getY() + dy);
    }
}