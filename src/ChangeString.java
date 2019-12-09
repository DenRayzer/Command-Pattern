import java.io.IOException;
import java.util.ArrayList;

public class ChangeString extends Command {
    public ChangeString(OurString ourString) {
        super(ourString);
    }

    @Override
    void execute(ArrayList<String> list) throws IOException {
        string.changeString(list);
    }



}
