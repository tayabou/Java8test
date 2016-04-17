import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by yatatomo on 2016/04/17.
 */
public class ExeSort {
    public static void main(String[] args) {
        List<File> list = Arrays.asList(
                new File("/Users/yatatomo/Documents/F-05F")
                .listFiles(f -> f.getName().toLowerCase().endsWith(".jpg"))
        );

        Comparator<File> fileComparator = Comparator.comparingLong(f -> f.length());

        Collections.sort(list, fileComparator);

        list.forEach(f -> System.out.printf("%s : %d%n", f.getName(), f.length()));
    }
}
