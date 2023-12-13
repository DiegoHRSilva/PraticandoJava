package ded;

import java.util.Arrays;

public class Bardo extends Personagem {

  @Override
  public void imprimirValores() {
    System.out
        .println("Força: " + Arrays.toString(forca) + " -> " + calcularAtributo(forca));
    System.out
        .println("Destreza: " + Arrays.toString(destreza) + " -> " + calcularAtributo(destreza));
    System.out.println(
        "Constituição: " + Arrays.toString(constituicao) + " -> " + calcularAtributo(constituicao));
    System.out.println(
        "Inteligência: " + Arrays.toString(inteligencia) + " -> " + calcularAtributo(inteligencia));
    System.out
        .println("Sabedoria: " + Arrays.toString(sabedoria) + " -> " + calcularAtributo(sabedoria));
    System.out
        .println("Carisma: " + Arrays.toString(carisma) + " -> " + calcularAtributo(carisma));

    System.out.println(
        "Minha classe é Bardo e meu atributo bonus é Carisma -> "
            + (calcularAtributo(carisma) + 2));
  }
}
