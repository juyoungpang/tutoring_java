import java.util.*;


public class Circle{}

public class Quadrilateral{
    private int length;
    private int width;

    public Quadrilateral(int l, int w){
        length = l;
        width = w;
    }

    public int getArea(){
        return length*width;
    }
}

public class Square extends Quadrilateral{
    public Square(int s) {
        super(s, s);
    }
}

public class Main {
    public static void main(){
        int arr[] = {0,1,2,3,4};
        //post condition: arr[] = {0,2,1,3,4};
        int temp = arr[1];
        arr[1] = arr[2];
        arr[2] = temp;


        ArrayList<Integer> arrl = new ArrayList<Integer>();
        arrl.add(0);
        arrl.add(1);
        arrl.add(2);
        arrl.add(3);
        arrl.add(4);
        //post condition: arl = {0,2,1,3,4};
        int tmp = arrl.get(1);
        arrl.set(1, arrl.get(2));
        arrl.set(2, tmp);

    }
}


