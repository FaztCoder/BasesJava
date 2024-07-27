package Arrays;

public class AlgoritmoBurbuja {
  void main() {
    String[] productos = { "TV", "Smartphne", "Camara Web" };
    int total = productos.length - 1;

    int contador = 0;
    for (int i = 0; i <= total; i++) {
      for (int j = 0; j <= total; j++) {
        if (productos[i].compareTo(productos[j]) < 0) {
          String auxiliar = productos[i];
          productos[i] = productos[j];
          productos[j] = auxiliar;
        }
        contador++;
      }
    }
    System.out.println("contador: " + contador);
  }
}
