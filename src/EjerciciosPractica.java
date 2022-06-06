import java.io.*;
import java.util.*;

public class EjerciciosPractica {

    public HashSet<Integer> incrementsByOne(HashSet<Integer> hashSet) {

        HashSet<Integer> integers = new HashSet<>();

        for (Integer integer : hashSet) {
            integers.add(integer + 1);
        }

        return integers;
    }

    public void noDuplicated(String[] strings) {

        HashSet<String> hashSet = new HashSet<>();

        for (String string : strings) {
            hashSet.add(string);
        }

        System.out.println(hashSet);
    }

    public void printDuplicateds(String[] strings) {
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        for (String string : strings) {
            if (!hashSet.add(string))
                hashSet2.add(string);
        }

        System.out.println(hashSet2);
    }

    public String palabraMasRepetida(File f) {
        LinkedList<String> palabras = new LinkedList<>();
        String limpiarPalabras = "";
        String palabraMasRepetida = "";
        int value = 0;
        HashMap<String, Integer> map = new HashMap<>();
        try (  Scanner reader = new Scanner(new FileReader(f))) {
            limpiarPalabras = reader.next();
            while (limpiarPalabras != null) {
                limpiarPalabras = limpiarPalabras.replace(".", "");
                limpiarPalabras = limpiarPalabras.replace(",", "");
                palabras.add(limpiarPalabras);
                limpiarPalabras = reader.next();
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("No se ha encontrado el fi");
        }
        for (String palabra : palabras) {
            if (map.containsValue(palabra)) {
                map.put(palabra, map.get(palabra) + 1);
            } else {
                map.put(palabra, 1);
            }
        }

        for (String palabra : map.keySet()) {
            if (map.get(palabra) > value) {
                value = map.get(palabra);
                palabraMasRepetida = palabra;
            }
        }
        return palabraMasRepetida;
    }
}
