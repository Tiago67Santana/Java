package com.mycompany.operadores_logicos;

public class OperadoresLogicos {

    public static void main(String[] args) {
        // Declaração de variáveis
        boolean temSol = true;
        boolean folga = false;

        // Só irá passear se as duas condições forem verdadeiras
        if (temSol && folga) {
            System.out.println("Irei passear hoje! =D");
        } else {
            System.out.println("Não irei passear! =(");
        }
    }
}