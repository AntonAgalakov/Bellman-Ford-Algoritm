package ru.Ag;

import java.util.ArrayList;

public class BellmanFord {
    private int numberOfVertices;
    private int numberOfArcs;
    int[] distances;
    ArrayList<Arc> graph;
    private final int infinity = 2147483647;

    public int getNumberOfVertices() {
        return numberOfVertices;
    }

    public void setNumberOfVertices(int numberOfVertices) {
        this.numberOfVertices = numberOfVertices;
        distances = new int[numberOfVertices];
        for (int i = 0; i < numberOfVertices; i++)
            distances[i] = infinity;
    }

    public int getNumberOfArcs() {
        return numberOfArcs;
    }

    public void setNumberOfArcs(int numberOfArcs) {
        this.numberOfArcs = numberOfArcs;
        graph = new ArrayList<>(numberOfArcs);
    }

    public void AddArc(int vertexStart, int vertexEnd, int weight) {
        Arc arc = new Arc();
        arc.setValues(vertexStart, vertexEnd, weight);
        graph.add(arc);
    }

    public void printMatrix() {
        for (int i = 0; i < numberOfArcs; i++)
            System.out.println(graph.get(i).getVertexStart() + " " +
                    graph.get(i).getVertexEnd() + " " +
                    graph.get(i).getWeight());
    }

    public void getPath(int start, int end) {
        distances[start - 1] = 0;

        for (int i = 0; i < numberOfVertices - 1; i++) {
            for (int j = 0; j < numberOfArcs; j++) {
                distances[graph.get(j).getVertexEnd() - 1] = Math.min(distances[graph.get(j).getVertexEnd() - 1],
                        distances[graph.get(j).getVertexStart() - 1] + graph.get(j).getWeight());
            }
        }

        if (distances[end - 1] == infinity)
            System.out.println("No way to " + end);
        else
            System.out.println("Shortest part from " + start + " to " + end + " = " + distances[end - 1]);

        for (int i = 0; i < numberOfVertices; i++) {
            if (distances[i] != infinity)
                System.out.println("Way from" + start + " to " + (i + 1) + " = " + distances[i]);
        }
    }
}
