import java.io.IOException;
import java.util.ArrayList;

class DeleteString extends Command {

    public DeleteString(OurString ourString) {
        super(ourString);
    }

    @Override
    void execute(ArrayList<String> list) throws IOException {
        string.deleteString(list);
    }
}
