package ded2;

public class Main {

  private static void criaPersonagem(String nome, Personagem personagem) {
    System.out.println("Nome:" + nome);
    personagem.ordenarArrays();
    personagem.imprimirValores();
  }

  public static void main(String[] args) {

    String nome1 = "diego";
    String nome2 = "henrique";
    String nome3 = "Rocha";
    String nome4 = "Silva";
    String nome5 = "aleatorio1";
    String nome6 = "Aleatorio2";

    Personagem personagem1;
    Personagem personagem2;
    Personagem personagem3;
    Personagem personagem4;
    Personagem personagem5;
    Personagem personagem6;

    personagem1 = new Guerreiro();

    personagem2 = new Ladino();

    personagem3 = new Barbaro();

    personagem4 = new Mago();

    personagem5 = new Monge();

    personagem6 = new Bardo();

    criaPersonagem(nome1, personagem1);
    criaPersonagem(nome2, personagem2);
    criaPersonagem(nome3, personagem3);
    criaPersonagem(nome4, personagem4);
    criaPersonagem(nome5, personagem5);
    criaPersonagem(nome6, personagem6);

  }
}
