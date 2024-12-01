import java.util.Scanner;

public class ScreenConsumer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TitleModel titleModel = new TitleModel();

        // Aquí puedes cargar datos de la base de datos y llenar el model
        
        // Loop para mostrar opciones
        boolean running = true;
        do {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Listar títulos");
            System.out.println("2. Realizar venta");
            System.out.println("3. Salir");
            int option = scanner.nextInt();
            scanner.nextLine();  // Consumir nueva línea

            switch (option) {
                case 1:
                    // Listar libros
                    for (Title title : titleModel.getTitles()) {
                        System.out.println(title.getTitle());
                    }
                    break;

                case 2:
                    // Realizar venta
                    // Puedes agregar la lógica para manejar ventas
                    break;

                case 3:
                    running = false;
                    break;

                default:
                    System.out.println("Opción no válida");
            }

        } while (running);

        scanner.close();
    }
}
