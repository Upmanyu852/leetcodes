import java.util.*;

class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            int[] freq = new int[26];

            // Count frequency of each character
            for (char ch : str.toCharArray()) {
                freq[ch - 'a']++;
            }

            // Build the key
            StringBuilder keyBuilder = new StringBuilder();

            for (int i = 0; i < 26; i++) {
                if (freq[i] != 0) {
                    keyBuilder.append((char) ('a' + i));
                    keyBuilder.append(freq[i]);
                }
            }

            String key = keyBuilder.toString();

            if (map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
            }
        }

        return new ArrayList<>(map.values());
    }
}