/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CleanCode2Trimestre;

/**
 *
 * @author alumno
 */
public class Animal {
    String nombreGenerico;
    double peso;
    int nroPatas;
    String pelo;
    public Animal(String nombreGenerico, double peso, int nroPatas, String pelo) {
        this.nombreGenerico = nombreGenerico;
        this.peso = peso;
        this.nroPatas = nroPatas;
        this.pelo = pelo;
    }
    public Animal() {
        nombreGenerico = "";
        peso = 0;
        nroPatas = 0;
        pelo = "";
    }

    public String getNombreGenerico() {return nombreGenerico;}
    public void setNombreGenerico(String nombreGenerico) {this.nombreGenerico = nombreGenerico;}

    public double getPeso() {return peso;}
    public void setPeso(double peso) {this.peso = peso;}

    public int getNroPatas() {return nroPatas;}
    public void setNroPatas(int nroPatas) {this.nroPatas = nroPatas;}

    public String getPelo() {return pelo;}
    public void setPelo(String pelo) {this.pelo = pelo;}
    
    public void mostrarInformacion() {
        System.out.println("Animal: " + nombreGenerico);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Número de patas: " + nroPatas);
        System.out.println("Tipo de pelo: " + pelo);
    }
}
