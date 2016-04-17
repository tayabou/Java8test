import java.util.function.Function;

/**
 * Created by yatatomo on 2016/04/10.
 */
public class FloatBytes {
    public static void main(String[] args) {
        Function<Float, String> floatBytes =
                ((Function<Float, Integer>)(value) -> Float.floatToIntBits(value))
            .andThen(n -> String.format("%08x", n));
    }
}
