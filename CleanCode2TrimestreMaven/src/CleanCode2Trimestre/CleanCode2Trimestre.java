/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CleanCode2Trimestre;

/**
 *
 * @author alumno
 */
public class CleanCode2Trimestre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Leon leon = new Leon(150, 4);
        Gacela gacela = new Gacela(60, 4);
        Mosquito mosquito = new Mosquito(0.1);
        Rana rana = new Rana(10, 4);
        System.out.println("Acciones del león:");
        leon.mostrarInformacion();
        leon.localizar(gacela);
        leon.cazar(gacela);
        System.out.println("");
        System.out.println("Acciones de la gacela: ");
        gacela.mostrarInformacion();
        gacela.huir();
        gacela.cazado();
        System.out.println("");
        System.out.println("Acciones del mosquito");
        mosquito.mostrarInformacion();
        mosquito.localizar(rana);
        mosquito.cazar(rana);
        System.out.println("");
        System.out.println("Acciones de la rana:");
        rana.mostrarInformacion();
        rana.huir();
        rana.cazado();
    }
    
}
