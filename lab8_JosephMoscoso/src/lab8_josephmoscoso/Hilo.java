/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_josephmoscoso;

import javafx.scene.control.ComboBox;
import javax.swing.JComboBox;
import javax.swing.JProgressBar;

/**
 *
 * @author Joseph
 */
public class Hilo extends Thread {

    private String estado;
    private int duracion;
    private boolean vive;
    private boolean sigue;

    public Hilo(String estado, int duracion) {
        this.estado = estado;
        this.duracion = duracion;
        vive = true;
        sigue = true;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isSigue() {
        return sigue;
    }

    public void setSigue(boolean sigue) {
        this.sigue = sigue;
    }
    int c = 0;

    @Override
    public void run() {
        while (vive) {
            if (sigue) {
                c++;
            }
            if (duracion <= 0) {
                vive = false;
            }
            try {
                Thread.sleep(1000);
              //  duracion -= 1000;
            } catch (InterruptedException e) {
            }
            estado = "Terminado";
        }
    }

}
