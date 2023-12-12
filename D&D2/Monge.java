package ded2;

public class Monge extends Personagem {

  public void geraTotal() {

    somaSabedoria = calcularAtributo(sabedoria) + 2;

    System.out.println(
        "Minha classe é Monge e meu atributo bonus é Sabedoria -> " + somaSabedoria);

  }

}
