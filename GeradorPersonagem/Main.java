package ded;

import java.util.Random;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o nome do personagem:");

    String nome = scanner.nextLine();

    Random random = new Random();

    int numeroClasse = random.nextInt(6) + 1;

    Personagem personagem = null;

    switch (numeroClasse) {
      case 1:
        personagem = new Guerreiro();
        break;
      case 2:
        personagem = new Ladino();
        break;
      case 3:
        personagem = new Barbaro();
        break;
      case 4:
        personagem = new Mago();
        break;
      case 5:
        personagem = new Monge();
        break;
      case 6:
        personagem = new Bardo();
        break;
    }

    System.out.println("Nome:" + nome);

    personagem.ordenarArrays();

    personagem.imprimirValores();

  }

}
