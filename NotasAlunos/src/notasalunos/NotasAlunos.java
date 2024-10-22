/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notasalunos;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class NotasAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidade = 5; // Definindo o tamanho do vetor
        double[] notas = new double[quantidade]; // Declaração do vetor

        // Entrada de dados
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Exibição das notas
        System.out.println("\nNotas dos Alunos:");
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + notas[i]);
        }

        scanner.close();
    }
}
