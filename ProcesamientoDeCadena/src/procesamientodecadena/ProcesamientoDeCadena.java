package procesamientodecadena;

import java.util.*;

public class ProcesamientoDeCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una línea de texto: ");
        String linea = scanner.nextLine();
        Map<Character, Integer> frecuencia = new HashMap<>();
        for (char letra : linea.toCharArray()) {
            if (Character.isLetter(letra)) {
                frecuencia.put(letra, frecuencia.getOrDefault(letra, 0) + 1);
            }
        }
        char letraFrecuente = Collections.max(frecuencia.entrySet(), Map.Entry.comparingByValue()).getKey();
        String reemplazado = linea.replaceAll("[aeiouAEIOU]", String.valueOf(letraFrecuente));
        System.out.println("Vocales reemplazadas--> " + reemplazado);
        String invertido = new StringBuilder(linea).reverse().toString();
        System.out.println("Invertido--> " + invertido);
    }
}