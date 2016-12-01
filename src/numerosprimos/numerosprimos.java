package numerosprimos;

import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class numerosprimos {

    public int pedirNumDigitos() {//Method to ask for "numDigitos"
        int numDigitos = Integer.parseInt(JOptionPane.showInputDialog("Introducir nº de cifras."));
        while (numDigitos < 0 | numDigitos > 5) {
            numDigitos = Integer.parseInt(JOptionPane.showInputDialog("Introducir nº de cifras (Entre 0 y 5)."));
        }
        return numDigitos;
    }

    public int calculaDigitos(int numero) {//Number of digits
        int divisionEntera = numero;
        int contador = 0;
        while (divisionEntera != 0) {
            divisionEntera = divisionEntera / 10;
            contador++;
        }
        return contador;
    }
    
    public boolean siIEsMenorA4(boolean primo, int numero){
        if (numero < 4) {
                    primo = true;
                } else if (numero % 2 == 0) {
                    primo = false;
                } else {
                    if (sinUnoDosTres(numero) == 1) {
                        primo = true;
                    }
                }
        return primo;
    }
    
    private int sinUnoDosTres(int numero) {
        int contador1 = 0;
        int i1 = 1;
        int limite = (numero - 1) / 2;
        if (limite % 2 == 0) {
            limite--;
        }
        while (i1 <= limite) {
            if (numero % i1 == 0) {
                contador1++;
            }
            i1 += 2;
            if (contador1 == 2) {
                i1 = limite + 1;
            }
        }
        return contador1;
    }
}