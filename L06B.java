/*
* Ler 8 elementos em uma matriz A tipo vetor. Construir uma matriz B de mesma dimensão com os
* elementos da matriz A multiplicados por 3. O elemento B[i] deverá ser implicado pelo elemento
* A[i]*3, o elemento B[2] implicado pelo elemento A[2]*3 e assim por diante, até 8. Apresentar o vetor B.
*/ 

import javax.swing.JOptionPane;

public class L06B {
    public static void main (String[]args){
        int vetorA[] = new int[8];
        int vetorB[] = new int[8];

        for(int i = 0; i < vetorA.length; i++){
            String entrada = JOptionPane.showInputDialog(null, "Digite a " + (i+1) + "º informaçao para ser armazenada no vetor: ");
            vetorA[i] = Integer.parseInt(entrada);
        }

        for(int i = 0; i < vetorB.length; i++){
            vetorB[i] = vetorA[i] * 3;
        }

        String exibeTexto = "--- Multiplicação por 3 ---\n\n";
        
        for(int i = 0; i < vetorA.length; i++){
            exibeTexto += vetorA[i] + " x 3 = " + vetorB[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, exibeTexto);

    }
}