import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    void runBfs(int source, Graph g)
    {
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited.add(source);
        while(!queue.isEmpty()){
            int s = queue.poll();
            System.out.print(s+" ");
            LinkedList<Integer> adj = g.adjList[s];
            for(int x : adj)
            {
                if(!visited.contains(x))
                {
                    queue.add(x);
                    visited.add(x);
                }
            }

        }

    }
}
