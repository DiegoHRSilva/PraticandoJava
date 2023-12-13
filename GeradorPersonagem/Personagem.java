package ded;

import java.util.Arrays;
import java.util.Random;

public class Personagem {
  int[] forca = new int[4];
  int[] destreza = new int[4];
  int[] constituicao = new int[4];
  int[] inteligencia = new int[4];
  int[] sabedoria = new int[4];
  int[] carisma = new int[4];
  int somaForca = 0;
  int somaDestreza = 0;
  int somaConstituicao = 0;
  int somaInteligencia = 0;
  int somaSabedoria = 0;
  int somaCarisma = 0;

  Random random = new Random();

  public Personagem() {
    for (int i = 0; i < 4; i++) {
      forca[i] = random.nextInt(6) + 1;
      destreza[i] = random.nextInt(6) + 1;
      constituicao[i] = random.nextInt(6) + 1;
      inteligencia[i] = random.nextInt(6) + 1;
      sabedoria[i] = random.nextInt(6) + 1;
      carisma[i] = random.nextInt(6) + 1;
    }
    ordenarArrays();
  }

  private void ordenarArrays() {
    Arrays.sort(forca);
    Arrays.sort(destreza);
    Arrays.sort(constituicao);
    Arrays.sort(inteligencia);
    Arrays.sort(sabedoria);
    Arrays.sort(carisma);
  }

  protected int calcularAtributo(int[] vetor) {
    if (vetor.length <= 1) {
      return 0;
    }
    int soma = 0;
    for (int i = 1; i < vetor.length; i++) {
      soma += vetor[i];
    }
    return soma;
  }

  public void imprimirValores() {}
}
