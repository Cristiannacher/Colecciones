import java.io.File;
import java.util.HashSet;

public class Main {
    public static void main(String[] args)  {

        EjerciciosPractica practica = new EjerciciosPractica();
        HashSet<Integer> integers = new HashSet<>();
        String[] palabras = {"hola","adios","Padre","vamos a ponernos","vamos a ponernos","vamos a ponernos","Padre","Padre"};
        File fixero = new File("/media/alu10486050/Maxtor/1DAM/Programació/Colecciones/Resources/fixero.txt");

        integers.add(4);
        integers.add(3);
        integers.add(2);
        integers.add(1);
        integers.add(4);

        System.out.println(integers);

        System.out.println(practica.incrementsByOne(integers));
        practica.noDuplicated(palabras);
        practica.printDuplicateds(palabras);

        System.out.println(practica.palabraMasRepetida(fixero));
    }

}
