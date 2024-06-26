package lista.testes;

import java.util.LinkedList;

public class Teste05 {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.addFirst(0);
        linkedList.addLast(3);

        linkedList.add(2, 5);

        System.out.println(linkedList);
        System.out.println("Busca: " + linkedList.contains(2));
        System.out.println("Busca: " + linkedList.contains(1));

        linkedList.remove(); // remove elemento 0

        linkedList.removeFirst();
        linkedList.removeLast();

    }

}
