//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // Задание 1
    System.out.println("Имя: Никита; Возраст: 19 лет; Город: Караганда");

    // Задание 2
    int age = 19;
    double PI = 3.14;
    boolean truth = true;
    String name = "Nikita";
    char letter = 'A';

    // Задание 3

    for (int i = 1; i < 11; i++) {
        System.out.println("7 * " + i + " " + "=" + " " + + 7 * i);
    }

    System.out.println();

    // Задание 4
    int size = 5;
    for (int row = 0; row < size; row++) {
        for (int col = 0; col < 13; col++) {
            boolean u1 = (col == 0 && row < 4) || (col == 2 && row < 4) || (row == 4 && col == 1);

            boolean w = (col == 4 && row < 4) || (col == 8 && row < 4) || (row == 4 && (col == 5 || col == 7)) || (row == 3 && col == 11);

            boolean u2 = (col == 10 && row < 4) || (col == 12 && row < 4) || (row == 4 && col == 11);

            if (u1 || w || u2) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
