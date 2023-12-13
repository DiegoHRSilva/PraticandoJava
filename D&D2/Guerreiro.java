package ded2;

import java.util.Arrays;

public class Guerreiro extends Personagem {

  public Guerreiro(String nome) {
    super(nome);
  }

  @Override
  public void geraPersonagem() {

    setForca();
    setDestreza();
    setConstituicao();
    setInteligencia();
    setSabedoria();
    setCarisma();

  }

  @Override
  public void imprimirValores() {

    System.out.println("Nome: " + getNome());

    System.out.println("------------------------------------------------------------------------");

    System.out.println(
        "Força: " + Arrays.toString(getForca()) +
            " -> " + calcularAtributo(getForca()));

    System.out.println(
        "Destreza: " + Arrays.toString(getDestreza()) +
            " -> " + calcularAtributo(getDestreza()));

    System.out.println(
        "Constituição: " + Arrays.toString(getConstituicao()) +
            " -> " + calcularAtributo(getConstituicao()));

    System.out.println(
        "Inteligência: " + Arrays.toString(getInteligencia()) +
            " -> " + calcularAtributo(getInteligencia()));

    System.out
        .println("Sabedoria: " + Arrays.toString(getSabedoria()) +
            " -> " + calcularAtributo(getSabedoria()));

    System.out.println(
        "Carisma: " + Arrays.toString(getCarisma()) +
            " -> " + calcularAtributo(getCarisma()));

    System.out.println("Minha classe é Guerreiro e meu atributo bonus é força -> "
        + (calcularAtributo(getForca()) + 2));

    System.out.println("------------------------------------------------------------------------");

  }
}
