import java.io.IOException;
import java.util.ArrayList;

public class CreateString extends Command {
    public CreateString(OurString ourString) {
        super(ourString);
    }

    @Override
    void execute(ArrayList<String> list) throws IOException {
        string.createString(list);
    }

}
