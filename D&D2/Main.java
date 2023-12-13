package ded2;

public class Main {

  private static void criaPersonagem(Personagem personagem) {

    personagem.geraPersonagem();

    personagem.imprimirValores();

  }

  public static void main(String[] args) {

    String nome1 = "diego";
    String nome2 = "henrique";
    String nome3 = "Rocha";
    String nome4 = "Silva";
    String nome5 = "aleatorio1";
    String nome6 = "Aleatorio2";

    Personagem personagem1 = new Guerreiro(nome1);

    Personagem personagem2 = new Ladino(nome2);

    Personagem personagem3 = new Barbaro(nome3);

    Personagem personagem4 = new Mago(nome4);

    Personagem personagem5 = new Monge(nome5);

    Personagem personagem6 = new Bardo(nome6);

    criaPersonagem(personagem1);
    criaPersonagem(personagem2);
    criaPersonagem(personagem3);
    criaPersonagem(personagem4);
    criaPersonagem(personagem5);
    criaPersonagem(personagem6);

  }

}
