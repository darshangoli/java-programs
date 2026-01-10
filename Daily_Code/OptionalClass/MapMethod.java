package Daily_Code.OptionalClass;

import java.util.Optional;

public class MapMethod {
    public static void main(String[] args) {
        Optional<String> op = Optional.of("darshan");
        Optional<String> upperOp = op.map(String::toUpperCase);
        upperOp.ifPresent(System.out::println);
    }
}



