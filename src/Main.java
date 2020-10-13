import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random numbers = new Random();
        int try3 = 0;
        int random = numbers.nextInt(9);
        System.out.println("Угадай чисто с трех раз");

        while (try3<3){
            System.out.println("Введи от 0 до 9");
            int number = input.nextInt();

            if (number>random) {
                System.out.println("Загаданное число меньше");
                System.out.println();
            }else if (number<random) {
                System.out.println("Загаданное число больше");
                System.out.println();
            }else if (number==random){
                System.out.println("Ты отгадал");
                System.out.println();
            }
            try3++;
        }
        System.out.println("Ваши попытки закончились. Начать игру заново? Да - нажми 1. Нет - нажми 0");

        String userData = input.next();
        if (userData.equals("1")){
            main(null);
        }
    }
}
