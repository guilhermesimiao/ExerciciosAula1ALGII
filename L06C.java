//Ler duas matrizes A e B do tipo vetor com 20 elementos. Construir uma matriz C, onde cada elemento de C é a subtração do 
//elemento correspondente de A com B. Apresentar a matriz C. 

import javax.swing.JOptionPane;

public class L06C{
    public static void main (String[]args){
        int vetorA[] = new int[20];
        int vetorB[] = new int[20];
        int vetorC[] = new int[20];

        for(int i = 0; i < vetorA.length; i++){
            String entrada = JOptionPane.showInputDialog(null, "Digite a " + (i+1) + "º informaçao para ser armazenada no vetor A: ");
            vetorA[i] = Integer.parseInt(entrada);
        }

        for(int i = 0; i < vetorB.length; i++){
            String entrada = JOptionPane.showInputDialog(null, "Digite a " + (i+1) + "º informaçao para ser armazenada no vetor B: ");
            vetorB[i] = Integer.parseInt(entrada);
        }

        for(int i = 0; i < vetorB.length; i++){
            vetorC[i] = vetorA[i] - vetorB[i];
        }

        String exibeTexto = "--- Subtração ---\n\n";
        
        for(int i = 0; i < vetorA.length; i++){
            exibeTexto += vetorA[i] + " - " + vetorB[i] + " = " + vetorC[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, exibeTexto);
    }
}