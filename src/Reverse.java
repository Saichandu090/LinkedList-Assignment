import java.util.LinkedList;

public class Reverse
{
    public static void main(String[] args) {

        LinkedList<Integer> ls=new LinkedList<>();
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(40);
        ls.add(50);
        ls.add(60);

        System.out.println(ls);
        reverse(ls);
        System.out.println(ls);
    }

    public static void reverse(LinkedList<Integer> ls)
    {
        int l=0,h=ls.size()-1;
        while(l<h)
        {
            int temp=ls.get(l);
            int t=ls.get(h);
            ls.set(h,temp);
            ls.set(l,t);
            l++;
            h--;
        }
    }

}
