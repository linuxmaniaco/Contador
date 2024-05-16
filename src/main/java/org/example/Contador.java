package org.example;

import Utils.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Imprime o primeiro numero");
        int parametroUm = terminal.nextInt();
        System.out.println("Imprime o segundo numero");
        int parametroDois = terminal.nextInt();

        try{
            contar(parametroUm, parametroDois);
                System.out.println("Processo encerrado");

        } catch (ParametrosInvalidosException exception){
            System.out.println("O segundo parametro deve ser maior que o primeiro. ");
        }

    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroDois > parametroUm){
            int contagem = parametroDois - parametroUm;
            for (int i=1; i<=contagem; i++){
                System.out.println(i);
            }
        } else{
            throw new ParametrosInvalidosException();
        }
    }
}