/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeprov2;

import java.util.Scanner;

/**
 *
 * @author Sandro Fiabane
 */
public class Testeprov2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Faça um algoritmo que receba o valor do raio de um circulo qualquer.
Calcule o perímetro do círculo (P = 2.pi.r) , a Área do circulo (A = PI . r²)
e o Diâmetro do círculo (D = 2 . r). Mostre as respostas.
obs.: Para testar utilize o NetBeans,
em seguida na resposta coloque o link do GitHub com sua resposta.*/
        
        Scanner teclado = new Scanner(System.in);
        
        double valRaio, per, are, dia;
        System.out.println("Qual o raio do circulo?");
        valRaio = teclado.nextInt();
        per = 2*Math.PI*valRaio;
        are = Math.PI * Math.pow(valRaio, 2);
        dia = 2 * valRaio;
        System.out.println("O perímetro do círculo é: "+per+
                " A área do círculo é: "+are+ " O diâmetro do círculo é: "+dia);
    }
    
}
