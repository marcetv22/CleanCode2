/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CleanCode2Trimestre;

/**
 *
 * @author alumno
 */
public class Leon extends Animal implements Depredador, Presa {
    public Leon(double peso, int nroPatas) {
        super("León",peso, nroPatas, "liso");
    }
    @Override
    public void localizar(Animal presa) {
        System.out.println("El león ha localizado a la presa");
    }
    @Override
    public void cazar(Animal presa) {
        System.out.println("El león intenta cazar a la presa");
    }
    @Override
    public void huir() {
        System.out.println("La presa está huyendo del león.");
    }
    @Override
    public boolean cazado() {
        System.out.println("La presa ha sido cazada por el león.");
        return true;
    }
}
