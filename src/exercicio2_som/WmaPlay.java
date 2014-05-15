/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2_som;

import static java.lang.Thread.sleep;

/**
 *
 * @author groda
 */
public class WmaPlay {

    private String arquivo;
    private int location;

    public void setFile(String file) {
        arquivo = file;
        System.out.println("set1");
    }

    public void open() {
        System.out.println("abriu");
    }

    public void setLocation(int location) {
        this.location = location;
        System.out.println("set2");
    }

    public void play() {

        System.out.println("TUSTS TUTS TUTS TUTS");

    }

    public void stop() {
        System.out.println("...");
    }
}
