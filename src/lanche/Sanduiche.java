package lanche;

import java.util.ArrayList;

public class Sanduiche {

    private ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
    private Double preco;

    public Sanduiche(Double preco) {
        this.preco = preco;
    }

    public Double getPreco() {
        return preco;
    }

    public void addIngrediente(String ingrediente) {
        ingredientes.add(new Ingrediente(ingrediente));
    }

    public String toString() {
        String retorno = ("Foi requisitado um " + getClass().getName()
                + " que custa R$" + this.getPreco() + " que é feito com: ");
        for(Ingrediente ing : ingredientes){
            retorno = retorno + ing.getNome() + " ";
        }
        return retorno;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
