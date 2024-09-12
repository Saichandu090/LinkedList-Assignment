import java.util.LinkedList;
public class Intersection
{
    public static void main(String[] args) {

        LinkedList<Integer> ls=new LinkedList<>();
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(40);
        ls.add(50);

        LinkedList<Integer> ls2=new LinkedList<>();
        ls2.add(2);
        ls2.add(3);
        ls2.addAll(ls);


        for(int i=0;i<ls.size();i++)
        {
            for(int j=0;j<ls2.size();j++)
            {
                if(ls.get(i)==ls2.get(j))
                {
                    System.out.println("Intersection Point is : "+ls.get(i));
                    break;
                }
            }
            break;
        }
    }
}
