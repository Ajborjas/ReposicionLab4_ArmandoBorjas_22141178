import java.util.Scanner;

public class Menu {

    public static void MaestrosF() {
        Pelea.addMaestros("Zuko", "Principe", 20, 4);
        Pelea.addMaestros("Azula", "Princesa", 18, 4);
        Pelea.addMaestros("Iroh", "Principe", 50, 4);
        Pelea.addMaestros("Ozai", "Rey", 40, 4);
    }

    public static void MaestrosD() {
        Pelea.addMaestros("Katara", "Plebeya", 16, 2);
        Pelea.addMaestros("Toph", "Plebeya", 15, 3);
    }

    public static void AvatarD() {
        Pelea.addMaestros("Aang", "Elegido", 1000, 5);
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Declaración de variables
        int opcion;

        // Iniciando Maestros
        AvatarD();
        MaestrosF();
        MaestrosD();

        do {
            System.out.println("""
                    Menu de opciones:
                    0. Salir
                    1. Crear Maestro
                    2. Crear Avatar
                    3. Listar Maestros por tipo
                    4. Pelear
                    Seleccione una opción:""");
            opcion = leer.nextInt();

            if (opcion == 0) {
                System.out.println("Saliendo...");
            } else if (opcion == 1) {
                System.out.println("Crear Maestro");
                System.out.println("Ingrese el nombre del maestro:");
                String nombre = leer.next();
                System.out.println("Ingrese el rango del maestro:");
                String rango = leer.next();
                System.out.println("Ingrese la edad del maestro:");
                int edad = leer.nextInt();
                System.out.println("""
                        Ingrese el tipo de maestro:
                        1. Aire
                        2. Agua
                        3. Tierra
                        4. Fuego
                        Seleccione una opción:""");
                int tipo = leer.nextInt();

                if (tipo == 1) {
                    Pelea.addMaestros(nombre, rango, edad, tipo);
                } else if (tipo == 2) {
                    Pelea.addMaestros(nombre, rango, edad, tipo);
                } else if (tipo == 3) {
                    Pelea.addMaestros(nombre, rango, edad, tipo);
                } else if (tipo == 4) {
                    Pelea.addMaestros(nombre, rango, edad, tipo);
                }
            } else if (opcion == 2) {
                System.out.println("Crear Avatar");
                System.out.println("Ingrese el nombre del avatar:");
                String nombre = leer.next();
                System.out.println("Ingrese el rango del avatar:");
                String rango = leer.next();
                System.out.println("Ingrese la edad del avatar:");
                int edad = leer.nextInt();
                Pelea.addMaestros(nombre, rango, edad, 5);

            } else if (opcion == 3) {
                System.out.println("Listar Maestros por tipo");
                System.out.println("""
                        Ingrese el tipo de maestro:
                        1. Aire
                        2. Agua
                        3. Tierra
                        4. Fuego
                        5. Avatar
                        6. Todos
                        Seleccione una opción:""");
                int tipo = leer.nextInt();
                Pelea.showMaestros(tipo);
            } else if (opcion == 4) {
                System.out.println("Seleccione dos maestros para pelear:");
                Pelea.showMaestros(6);
                System.out.println("Ingrese el nombre del primer maestro:");
                String nombre1 = leer.next();
                System.out.println("Ingrese el nombre del segundo maestro:");
                String nombre2 = leer.next();
                Pelea.Pelea1(nombre1, nombre2);
                Pelea.Pelea2();
                if (Pelea.Win) {
                    System.out.println("Se ha vencido a la nación del fuego");
                } else {
                    System.out.println("La nación de fuego ha vencido");
                }
            }

        } while (opcion != 0);
    }
}
