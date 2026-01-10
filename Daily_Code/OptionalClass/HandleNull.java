package Daily_Code.OptionalClass;

import java.util.Optional;

public class HandleNull {
    public static void main(String[] args) {
        String str = null;
        Optional<String> opt = Optional.ofNullable(str);
        System.out.println(opt.orElse("str"));
    }
}



