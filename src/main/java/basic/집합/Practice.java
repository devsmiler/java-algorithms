package basic.집합;


import javax.swing.plaf.PanelUI;
import java.util.ArrayList;

class MySet {
    ArrayList<Integer> list;
    public MySet() {
        this.list = new ArrayList<>();
    }
    public MySet(int[] arr) {
        this.list = new ArrayList<>();
        for (int i: arr){
            this.list.add(i);
        }
    }

    public void add(int x) {
        for (int item : this.list) {
            if (item == x) {
                return;
            }
            this.list.add(x);
        }
    }

    public MySet retainAll(MySet b) {
        MySet mySet = new MySet();
        for (int iA : this.list){
            for (int iB: b.list) {
                if (iA == iB) {
                    mySet.add(iA);
                }
            }
        }
        return mySet;
    }

    public MySet addAll(MySet b) {
        MySet mySet = new MySet();
        for (int iA : this.list) {
            mySet.add(iA);
        }
        for (int iB : b.list) {
            mySet.add(iB);
        }
        return mySet;
    }

    public MySet subAll(MySet b) {
        MySet mySet = new MySet();
        boolean _isContain = false;
        for (int iA : this.list) {
            for (int iB : b.list) {
                if (iA == iB) {
                    _isContain = true;
                    break;
                }
            }
            if (!_isContain) {
                mySet.add(iA);
            }
        }
        return mySet;
    }

}
public class Practice {
    public static void main(String[] args) {
        MySet mySet = new MySet();

    }
}
