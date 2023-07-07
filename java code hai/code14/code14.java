// WAP to show the use of ArrayList in java Collections

import java.util.*;
public class code14
{
    public static void main(String []args)
    {
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(10);
        al.add(19);
        al.add(12);
        al.add(7);

        System.out.println(al);

        // al.remove(1); //remove acc to index
        al.remove(Integer.valueOf(10)); // remove according to value
        System.out.println(al);
    }
}