import java.util.*;
/**
 * Main
 */
public class Main {
    private void DFS(int n){
        if(n>0){
            System.out.println(n);
            DFS(n-1);
        }
        return;
    }

    public static void main(String[] args) {
        Main iMain = new Main();
        iMain.DFS(3);
    }
}