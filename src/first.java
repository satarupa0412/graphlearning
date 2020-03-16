import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class first {
    static LinkedList<Integer> []graph=new LinkedList[5];
    public static void main(String[] args) {
        first obj=new first();
       for(int i=0;i<5;i++)
       {
           graph[i]=new LinkedList();
       }
       Scanner scn=new Scanner(System.in);
       for(int i=0;i<5;i++){
           int source=scn.nextInt();
           int dest=scn.nextInt();
           obj.addedge(source,dest);
           obj.addedge(dest,source);
       }
       for(int i=0;i<5;i++)
       {
           System.out.print(i+1 + "->");
           LinkedList<Integer> l=graph[i];
            for(int j=0;j<l.size();j++){
                System.out.print((l.get(j) + 1) + ",");
            }
           System.out.println();
       }
    }
    void addedge(int source,int destination)
    {
        graph[source-1].addFirst(destination-1);
    }


}


