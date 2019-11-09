/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
class IntellyZen{
    
    public static void main (String[] args) {
       
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Number of Villages: ");
       int t=sc.nextInt();
       
       for(int i=0;i<t;i++)
       {
           System.out.println("Enter Number of people in Village"+(i+1));
           int n=sc.nextInt();
           ArrayList<Integer> list1=new ArrayList<Integer>();
           ArrayList<Integer> list2=new ArrayList<Integer>();
           int cost=0;
           System.out.println("Enter cost of each person:");
           for(int j=0;j<n;j++)
           {
               list1.add(sc.nextInt());
           }
           if(n<=0)
           {
               System.out.println("wrong input");
           }
           else if(n==1)
           {
               cost=list1.get(0);
           }
           else if(n==2)
           {
               if(list1.get(0)>=list1.get(1))
               cost=list1.get(0);
               else
               cost=list1.get(1);
           }
           else
           {
               
               Collections.sort(list1);
               int flag=0;
                int min1=list1.get(0);
                   int min2=list1.get(1);
               //System.out.println("sorted list");
               while(list1.size()>0)
               {
                   Collections.sort(list1);
                  
                   //go min
                   if(min1==list1.get(0) && min2==list1.get(1)){
                     
                   list2.add(list1.get(0));
                   list2.add(list1.get(1));
                    cost+=list1.get(1);
                   list1.remove(0);
                   list1.remove(0);
                  //System.out.println(list1.get(0)+" "+list1.get(1));
                   flag=1;
                       if(list1.size()==0)
                       break;
                   }
                   else
                   {
                      //go max
                   list2.add(list1.get(list1.size()-2));
                   list2.add(list1.get(list1.size()-1));
                   cost+=list1.get(list1.size()-1);
                   list1.remove(list1.size()-1);
                   list1.remove(list1.size()-1);
                   flag=1;
                   
                   }
                   //back 1
                   if(flag==1)
                   {
                       
                       if(list1.size()==0)
                       break;
                     Collections.sort(list2);
                     list1.add(list2.get(0));
                     cost+=list2.get(0);
                     list2.remove(0);
                   }
               //System.out.println(list1.get(k));
               
                   
               }
           }
           System.out.println(cost);
       }
    }
    
}