import java.util.Scanner;

public class start {
    public static void main(String[] args){
        Graph graph = new Graph();
        graph.createGraph();
        Scanner scan=new Scanner(System.in);
        switch (1)
        {
            case 1:
                System.out.println("enter the source vertex");
                int source=scan.nextInt();
                bfs object=new bfs();
                object.runBfs(source, graph);
            case 2: break;
        }
    }
}
