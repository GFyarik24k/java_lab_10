package lab_10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Mass <E> {
    protected ArrayList<E> A;
    public Mass(E[] a){
        A = new ArrayList<E>();
        for(E e : a)
            A.add(e);
    }
    public void readMass(){
        for (int i =0;i<A.size();i++)
            System.out.print(A.get(i)+" ");
        System.out.print("\n");
    }
    public <E> Object returnElement(int i){
        return A.get(i);
    }
}
