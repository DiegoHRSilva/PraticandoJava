package ded2;

public class Barbaro extends Personagem {

  public void geraTotal() {

    somaConstituicao = calcularAtributo(constituicao) + 2;

    System.out.println(
        "Minha classe é Barbaro e meu atributo bonus é Constituicao -> " + somaConstituicao);

  }

}
