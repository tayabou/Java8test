import java.util.Optional;

/**
 * Created by yatatomo on 2016/04/10.
 */
public class StrLen2 {
    public static void main(String[] args) {
        Optional.of(args).filter(a -> a.length == 1).map(a -> a.length).ifPresent(System.out::println);
    }
}
