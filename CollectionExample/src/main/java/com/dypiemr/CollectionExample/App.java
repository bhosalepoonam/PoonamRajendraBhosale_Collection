package com.dypiemr.CollectionExample;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	DataList<Integer> list = new DataList<>();
    	 
        list.add(11);
        list.add(2);
        list.add(83);
        System.out.println(list);
         
       
        list.remove(1);
        System.out.println(list);
         
       
        System.out.println( list.get(0) );
        System.out.println( list.get(1) );
 
        //List Size
        System.out.println(list.size());
    }
}
