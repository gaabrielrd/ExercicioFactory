package lanche;

public class SanduicheFactory {

    public Sanduiche createSanduiche(String tipo) {
        switch (tipo) {
            case "XSalada":
                return new XSalada();
            case "Americano":
                return new Americano();
            case "XBurger":
                return new XBurger();
            case "XBacon":
                return new XBacon();
            case "XEggBacon":
                return new XEggBacon();
            case "XTudo":
                return new XTudo();
            default:
                return null;
        }
    }
}
