/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigorefactorizado;

/**
 *
 * @author avazquezsuarez
 */
public class CodigoRefactorizado {
    public static boolean esPrimo = false;

    public static void main(String[] args) {
        int numDigitos;
        int calcDigit;
        numerosprimos objeto = new numerosprimos();
        numDigitos = objeto.pedirNumDigitos();
        for (int i = 1; i <= 99999; i++) {
            calcDigit = objeto.calculaDigitos(i);
            if (calcDigit == numDigitos) {
                esPrimo = objeto.siIEsMenorA4(esPrimo, i);
                if (esPrimo == true) {
                    System.out.println(i);
                }
            }
        }
    }

}
