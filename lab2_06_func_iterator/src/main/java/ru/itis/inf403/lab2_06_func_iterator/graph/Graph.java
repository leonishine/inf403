package ru.itis.inf403.lab2_06_func_iterator.graph;

import java.util.*;

public class Graph implements Iterable<Character>{
    private Map<Character, Set<Character>> graph;

    public Graph() {
        graph = new HashMap<>();
        graph.put('d', null);
        graph.put('a', new HashSet<>(Set.of('d','c')));
        graph.put('f', new HashSet<>(Set.of('d')));
        graph.put('g', new HashSet<>(Set.of('d','c','f')));
        graph.put('c', null);
        graph.put('b', new HashSet<>(Set.of('f','g','a','c')));


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

        Map.Entry<Character, Set<Character>> ent = null;

        /*
        while (!temp.isEmpty()) {
            for (Map.Entry<Character, Set<Character>> entry : temp.entrySet()) {
                ent = entry;
                if (entry.getValue() == null) {
                    Character c = entry.getKey();
                    sorted.add(c);
                    for(Map.Entry<Character, Set<Character>> entry2 : temp.entrySet()) {
                        if (!entry2.getValue().isEmpty()) {
                            entry2.getValue().remove(c);
                            if (entry2.getValue().isEmpty()) {
                                entry2.setValue(null);
                            }
                        }

                    }
                    break;
                }
            }
            //System.out.println(ent);
            temp.remove(ent);
            System.out.println(temp);
            //System.out.println(temp);
        }

        return sorted;
        */
        while (!temp.isEmpty()) {
            Character removable = null;

            // Найти вершину без зависимостей
            for (Map.Entry<Character, Set<Character>> entry : temp.entrySet()) {
                if (entry.getValue() == null) {
                    removable = entry.getKey();
                    break;
                }
            }
            sorted.add(removable);
            temp.remove(removable);

            for (Set<Character> deps : temp.values()) {
                if (deps != null) {
                    deps.remove(removable);
                }
            }
            System.out.println(sorted);
        }

        return sorted;

    }

    @Override
    public Iterator<Character> iterator() {
        return null;
    }
}
