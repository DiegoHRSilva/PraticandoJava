package ded;

import java.util.Arrays;
import java.util.Random;

public abstract class Personagem {
  private String Nome;
  private int[] forca = new int[4];
  private int[] destreza = new int[4];
  private int[] constituicao = new int[4];
  private int[] inteligencia = new int[4];
  private int[] sabedoria = new int[4];
  private int[] carisma = new int[4];

  public String getNome() {
    return Nome;
  }

  public void setNome(String nome) {
    Nome = nome;
  }

  public Personagem(String nome) {
    Nome = nome;
  }

  public int[] getForca() {
    return forca;
  }

  public void setForca() {
    this.forca = gerarAtributoAleatorio();
  }

  public int[] getDestreza() {
    return destreza;
  }

  public void setDestreza() {
    this.destreza = gerarAtributoAleatorio();
  }

  public int[] getConstituicao() {
    return constituicao;
  }

  public void setConstituicao() {
    this.constituicao = gerarAtributoAleatorio();
  }

  public int[] getInteligencia() {
    return inteligencia;
  }

  public void setInteligencia() {
    this.inteligencia = gerarAtributoAleatorio();
  }

  public int[] getSabedoria() {
    return sabedoria;
  }

  public void setSabedoria() {
    this.sabedoria = gerarAtributoAleatorio();
  }

  public int[] getCarisma() {
    return carisma;
  }

  public void setCarisma() {
    this.carisma = gerarAtributoAleatorio();
  }

  private int[] gerarAtributoAleatorio() {
    int[] atributo = new int[4];
    Random random = new Random();
    for (int i = 0; i < atributo.length; i++) {
      atributo[i] = random.nextInt(6) + 1;
    }
    Arrays.sort(atributo);
    return atributo;
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

  public void geraPersonagem() {}
}
