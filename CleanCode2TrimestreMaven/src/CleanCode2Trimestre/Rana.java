/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CleanCode2Trimestre;

/**
 *
 * @author alumno
 */
public class Rana extends Animal implements Presa {
    public Rana(double peso, int nroPatas) {
        super("Rana",peso, nroPatas, "sin pelo" );
    }
    @Override
    public void huir() {
        System.out.println("La rana intenta escapar de la pesa");
    }
    @Override
    public boolean cazado() {
        System.out.println("La rana ha sido cazada por la presa");
        return true;
    }
}
