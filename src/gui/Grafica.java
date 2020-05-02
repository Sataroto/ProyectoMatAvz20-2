/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Logica.NumComplejo;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 *
 * @author futbo
 */
public class Grafica extends JPanel {
    public NumComplejo[] lista;
    public int scala;
    public static Color[] colores = {Color.red,Color.blue,Color.green, Color.orange, Color.CYAN, Color.GRAY,Color.MAGENTA, Color.PINK,Color.YELLOW,Color.WHITE};
    public Grafica(NumComplejo[] hola,int scala){
        System.out.println("Estamos en grafica");
        this.scala=scala;
        this.setSize(600, 600);
        lista=hola;
        this.setVisible(true);
    }
    public void paint(Graphics g){
        super.paintComponent(g);
            int xf, yf;
        g.drawLine(50, 50, 550, 50);
        g.drawLine(50, 50, 50,550);
        g.drawLine(550,50,550,550);
        g.drawLine(50, 550, 550, 550);
        g.drawLine(300, 100, 300, 500);
        g.drawLine(100, 300, 500, 300);
        for(int i =scala ; i<=200;i=i+scala){
            g.drawLine(300+i, 300-3, 300+i, 300+3);
            g.drawLine(300-i, 300-3, 300-i, 300+3);
            g.drawLine( 300-3, 300+i, 300+3 , 300+i);
            g.drawLine( 300-3, 300-i, 300+3 , 300-i);
        }
        for(int i =0; i<lista.length;i++){
            g.setColor(colores[i]);
            xf = (int)(lista[i].getX()*scala);
            yf = (int)(lista[i].getY()*scala);
            if(xf>250){
                xf=250;
            }
            else if(xf<-250){
                xf=-250;
            }
           
             if(yf>250){
                yf=250;
            }
            else if(yf<-250){
                yf=-250;
            }
            
            
            g.drawLine(300, 300, 300+xf, 300-yf);
            
        }
    }
    public static void main(String[] agggg){
        NumComplejo[] muestra = new NumComplejo[2];
        muestra[1]= new NumComplejo((double)3,(double)2);
        muestra[0] = new NumComplejo((double)2,(double)2);
        JFrame f1 = new JFrame();
        f1.setSize(600, 600);
        f1.add(new Grafica(muestra,100));
        f1.setVisible(true);
}
}
