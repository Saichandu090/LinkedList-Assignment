import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MergeSortedLists
{
    public static void main(String[] args)
    {
        LinkedList<Integer> ls1=new LinkedList<>();
        ls1.add(10);
        ls1.add(11);
        ls1.add(12);
        ls1.add(13);
        ls1.add(14);

        LinkedList<Integer> ls2=new LinkedList<>();
        ls2.add(10);
        ls2.add(12);
        ls2.add(15);
        ls2.add(16);
        ls2.add(18);

        LinkedList<Integer> ls3=new LinkedList<>();
        int i=0,j=0;
        while(i<ls1.size()&&j<ls2.size())
        {
            if(ls1.get(i)<=ls2.get(j))
            {
                ls3.add(ls1.get(i));
                i++;
            }
            else if(ls2.get(j)<=ls1.get(i))
            {
                ls3.add(ls2.get(j));
                j++;
            }
        }

        while(i<ls1.size())
        {
            ls3.add(ls1.get(i));
            i++;
        }

        while(j<ls2.size())
        {
            ls3.add(ls2.get(j));
            j++;
        }

        System.out.println(ls3);
    }
}
