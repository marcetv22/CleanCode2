/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CleanCode2Trimestre;

/**
 *
 * @author alumno
 */
public class Gacela extends Animal implements Presa {
    public Gacela(double peso, int nroPatas) {
        super("Gacela",peso, nroPatas,"aspero");
    }
    @Override
    public void huir() {
        System.out.println("La gacela huye de la presa");
    }
    @Override
    public boolean cazado() {
        System.out.println("La gacela ha sido cazada");
        return true;
    }
}