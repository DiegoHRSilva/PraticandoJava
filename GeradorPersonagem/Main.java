package ded;

import java.util.Random;
import java.util.Scanner;

public class Main {

  private static void criaPersonagem(Personagem personagem) {

    personagem.geraPersonagem();

    personagem.imprimirValores();

  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o nome do personagem:");

    String nome = scanner.nextLine();

    Random random = new Random();

    int numeroClasse = random.nextInt(6) + 1;

    if (numeroClasse == 1) {
      Personagem personagem = new Guerreiro(nome);
      criaPersonagem(personagem);
    }
    if (numeroClasse == 2) {
      Personagem personagem = new Ladino(nome);
      criaPersonagem(personagem);
    }
    if (numeroClasse == 3) {
      Personagem personagem = new Barbaro(nome);
      criaPersonagem(personagem);
    }
    if (numeroClasse == 4) {
      Personagem personagem = new Mago(nome);
      criaPersonagem(personagem);
    }
    if (numeroClasse == 5) {
      Personagem personagem = new Monge(nome);
      criaPersonagem(personagem);
    }
    if (numeroClasse == 6) {
      Personagem personagem = new Bardo(nome);
      criaPersonagem(personagem);
    }

  }

}
