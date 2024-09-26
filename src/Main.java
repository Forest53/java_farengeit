import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Предложить пользователю ввести значение температуры
        System.out.print("Введите температуру: ");
        double temperature = scanner.nextDouble();

        // Попросить пользователя указать единицу введенной температуры (C, F или K)
        System.out.print("Укажите единицу температуры (C для Цельсия, F для Фаренгейта, K для Кельвина): ");
        char unit = scanner.next().toUpperCase().charAt(0);

        // Переменные для преобразованных значений
        double celsius = temperature;
        double far = temperature;
        double kelvin = temperature;

        // Преобразование температуры в зависимости от введенной единицы
        switch (unit) {
            case 'C':
                double celiusfar = (celsius * 9/5 +32);
                System.out.println("Фаренгейт = "+ celiusfar);
                double celiuskel = (celsius +273.15);
                System.out.println("Кельвины = " +celiuskel);
                break;

                case 'F':
                    double farcel = ((far -32) *9/5);
                    System.out.println("цельсии= "+ farcel);
                    //тут еще из фар в кельвины надо
                    double farkel = ((far -273.15)*9/5 );
                    System.out.println("Кельвины= " + farkel);
                    break;

            case 'K':
                double kelcel = (kelvin -273.15);
                System.out.println("цельсии= "+ kelcel);
                //тут еще из кельвинов в фаренгейт керек
                double kelfar = ((kelvin -32)*5.9);
                System.out.println("фаренгейт= "+ kelfar);
                break;

        }

        scanner.close();
    }


}