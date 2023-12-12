package ded;

public class Mago extends Personagem {

  public void geraTotal() {

    somaInteligencia = calcularAtributo(inteligencia) + 2;

    System.out.println(
        "Minha classe é Mago e meu atributo bonus é Inteligencia -> " + somaInteligencia);

  }

}
