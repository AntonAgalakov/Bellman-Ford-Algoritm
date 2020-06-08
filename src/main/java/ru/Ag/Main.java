package ru.Ag;

import java.util.Scanner;

public class Main {

    public static void main(String[] argv) {
        int numberOfVertices;
        int numberOfArcs;
        BellmanFord bellmanFord = new BellmanFord();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        numberOfVertices = sc.nextInt();
        bellmanFord.setNumberOfVertices(numberOfVertices);

        System.out.print("Enter the number of arcs: ");
        numberOfArcs = sc.nextInt();
        bellmanFord.setNumberOfArcs(numberOfArcs);

        System.out.println("Enter the two vertices and the weight of the arc between them");
        for (int i = 0; i < numberOfArcs; i++) {
            System.out.println("v1 v2 weight");
            int tempStart = sc.nextInt();
            int tempEnd = sc.nextInt();
            int tempWight = sc.nextInt();
            bellmanFord.AddArc(tempStart, tempEnd, tempWight);
        }

        bellmanFord.printMatrix();
        System.out.println("Enter the two vertices(from, to): ");
        bellmanFord.getPath(sc.nextInt(), sc.nextInt());
    }
}
