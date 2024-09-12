import java.util.LinkedList;

public class RemoveAllOccurances
{
    public static void main(String[] args)
    {
        LinkedList<Integer> ls=new LinkedList<>();
        ls.add(10);
        ls.add(20);
        ls.add(20);
        ls.add(60);
        ls.add(50);
        ls.add(10);

        System.out.println(ls);
        System.out.println("=========");

        remove(ls,10);
        System.out.println(ls);
    }

    public static void remove(LinkedList<Integer> ls,int val)
    {
        for(int i=0;i<ls.size();i++)
        {
            if(ls.get(i)==val)
                ls.remove(ls.get(i));
        }
    }
}
