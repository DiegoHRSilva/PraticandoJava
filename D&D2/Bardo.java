package ded2;

public class Bardo extends Personagem {

  public void geraTotal() {

    somaCarisma = calcularAtributo(carisma) + 2;

    System.out.println(
        "Minha classe é Bardo e meu atributo bonus é Carisma -> " + somaCarisma);

  }

}
