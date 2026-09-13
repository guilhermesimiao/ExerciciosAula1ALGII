// Ler duas matrizes A e B do tipo vetor com 15 elementos cada. Construir uma matriz C, sendo esta a junção das duas outras matrizes. 
// Desta forma, C deverá ter o dobro de elementos, ou seja, 30. Apresentar a matriz C. 

import javax.swing.JOptionPane;

public class L06E {
    public static void main (String[]args){
        int vetorA[] = new int[15];
        int vetorB[] = new int[15];
        int vetorC[] = new int[30];

        for(int i = 0; i < vetorA.length; i++){
            String entrada = JOptionPane.showInputDialog(null, "Digite a " + (i+1) + "º informaçao para ser armazenada no vetorA: ");
            vetorA[i] = Integer.parseInt(entrada);
        }

        for(int i = 0; i < vetorA.length; i++){
            String entrada = JOptionPane.showInputDialog(null, "Digite a " + (i+1) + "º informaçao para ser armazenada no vetorB: ");
            vetorB[i] = Integer.parseInt(entrada);
        }

        for (int i = 0; i < vetorA.length; i++){
                vetorC[i] = vetorA[i];
        }

        for(int i = 0; i < vetorB.length; i++){
            vetorC[i + vetorA.length] = vetorB[i];
        }

        String exibeTexto = "--- Juntando conjutos em um maior ---\n\n";
        
        for(int i = 0; i < vetorC.length; i++){
            exibeTexto += "VetorC[" + i + "] = " + vetorC[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, exibeTexto);
    }
}