import java.util.LinkedList;
import java.util.Scanner;

class CreateGraph{

    private LinkedList<Integer> adjList[];

    CreateGraph(int v){
        adjList = new LinkedList[v];
        for(int i=0; i<v; i++){
            adjList[i] = new LinkedList<Integer>();
        }
    }
    public void addEdges(int src, int desn){
            adjList[src].add(desn);
            adjList[desn].add(src);
    }

    public void printGraph(int noOfNodes){
        for(int i=0; i<noOfNodes; i++){
            System.out.print(i + " ===> ");
            LinkedList<Integer> nodelist = adjList[i];

            for(int node : nodelist){
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of vertices and Edges :");
        int noOfNodes = scanner.nextInt();
        int noOfEgdes = scanner.nextInt();

        CreateGraph graph = new CreateGraph(noOfNodes);
        System.out.println("Enter src and Dest of edge :");
        for(int i=0; i<noOfEgdes; i++){
                graph.addEdges(scanner.nextInt(), scanner.nextInt());
        }
        scanner.close();
        
        graph.printGraph(noOfNodes);
    }
}
