package com.data.structure.priority.queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class RunningMedian {

	public static void findMedian(int a[])  {  
        if(a.length==0){
            return;
        }

        double med = a[0];
    
   PriorityQueue<Integer> smaller = new PriorityQueue<>
   (Collections.reverseOrder());
    
   PriorityQueue<Integer> greater = new PriorityQueue<>();
    
   smaller.add(a[0]);
   System.out.print((int)med+" ");

   for(int i = 1; i < a.length; i++)
   {
       int x = a[i];
       if(smaller.size() > greater.size())
       {
           if(x < med)
           {
               greater.add(smaller.remove());
               smaller.add(x);
           }
           else
               greater.add(x);
           med = (double)(smaller.peek() + greater.peek())/2;
       }
        
       else if(smaller.size() == greater.size())
       {
           if(x < med)
           {
               smaller.add(x);
               med = (double)smaller.peek();
           }
           else
           {
               greater.add(x);
               med = (double)greater.peek();
           }
       }
       else
       {
           if(x > med)
           {
               smaller.add(greater.remove());
               greater.add(x);
           }
           else
               smaller.add(x);
           med = (double)(smaller.peek() + greater.peek())/2;
            
       }
       System.out.print((int) med+" ");
   }}


}