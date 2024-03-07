/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CleanCode2Trimestre;

/**
 *
 * @author alumno
 */
public class Mosquito extends Animal implements Depredador, Presa {
    public Mosquito(double peso) {
        super("Mosquito", peso, 6,"sin pelo" );
    }
    @Override
    public void localizar(Animal presa) {
        System.out.println("El mosquito ha localizado su presa");
    }
    @Override
    public void cazar(Animal presa) {
        System.out.println("El mosquito intenta picar a su presa");
    }
    @Override
    public void huir() {
        System.out.println("La presa intenta escaparse del mosquito");
    }
    @Override
    public boolean cazado() {
        System.out.println("El mosquito consigue picar a la presa");
        return true;
    }
}