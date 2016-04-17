import java.util.Optional;
import java.util.function.UnaryOperator;

/**
 * Created by yatatomo on 2016/04/10.
 */
public class Suffix {
    public static void main(String[] args) {
        UnaryOperator<String> suffix =
                s -> s.substring(Math.floorMod(s.lastIndexOf("."), s.length() +1));

        Optional.of(args).
                filter(a -> a.length == 0).
                map(a -> a[0]).
                map(suffix).
                ifPresent(System.out::println);
    }
}
