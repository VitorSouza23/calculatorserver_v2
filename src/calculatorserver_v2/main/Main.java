/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorserver_v2.main;

import calculatorserver_v2.server.CalculatorServer;

/**
 *
 * @author Vitor
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Incializando o servidor...");
        new CalculatorServer();
        System.out.println("Servidor inicializado...");
    }
}
