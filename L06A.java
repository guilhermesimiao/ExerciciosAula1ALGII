//Ler 10 elementos de uma matriz tipo vetor e apresentá-los. 

import javax.swing.JOptionPane;

public class L06A{
    public static void main (String[]args){
        String vetorAleatório [] = new String[10];

        for(int i = 0; i < vetorAleatório.length; i++){
            String entrada = JOptionPane.showInputDialog(null, "Digite a " + (i+1) + "º informaçao para ser armazenada no vetor: ");
            vetorAleatório[i] = entrada;
        }
        
        String listaAleatória = "--- LISTA ALEATÓRIA QUE VOCÊ ACABOU DE FAZER ---\n\n";

        for (int i = 0; i < vetorAleatório.length; i++){
            listaAleatória += (1 + i) + "º = " + vetorAleatório[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, listaAleatória);
    }   
}