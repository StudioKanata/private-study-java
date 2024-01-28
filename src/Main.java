import java.util.ArrayList;
import java.util.List;

// 型とは「格納するデータに制約をかける仕組み
//
public class Main {
    public static void main(String[] args) {
        Pocket<String> pockets = new Pocket<>();
        pockets.add("2024");
        String thisYear = pockets.get();
        System.out.println(thisYear);
    }

}