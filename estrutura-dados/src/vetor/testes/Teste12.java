package testes;

import java.util.ArrayList;

public class Teste12 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("a");
        arrayList.add("c");

        System.out.println(arrayList);

        arrayList.add(1, "h");

        System.out.println(arrayList);

        System.out.println(arrayList.contains("a"));

        System.out.println(arrayList.indexOf("c"));

        System.out.println(arrayList.get(2));

        System.out.println(arrayList.lastIndexOf("c"));

    }

}
