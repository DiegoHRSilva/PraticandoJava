package ded2;

public class Ladino extends Personagem {

  @Override
  public void geraTotal() {

    somaDestreza = calcularAtributo(destreza) + 2;

    System.out.println("Minha classe é Ladino e meu atributo bonus é destreza -> " + somaDestreza);

  }

}
