package numeroPrimo;

public class numPrimo {

  public static void main(String[] args) {

    Integer numero = 2;
    boolean primo = true;
    String numPrimo = "";
    int contador = 0;
    while (contador < 10) {
      for (int i = 2; i <= numero / 2; i++) {
        if (numero % i == 0) {
          primo = false;
        }
      }
      if (primo) {
        numPrimo += numPrimo != "" ? "," + numero : numero;
        contador++;
      }
      primo = true;
      numero++;

    }
    System.out.println(numPrimo);
  }
}
