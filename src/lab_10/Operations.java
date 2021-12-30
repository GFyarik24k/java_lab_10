package lab_10;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Operations {
    public <E> void ArrayToArrayList(E[] a, ArrayList<E> list){
        for (E e : a)
            list.add(e);
    }
    public <E> void PrintArray(ArrayList<E> list){
        for (int i =0;i<list.size();i++)
            System.out.print(list.get(i)+" ");
    }
    public static void joinCatalogArray(String path){
        File f = new File(path);
        String[] fArray = null;
        if (f.exists() || f.isDirectory())
            fArray = f.list(null);
        else
            System.out.print("Ошибка");
        ArrayList<String> list = new ArrayList(Arrays.asList(fArray));
        for (int i = 0;i<list.size();i++)
            if (i<5) System.out.print(list.get(i)+" ");
    }
}