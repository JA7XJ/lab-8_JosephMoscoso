/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_josephmoscoso;

import java.util.ArrayList;

/**
 *
 * @author Joseph
 */
public class proyecto {

    private String Duracion;
    private String Nombre;
    private String Estado;
    ArrayList<actividades> Actividades = new ArrayList();

    public proyecto() {
    }

    public proyecto(String Duracion, String Nombre) {
        this.Duracion = Duracion;
        this.Nombre = Nombre;
    }

    public proyecto(String Duracion, String Nombre, String Estado) {
        this.Duracion = Duracion;
        this.Nombre = Nombre;
        this.Estado = Estado;
    }

    public String getDuracion() {
        return Duracion;
    }

    public void setDuracion(String Duracion) {
        this.Duracion = Duracion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public ArrayList<actividades> getActividades() {
        return Actividades;
    }

    public void setActividades(ArrayList<actividades> Actividades) {
        this.Actividades = Actividades;
    }

    @Override
    public String toString() {
        return Nombre;
    }

}
