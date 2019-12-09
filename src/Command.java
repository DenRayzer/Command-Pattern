import java.io.IOException;
import java.util.ArrayList;

abstract class Command {
    OurString string;

    public Command(OurString ourString) {
        string = ourString;
    }


    abstract void execute(ArrayList<String> list) throws IOException;

}
