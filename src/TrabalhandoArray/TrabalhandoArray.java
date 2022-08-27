package TrabalhandoArray;

import javax.swing.*;

public class TrabalhandoArray {
    public static void main(String[] args){
        //Declarando Array de países
        String[] paises = new String[4];
        //Abastecendo o array de paises
        for(int i = 0; i < 4; i++){
            paises[i] = JOptionPane.showInputDialog("Informe um país: ");
        }
        //Listando o array de países
        for(String listaPaises : paises){
            System.out.println(listaPaises);
        }

        //Declarando array de números
        int[] numeros = new int[10];
        //Abastecendo o array de números
        for(int i = 0; i < 10; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
        }
        //Listando o array de números
        for(Integer listaNumeros : numeros){
            System.out.println(listaNumeros);
        }

        //listando array de numeros antes do calculo
        int novoValor = 11;
        numeros[8] = novoValor + 4;
        for (Integer listaNumeros : numeros){
            System.out.println(listaNumeros);
        }
    }
}
