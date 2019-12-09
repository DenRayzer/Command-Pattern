import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class OurString {

    String string;
    String newString;
    boolean flag = false;

    int action;

    public void createString(ArrayList<String> list) throws IOException {
        System.out.println("Введите новую строку: ");
        Scanner in = new Scanner(System.in);
        string = in.nextLine();

        list.add(string);
        flag = true;
        action = 1;
        System.out.println("Ваша строка добавлена! ");
        System.out.println("Следующее действвие : ");
    }

    public void changeString(ArrayList<String> list) {

        if (flag == true) {


            int last = list.size() - 1;
            Scanner in = new Scanner(System.in);
            newString = in.nextLine();
            System.out.println("Ваша строка изменена! Старое значение: " + string);
            System.out.println("Новое значение значение: " + newString);
            list.remove(last);
            list.add(string);

        } else System.out.println("Вы не ввели строку!");
        action = 2;
    }

    public void deleteString(ArrayList<String> list) {
        if (flag == true) {
            int last = list.size() - 1;
            string = list.get(last);
            list.remove(last);
            System.out.println("Ваша строка была удалена!");
            flag = false;
            action = 3;
        }
       else  {
         System.out.println("Вы не ввели строку!");
        }
    }

    public void undo(ArrayList<String> list) {
        if (action != 0) {
            switch (action) {
                case 1:
                    int last = list.size() - 1;
                    list.remove(last);
                    System.out.println("Действие 'Создание строки' бало отменено!");
                    break;
                case 2:
                    int last1 = list.size() - 1;
                    list.remove(last1);
                    list.add(string);
                    System.out.println("Действие 'Изменение строки' бало отменено!");
                    break;
                case 3:
                    list.add(string);
                    System.out.println("Действие 'Удаление строки' бало отменено!");

            }
            System.out.println(list);
            flag = false;
        }
        else System.out.println("Вы не работали со строками!");
    }


}
