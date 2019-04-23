package org.andestech.learning.rfb19.g4;


import java.util.*;
//import org.andestech.learning.rfb19.g4.utils.Utils;

import static org.andestech.learning.rfb19.g4.utils.Utils.genRandomPasswordList;
import static org.andestech.learning.rfb19.g4.utils.Utils.genRandomIntegerList;

import static org.andestech.learning.rfb19.g4.utils.Utils.echo;

public class AppColls
{

    public static void main( String[] args )
    {

        List<Integer> list =
        new LinkedList<>();

        list.add(1312300);
        list.add(55550);
        list.add(-99999);
        list.add(222);
        //list.addAll(222,4545,556);

        list.addAll(2,Arrays.asList(new Integer[]{-22,33,44,123123}));

        System.out.println(list);
        echo();

        //list.toString();

        System.out.println(Arrays.asList(1,2,3,4));

        //
        System.out.println(genRandomIntegerList(10,-100,100));
        System.out.println(genRandomPasswordList(10, 12));

        echo('+');

        Collections.sort(list);
        System.out.println(list);





    }
}
