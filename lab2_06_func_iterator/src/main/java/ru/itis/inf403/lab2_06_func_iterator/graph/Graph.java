package ru.itis.inf403.lab2_06_func_iterator.graph;

import java.util.*;

public class Graph implements Iterable<Character> {
    private Map<Character, Set<Character>> graph;

    public Graph() {
        graph = new HashMap<>();
        graph.put('d', null);
        graph.put('a', new HashSet<>(Set.of('d', 'c')));
        graph.put('f', new HashSet<>(Set.of('d')));
        graph.put('g', new HashSet<>(Set.of('d', 'c', 'f')));
        graph.put('c', null);
        graph.put('b', new HashSet<>(Set.of('f', 'g', 'a', 'c')));
    }

    public Map<Character, Set<Character>> getGraph() {
        return graph;
    }

    public Set<Character> sort() {
        Map<Character, Set<Character>> temp = new HashMap<>();
        for (Map.Entry<Character, Set<Character>> entry : graph.entrySet()) {
            temp.put(entry.getKey(), entry.getValue() == null ? null : new HashSet<>(entry.getValue()));
        }
        Set<Character> sorted = new LinkedHashSet<>();

        while (!temp.isEmpty()) {
            Character removable = null;

            for (Map.Entry<Character, Set<Character>> entry : temp.entrySet()) {
                if (entry.getValue() == null) {

                    removable = entry.getKey();
                    break;
                }
            }
            sorted.add(removable);
            temp.remove(removable);

            for (Map.Entry<Character, Set<Character>> entry2 : temp.entrySet()) {
                if (!(entry2.getValue() == null) && !entry2.getValue().isEmpty()) {
                    entry2.getValue().remove(removable);
                    if (entry2.getValue().isEmpty()) {
                        entry2.setValue(null);
                    }
                }
            }
        }

        return sorted;
    }

    @Override
    public Iterator<Character> iterator () {
        return new GraphIterator();
    }

    class GraphIterator implements Iterator<Character> {
        private int step;
        private Character[] sorted;

        public GraphIterator() {
            step = 0;
            sorted = sort().toArray(new Character[0]);
        }

        @Override
        public boolean hasNext() {
            return step < sorted.length;
        }

        @Override
        public Character next() {
            return sorted[step++];
        }
    }
}