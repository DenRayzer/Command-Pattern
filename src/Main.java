import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        OurString ourString = new OurString();
        ArrayList<Command> commands = new ArrayList<>();
        commands.add(new CreateString(ourString));
        commands.add(new ChangeString(ourString));
        commands.add(new DeleteString(ourString));
        commands.add(new Undo(ourString));
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Добавить новую строку - 0 , Изменить введенную строку - 1, Удалить добавленную строку - 2, Отменить последнее действие - 3, ЗАВЕРШИТЬ ВЫПОЛНЕНИЕ ПРОГРАММЫ - 10");
        while (true) {
            Scanner in = new Scanner(System.in);
            int action = in.nextInt();
            if (action == 10) break;
            commands.get(action).execute(list);
        }

    }
}
