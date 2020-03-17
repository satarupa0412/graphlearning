import java.util.LinkedList;
import java.util.Scanner;
public class Graph {
    public LinkedList<Integer>[] adjList;
    void printGraph(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(i + 1 + "->");
            LinkedList<Integer> l = adjList[i];
            for (int j = 0; j < l.size(); j++) {
                System.out.print((l.get(j) + 1) + ",");
            }
            System.out.println();
        }
    }

    void addEdge(int source, int destination) {
        adjList[source].addFirst(destination);
    }

    void createGraph() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of vertices");
        int n=scanner.nextInt();
        adjList = new LinkedList[n+1];
        for (int i = 0; i < n+1; i++) {
            adjList[i] = new LinkedList();
        }
        System.out.println("enter the adjacent edges");
        adjacentEdges(n);
    }

    void adjacentEdges(int n) {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            int source = scn.nextInt();
            int dest = scn.nextInt();
            addEdge(source, dest);
            addEdge(dest, source);
        }
    }
}