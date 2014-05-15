/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2_som;

/**
 *
 * @author groda
 */
public class MainClass {

    public static void main(String[] args) {
        WmaPlay wma = new WmaPlay();
        WmaPlayAdapter adap = new WmaPlayAdapter(wma);
        adap.abrir("--");
        adap.reproduzir();
        adap.parar();
    }
}
