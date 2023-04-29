package onbir_nisan;
//basicArray

public class basic {

    final int limit=15, multiple=10;

    int[] list=new int[limit];

    for(int index=0; index<limit; index++)
        list[index]=index*multiple;

    list[5]=999;

    for (int value : list)
        System.out.println(value + " ");

}

