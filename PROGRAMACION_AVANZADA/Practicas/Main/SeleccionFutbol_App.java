package PROGRAMACION_AVANZADA.Practicas.Main;

import PROGRAMACION_AVANZADA.Practicas.Clases.Entrenador;
import PROGRAMACION_AVANZADA.Practicas.Clases.Futbolista;
import PROGRAMACION_AVANZADA.Practicas.Clases.Masajista;

public class SeleccionFutbol_App {
    public static void main(String[] args){
Futbolista iniesta = new Futbolista(1, "Andrés", "Iniesta", 39, 8, "Centrocampista");
        Entrenador delBosque = new Entrenador(2, "Vicente", "del Bosque", 73, "ES-12345");
        Masajista raul = new Masajista(3, "Raúl", "Martínez", 50, "Fisioterapeuta", 20);

        // 2. Mostrar los atributos de cada objeto (haciendo uso del toString)
        System.out.println("--- DATOS DE LA SELECCIÓN ---");
        System.out.println("Futbolista -> " + iniesta.toString());
        System.out.println("Entrenador -> " + delBosque.toString());
        System.out.println("Masajista  -> " + raul.toString());

        // 3. Mandar a llamar a los métodos de cada clase
        System.out.println("\n--- ACCIONES COMUNES (CLASE PADRE) ---");
        iniesta.Concentrarse();
        delBosque.Viajar();

        System.out.println("\n--- ACCIONES ESPECÍFICAS (CLASES HIJAS) ---");
        // Métodos de Futbolista
        iniesta.entrenar();
        iniesta.jugarPartido();

        // Métodos de Entrenador
        delBosque.dirigirEntrenamiento();
        delBosque.dirigirPartido();

        // Método de Masajista
        raul.darMasaje();
    }
}
