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
public class WmaPlayAdapter implements FormatoAudio {

    private WmaPlay adaptado;

    public WmaPlayAdapter(WmaPlay adaptaQuem) {
        this.adaptado = adaptaQuem;
    }

    public void abrir(String arquivo) {
        adaptado.setFile(arquivo);
        adaptado.setLocation(0);
        adaptado.open();
    }

    public void reproduzir() {
        adaptado.play();
    }

    public void parar() {
        adaptado.stop();
    }
}
