import java.util.function.ToIntFunction;

/**
 * Created by yatatomo on 2016/04/10.
 */
public class StrLen1 {
    public static void main(String[] args) {
        ToIntFunction<String> strlen =
                String::length;
        int len = strlen.applyAsInt(args[0]);
        System.out.println(len);
        System.out.println(len);
    }
}
