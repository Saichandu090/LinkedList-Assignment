import java.util.*;

public class Intersection
{
    public static void main(String[] args) {

        List<Integer> l=new  LinkedList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);


        List<Integer> l1=new LinkedList<>();
        l1.add(10);
        l1.add(96);
        l1.add(50);
        l1.add(13);
        l1.add(12);

        Set<Integer> intersection=new HashSet<>(l);
        intersection.retainAll(l1);

        System.out.println(intersection);
    }
}
