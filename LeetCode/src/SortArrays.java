import java.util.Arrays;
import java.util.Comparator;

public class SortArrays {
    public String[] sortArrays(String[] elements)
    {
        Arrays.sort(elements, Comparator.comparingInt(String::length));
        return elements;
    }
}
