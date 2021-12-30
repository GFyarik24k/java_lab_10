package lab_10;


import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Operations operations = new Operations();
        ArrayList A = new ArrayList();
        ArrayList B = new ArrayList();
        Integer[] arr = {1,2,3,4,5};
        String[] strArr = {"aaa", "bbb", "ccc"};
        operations.ArrayToArrayList(arr,A);
        operations.PrintArray(A);
        operations.ArrayToArrayList(strArr, B);
        operations.PrintArray(B);
        Mass<Integer> Arr = new Mass<Integer>(arr);
        Arr.readMass();
        Arr.returnElement(2);
        operations.joinCatalogArray("D:\\");
    }
}
