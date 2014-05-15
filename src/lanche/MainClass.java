package lanche;

public class MainClass {

    public static void main(String[] args) {
        SanduicheFactory lanchonete = new SanduicheFactory();

        System.out.println(lanchonete.createSanduiche("XSalada").toString());
        System.out.println(lanchonete.createSanduiche("XTudo").toString());
        System.out.println(lanchonete.createSanduiche("Americano").toString());
        System.out.println(lanchonete.createSanduiche("XBacon").toString());
        System.out.println(lanchonete.createSanduiche("XBurger").toString());
        System.out.println(lanchonete.createSanduiche("XEggBacon").toString());

    }
}
