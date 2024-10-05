package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/*
 https://leetcode.com/problems/course-schedule/description/
 https://www.geeksforgeeks.org/find-whether-it-is-possible-to-finish-all-tasks-or-not-from-given-dependencies/
 */
public class _207_CourseSchedule {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        return topologicalSort(numCourses, prerequisites);
    }

    private static boolean topologicalSort(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>(numCourses);
        for (int i = 0; i < numCourses; i++) {
            graph.add(i, new ArrayList<>());
        }
        int[] inDegree = new int[numCourses];
        for (int[] edge : prerequisites) {
            graph.get(edge[0]).add(edge[1]);
            inDegree[edge[1]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }
        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int neighbor : graph.get(node)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }

        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] > 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean dfs(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>(numCourses);
        for (int i = 0; i < numCourses; i++) {
            graph.add(i, new ArrayList<>());
        }
        for (int[] pre : prerequisites) {
            graph.get(pre[0]).add(pre[1]);
        }
        boolean[] visited = new boolean[numCourses];
        boolean[] onpath = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (!visited[i] && dfsCycle(graph, i, onpath, visited)) {
                return false;
            }
        }
        return true;
    }

    private static boolean dfsCycle(List<List<Integer>> graph, int node, boolean[] onpath, boolean[] visited) {
        if (visited[node]) {
            return false;
        }
        onpath[node] = visited[node] = true;
        for (int neigh : graph.get(node)) {
            if (onpath[neigh] || dfsCycle(graph, neigh, onpath, visited)) {
                return true;
            }
        }
        return onpath[node] = false;

    }
}
