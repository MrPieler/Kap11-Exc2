package Exc2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Exc2
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        list1.add(5);
        list1.add(8);
        list2.add(10);
        list2.add(1);
        list2.add(20);
        list2.add(0);

        System.out.println(alternateList(list1, list2));
    }
    private static LinkedList<Integer> alternateList (LinkedList<Integer> list1, LinkedList<Integer> list2)
    {
        LinkedList<Integer> alternateList = new LinkedList<>();

        Iterator itr1 = list1.iterator();
        Iterator itr2 = list2.iterator();

        while (itr1.hasNext() || itr2.hasNext())
        {
            if (itr1.hasNext())
            {
                alternateList.add((Integer) itr1.next());
            }
            if (itr2.hasNext())
            {
                alternateList.add((Integer) itr2.next());
            }
        }
        return alternateList;
    }
}
