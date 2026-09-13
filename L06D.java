// Ler 15 elementos de uma matriz tipo vetor. Construir uma matriz B de mesmo tipo, observando a seguintes lei de formação: 
// “Todo elemento de B deverá ser o quadrado do elemento de A correspondente”. Apresentar as matrizes A e B. 

import javax.swing.JOptionPane;

public class L06D {
    public static void main (String[]args){
        int vetorA[] = new int[15];
        int vetorB[] = new int[15];

        for(int i = 0; i < vetorA.length; i++){
            String entrada = JOptionPane.showInputDialog(null, "Digite a " + (i+1) + "º informaçao para ser armazenada no vetor: ");
            vetorA[i] = Integer.parseInt(entrada);
        }

        for(int i = 0; i < vetorB.length; i++){
            vetorB[i] = vetorA[i] * vetorA[i];
        }

        String exibeTexto = "--- Multiplicação por 3 ---\n\n";
        
        for(int i = 0; i < vetorA.length; i++){
            exibeTexto += vetorA[i] + "² = " + vetorB[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, exibeTexto);

    }
}