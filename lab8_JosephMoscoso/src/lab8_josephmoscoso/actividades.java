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
public class actividades {

    private String Nombre;
    private int Inicio;
    private int Duracion;
    private int Final;
    public String estado;
    ArrayList<actividades> Predecesoras = new ArrayList();
    ArrayList<actividades> Sucesoras = new ArrayList();
    private String Posibilidad;

    public actividades(String Nombre, int Duracion, String Posibilidad) {
        this.Nombre = Nombre;
        this.Duracion = Duracion;
        this.Posibilidad = Posibilidad;
    }

    public actividades(String Nombre, int Inicio, int Duracion, int Final, String estado, String Posibilidad) {
        this.Nombre = Nombre;
        this.Inicio = Inicio;
        this.Duracion = Duracion;
        this.Final = Final;
        this.estado = estado;
        this.Posibilidad = Posibilidad;
    }
    
    public actividades() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getInicio() {
        return Inicio;
    }

    public void setInicio(int Inicio) {
        this.Inicio = Inicio;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    public int getFinal() {
        return Final;
    }

    public void setFinal(int Final) {
        this.Final = Final;
    }

    public ArrayList<actividades> getPredecesoras() {
        return Predecesoras;
    }

    public void setPredecesoras(ArrayList<actividades> Predecesoras) {
        this.Predecesoras = Predecesoras;
    }

    public ArrayList<actividades> getSucesoras() {
        return Sucesoras;
    }

    public void setSucesoras(ArrayList<actividades> Sucesoras) {
        this.Sucesoras = Sucesoras;
    }

    public String getPosibilidad() {
        return Posibilidad;
    }

    public void setPosibilidad(String Posibilidad) {
        this.Posibilidad = Posibilidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString() {
        return Nombre;
    }

}
