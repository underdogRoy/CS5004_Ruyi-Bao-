import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {

  public static void main(String[] args) {
    int[] a = new int[8];
    List<Integer> list = new ArrayList<>();
    list.add(4);
    Map<Integer, Integer> map = new HashMap<>();
    map.put(1, 3);
    int b = map.get(1);
  }
}
