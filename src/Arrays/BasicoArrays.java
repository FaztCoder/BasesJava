package Arrays;

import java.util.Arrays;

public class BasicoArrays {
  public void arreglos() {
    // todo sobre arreglos
    // Formas de crear un arreglo
    String[] productos = new String[5];
    int i = 0;

    productos[0] = "TV 21 pulgadas";
    productos[1] = "Smart phone";
    productos[2] = "Xbox one";
    productos[3] = "Escritorio para computadoras";
    productos[4] = "Teclado mecanico";
    System.out.println("\n-----------------PERSONA-----------------");
    // Segunda forma de crear un arreglo
    String [] personas = {"Anthony", "Fernanda", "Camila"};
    // Recorriendo arreglo persona
    for (String persona : personas) {
      System.out.println("Resultado ForEach: " + persona);
    }
    
    // Ordenamiento del arreglo
    Arrays.sort(productos);

    System.out.println("\n-----------------PRODUCTOS-----------------");

    // Recorrer arreglo para mostrarlo
    for (; i <= productos.length - 1; i++) {
      System.out.println("Resultado productos: " + productos[i]);
    }

  }
}
