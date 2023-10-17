package Tasks;
import java.util.Scanner;

public class Tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nunber of nodes:");
        int n =sc.nextInt();
        for(int i = 0; i < n; i++) {
            String str = sc.nextLine();
            System.out.println(str);
        }

        sc.close();
    }
}










// import java.util.*;

// public class Tree {
//     public static void main(String[] args) {
//         String[] input1 = {"(2,4)", "(3,4)", "(5,2)", "(6,3)", "(8,4)"};
//         String[] input2 = {"(2,4)", "(3,4)", "(5,2)", "(6,3)"};

//         boolean isValid1 = isValidTree(input1);
//         boolean isValid2 = isValidTree(input2);

//         System.out.println("Input 1 is valid: " + isValid1);
//         System.out.println("Input 2 is valid: " + isValid2);
//     }

//     public static boolean isValidTree(String[] input) {
//         // Create a map to store parent-child relationships
//         Map<Integer, List<Integer>> tree = new HashMap<>();

//         // Populate the tree data structure
//         for (String relationship : input) {
//             String[] parts = relationship.replaceAll("[()]", "").split(",");
//             int child = Integer.parseInt(parts[0]);
//             int parent = Integer.parseInt(parts[1]);

//             tree.putIfAbsent(parent, new ArrayList<>());
//             tree.get(parent).add(child);
//         }

//         int rootCount = 0;

//         // Count the number of root nodes (nodes with no parent)
//         for (int parent : tree.keySet()) {
//             if (!tree.containsValue(parent)) {
//                 rootCount++;
//             }
//         }

//         if (rootCount != 1) {
//             return false; // There should be exactly one root node
//         }

//         // Check for cycles and isolated nodes
//         return isTreeValid(tree, tree.keySet().iterator().next(), new HashSet<>());
//     }

//     private static boolean isTreeValid(Map<Integer, List<Integer>> tree, int node, Set<Integer> visited) {
//         if (visited.contains(node)) {
//             return false; // Cycle detected
//         }

//         visited.add(node);

//         List<Integer> children = tree.get(node);

//         if (children != null) {
//             for (int child : children) {
//                 if (!isTreeValid(tree, child, visited)) {
//                     return false; // Invalid subtree
//                 }
//             }
//         }

//         visited.remove(node);

//         return true;
//     }
// }
