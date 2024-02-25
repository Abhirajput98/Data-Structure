//package LEC_74;
//
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Stack;
//
//public class Kosa_Raju {
//
//        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
//
//        public Kosa_Raju(int v) {
//            // TODO Auto-generated constructor stub
//            for (int i = 0; i <= v; i++) {
//                map.put(i, new HashMap<>());
//            }
//        }
//
//        public void addEdge(int v1, int v2) {
//            map.get(v1).put(v2, 5);
//
//        }
//        public void KosaRajuAlgo(){
//            HashSet<Integer> visited = new HashSet<>();
//            Stack<Integer> st = new Stack<>();
//            // dfs all vtx stack m put kr do
//            dfs(visited, st, 0);
//            // Transpose the graph
//
//            // dfs component count karna on transpose graph
//        }
//        public void dfs(HashSet<Integer> visited, Stack<Integer> st, int vtx){
//            visited.add(vtx);
//            for(int nbrs :map.get(vtx).keySet()){
//                if(!visited.contains(nbrs)) {
//                    dfs(visited,st,nbrs);
//                }
//
//            }
//            st.push(vtx);
//        }
//
//    }
//}
