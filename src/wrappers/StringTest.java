package wrappers;
import java.util.Arrays;
import java.util.Scanner;
//ctrl + alt + L

public class StringTest {
    public static void main(String[] args) {

        String ukraine = "Слава ";
        String ukraine2 = new String("Украине ");
        char myData[] = {'u', 'k', 'r', 'a', 'i', 'n','e', ':'};
        String ukraine3 = new String(myData);
        String ukraine4 = new String(ukraine.getBytes());

        StringBuilder myBuilder = new StringBuilder("Украине  ");
        String ukraine5 = myBuilder.toString();

        String fruits = "Апельсин,Яблоко,Гранат,Груша";
        String[] fruitsArray = fruits.split(",");


        Integer[] fruitLengths = new Integer[fruitsArray.length];
        for (int i = 0; i < fruitsArray.length; i++) {
            fruitLengths[i] = fruitsArray[i].length();
        }
        Integer[] sortedFruitLengths = Arrays.copyOf(fruitLengths, fruitLengths.length);
        Arrays.sort(sortedFruitLengths);
        int maxFruitLength = sortedFruitLengths[fruitLengths.length - 1];
        int getFruitIndex = Arrays.asList(fruitLengths).indexOf(maxFruitLength);
        String maxLengthFruit = fruitsArray[getFruitIndex].toLowerCase();
        System.out.println(maxLengthFruit);


        int shortFruitBegin = 0;
        int shortFruitEnd = 3;
        String shortFruit = maxLengthFruit.substring(shortFruitBegin, shortFruitEnd);
        System.out.println(shortFruit);


        String newString = "   Я_новая_строка      ";
        String trimmedString = newString.trim();
        String changedString = trimmedString.replace("_", " ");
        System.out.println(changedString);


        Scanner myInput = new Scanner(System.in);
        System.out.println("Введите текст: ");

        String text = myInput.nextLine();

        if (text.contains("Запуск")) {
            System.out.println("Запускаем процесс :");
        } else if (text.contains("Завершен")) {
            System.out.println("Процесс завершен");
        } else if (text.toLowerCase().contains("Ошибка")) {
            System.out.println("Произошла ошибка");
        } else {
            System.out.println("Вы ввели: " + text);
        }


        StringBuilder builder = new StringBuilder(ukraine + ukraine2 + ukraine3 + "\n" +
                ukraine4 + ukraine5 + "\n" + fruits +
                maxLengthFruit + "\n" + newString + "\n" +
                 trimmedString + changedString + text + "\n");

        String lastSting = builder.toString();
        System.out.println(lastSting);
    }
}