import java.io.IOException;

public class ChildOverrideClass extends OverrideClass {

    @Override
    protected String sayHi() throws IOException {
        return "chandra";
    }
}
