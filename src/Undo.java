import java.io.IOException;
import java.util.ArrayList;

public class Undo extends Command {
    public Undo(OurString ourString) {
        super(ourString);
    }

    @Override
    void execute(ArrayList<String> list) throws IOException {
        string.undo(list);
    }

}
