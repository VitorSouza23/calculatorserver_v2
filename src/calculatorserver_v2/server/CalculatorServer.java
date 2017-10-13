/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorserver_v2.server;

import calculatorserver_v2.interfaces.ICalculator;
import calculatorserver_v2.vo.Calculator;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 *
 * @author Vitor
 */
public class CalculatorServer {

    public CalculatorServer() {
        try {
            ICalculator _calculator = new Calculator();
            System.out.println("/tGerando nome do objeto remoto...");
            Naming.rebind("Calculator", _calculator);
            System.out.println("/tObjeto remoto criado.");
        } catch (MalformedURLException | RemoteException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    
}
