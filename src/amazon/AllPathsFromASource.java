package amazon;

import java.util.*;

public class AllPathsFromASource 
{
	static class Graph
        {
            int V;
            Map<Integer, List<Integer>> adj; // Adjacency list
		
            Graph(int v)
            {
		V = v;
		adj = new HashMap<Integer, List<Integer>>();
            }
		
            void addEdge(int u, int v)
            {
		if(!adj.containsKey(u))
                {
                    adj.put(u, new ArrayList<Integer>());
		}
		adj.get(u).add(v);
            }	
		
            List<List<Integer>> getAllPaths(Integer u, Integer v)
            {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(v.equals(u))
                {
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(u);
                    result.add(temp);
                    return result;
		}
		boolean[] visited = new boolean[V];
		Deque<Integer> path = new ArrayDeque<Integer>();
		getAllPathsDFS(u, v, visited, path, result);
		return result;
            }
		
		
            void getAllPathsDFS(Integer u, Integer v, boolean[] visited, Deque<Integer> path, List<List<Integer>> result)
            {
			visited[u] = true; // Mark visited
			path.add(u); // Add to the end
			if(u.equals(v)){
				result.add(new ArrayList<Integer>(path));
			}
			else{
				if(adj.containsKey(u)){
					for(Integer i : adj.get(u)){
						if(!visited[i]){
							getAllPathsDFS(i, v, visited, path, result);
						}
					}
				}
			}
			path.removeLast();
			visited[u] = false;
		}
	}
	
	public static void main(String[] args){
		Graph g = new Graph(4);
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(0,3);
		g.addEdge(2,0);
		g.addEdge(2,1);
		g.addEdge(1,3);
		List<List<Integer>> results = g.getAllPaths(2,3);
		for(List<Integer> l : results){
			System.out.println(l);
		}
	}
}