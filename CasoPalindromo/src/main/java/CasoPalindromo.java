import java.util.Scanner;

public class CasoPalindromo {
    public static void main(String[] args) {
        menu();
    }

    public static void showMenu() {
        System.out.println("");
        System.out.println("1 Ingresar nuevo palindromo");
        System.out.println("0 Salir");
    }

    public static void menu() {

        int opcion;
        do {
            showMenu();
            opcion = input(0, 1);

            switch (opcion) {
                case 0:
                    System.out.println("chaoahc");
                    break;
                case 1:
                    System.out.println(verificador(lector()));
                    break;
            }
        } while (opcion != 0);

    }

    public static String lector() {
        Scanner intro = new Scanner(System.in);

        return intro.next();
    }

    public static boolean verificador(String letras) {
        String inverso = new StringBuilder(letras).reverse().toString();

        return letras.equalsIgnoreCase(inverso);

    }

    /**
     * Metodo input recibe @param Bot y @param Top para almacenarlas en la clase y
     *
     * @return el input recibido de err.
     */
    public static int input(int bot, int top) {
        Scanner intro = new Scanner(System.in);
        return err(intro.next(), bot, top);
    }

    /**
     * Metodo err intenta transformar a int el String recibido de
     *
     * @param input, valida el input mediante ValidInt y
     * @return in ya validado
     */
    public static int err(String input, int bot, int top) {
        Scanner intro = new Scanner(System.in);
        int in = 0;
        try {
            in = validInt(Integer.parseInt(input), bot, top);
        } catch (Exception ex) {
            System.out.println("Favor ingresar Dígitos y no carácteres");
            in = err(intro.next(), bot, top);
        }
        return in;
    }

    /**
     * Metodo ValidInt recibe @param in y revisa si esta entre los
     *
     * @param bot y @param top establecidos en la clase, si es asi
     * @return in
     */
    public static int validInt(int in, int bot, int top) {
        if (in < bot || in > top) {
            System.out.println("Favor ingresar un número entre " + bot + " y " + top);
            in = input(bot, top);
        }
        return in;
    }
}
