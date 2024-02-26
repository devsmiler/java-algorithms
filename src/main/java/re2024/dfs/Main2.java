import java.util.*;

public class Main2 {

    String DFS(int c){
        if (c >= 2){
            return DFS(c/2) + "" +c%2;
        } else if ( c == 1){
            return "1";
        }
        return "";
    }
    public static void main(String[] args) {

        Main2 main2 = new Main2();

        System.out.println(main2.DFS(0));
    }
}
