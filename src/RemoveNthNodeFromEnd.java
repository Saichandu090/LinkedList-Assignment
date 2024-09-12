import java.util.LinkedList;

public class RemoveNthNodeFromEnd
{
    public static void main(String[] args)
    {
        LinkedList<Integer> ls=new LinkedList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);

        remove(ls,5);
        System.out.println(ls);
    }

    public static void remove(LinkedList<Integer> l,int node)
    {
        if(node>=0&&node<=l.size()-1)
        {
            int sa=0;
            int s=l.size()-node;
            int k=1;
            for(int i : l)
            {
                k++;
                if(s==k)
                    sa=i;
            }
            l.remove(sa);
        }
        else
            System.out.println("Node Not in the range!!");
    }
}
