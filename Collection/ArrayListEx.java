package Collection;

import java.util.LinkedList;

public class ArrayListEx {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<String>(  );
//
//        list.add("ho");
//        System.out.println(list.size());
//        list.add("naga");
//        System.out.println(list.size());
//        list.add("vi");
//        System.out.println(list.size());
//
//
//        System.out.println(list);
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
//
//        System.out.println(list.size());
//
//        list.remove(1);
//
//        System.out.println(list);
//
//        list.set(0, "iwa");
//
//        for (String string: list){
//            System.out.println(string);
//        }
//
//        list.clear();
//        System.out.println(list);
//
//        System.out.println(list.isEmpty());

        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        linkedList.add("e");

        System.out.println(linkedList);

        linkedList.remove(2);
        System.out.println(linkedList);
    }
}
