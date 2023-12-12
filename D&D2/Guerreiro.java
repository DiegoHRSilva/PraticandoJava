package ded2;

public class Guerreiro extends Personagem {
  @Override
  public void geraTotal() {

    somaForca = calcularAtributo(forca) + 2;

    System.out.println("Minha classe é Guerreiro e meu atributo bonus é força -> " + somaForca);

  }

}
