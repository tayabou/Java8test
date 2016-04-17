import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by yatatomo on 2016/04/10.
 */
public class FileList1 {
    public static void main(String[] args) {
        List<File> list = Arrays.asList(new File("/Users/yatatomo").listFiles());

        Comparator<File> comparator =
                (f1, f2) -> Boolean.compare(!f1.isDirectory(), !f2.isDirectory());

    }
}
