import java.util.Optional;

/**
 * Created by yatatomo on 2016/04/10.
 */
public class Hello {
    public static void main(String[] args) {
        String name =
                Optional.of(args).filter(a -> a.length == 1).map(a -> a[0]).orElse("No name");

        System.out.printf("Hello. %s!!!%n", name);
    }
}
