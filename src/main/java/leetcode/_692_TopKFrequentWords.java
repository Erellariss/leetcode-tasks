package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Stream;

public class _692_TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        return frequencyMapWithMaxHeap(words, k);
//        return frequencyMapWithSorting(words, k);
    }

    private List<String> frequencyMapWithMaxHeap(String[] words, int k) {
        Map<String, Integer> count = new HashMap<>();
        for (String word : words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        PriorityQueue<String> minHeap = new PriorityQueue<>((o1, o2) -> {
            if (count.get(o1).equals(count.get(o2))) {
                return o1.compareTo(o2);
            }
            return count.get(o2) - count.get(o1);
        });
        for (String word : count.keySet()) {
            minHeap.offer(word);
        }
        return Stream.generate(minHeap::poll)
                .limit(k)
                .toList();
    }

    private static List<String> frequencyMapWithSorting(String[] words, int k) { // n log n
        Map<String, Integer> count = new HashMap<>();
        for (String word : words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        List<String> candidates = new ArrayList<>(count.keySet());
        candidates.sort((o1, o2) -> {
            if (count.get(o1).equals(count.get(o2))) {
                return o1.compareTo(o2);
            } else {
                return count.get(o2) - count.get(o1);
            }
        });
        return candidates.subList(0, k);
    }
}
