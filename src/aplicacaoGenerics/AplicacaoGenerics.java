package aplicacaoGenerics;

import java.util.ArrayList;
import java.util.List;

public class AplicacaoGenerics {

    public static void main(String args []) {

        List<Carro> listaCarro = new ArrayList<>();

        listaCarro.add(new AudiA3());
        listaCarro.add(new Brasilia());
        listaCarro.add(new FiatToro());
        listaCarro.add(new Brasilia());
        imprimirListaCarros(listaCarro);

    }

    private static void imprimirListaCarros(List<? extends Carro> lista) {
        for (Carro listaCarro : lista) {
            System.out.println(listaCarro);
        }

        System.out.println(" \n  ****** Modelo, preço, cor e ano do carro AudiA3 ******* \n ");
        AudiA3 audiA3 = new AudiA3();
        audiA3.setModelo("e-Tron");
        audiA3.setPreco(130000.00);
        audiA3.setCor("Amarela");
        audiA3.setAno(2023);
        imprimir(audiA3);

        System.out.println(" \n ****** Modelo, preço, cor e ano do carro  Civic ******* \n ");
        Civic civic = new Civic();
        civic.setModelo("Honda City");
        civic.setPreco(110000.00);
        civic.setCor("Azul");
        civic.setAno(2023);
        imprimir(civic);

        System.out.println(" \n ****** Modelo, preço, cor e ano do carro Brasilia ******* \n ");
        Brasilia brasilia = new Brasilia();
        brasilia.setModelo("Sport");
        brasilia.setPreco(125000.00);
        brasilia.setCor("Cinza");
        brasilia.setAno(2023);
        imprimir(brasilia);

        System.out.println(" \n ****** Modelo, preço, cor e ano do carro FiatToro ******* \n ");
        FiatToro fiatToro = new FiatToro();
        fiatToro.setModelo("Volkswagen Fusca");
        fiatToro.setPreco(135000.00);
        fiatToro.setCor("Branca");
        fiatToro.setAno(2022);
        imprimir(fiatToro);

    }

    private static void imprimir(FiatToro fiatToro) {
        System.out.println("Carro FiatToro modelo  " + fiatToro.getModelo());
        System.out.println("Carro FiatToro preço R$ " + fiatToro.getPreco());
        System.out.println("Carro FiatToro na cor  " + fiatToro.getCor());
        System.out.println("Carro FiatToro do ano de " + fiatToro.getAno());

    }


    private static void imprimir(AudiA3 audiA3) {
        System.out.println("Carro AudiA3 modelo  " + audiA3.getModelo());
        System.out.println("Carro AudiA3 com o preço de R$  " + audiA3.getPreco());
        System.out.println("Carro AudiA3 na cor  " + audiA3.getCor());
        System.out.println("Carro AudiA3 do ano  de " + audiA3.getAno());

    }

    private static void imprimir(Civic civic) {
        System.out.println("Carro Civic modelo  " + civic.getModelo());
        System.out.println("Carro Civic com o preço de R$  " + civic.getPreco());
        System.out.println("Carro Civic na cor  " + civic.getCor());
        System.out.println("Carro Civic do  ano de " + civic.getAno());

    }

    private static void imprimir(Brasilia brasilia) {
        System.out.println("Carro Brasilia modelo  " + brasilia.getModelo());
        System.out.println("Carro Brasilia com o preço de R$  " + brasilia.getPreco());
        System.out.println("Carro Brasilia na cor  " + brasilia.getCor());
        System.out.println("Carro Brasilia do ano de " + brasilia.getAno());

    }
}
