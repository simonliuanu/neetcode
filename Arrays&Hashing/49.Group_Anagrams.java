class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String newstr = new String(chars);
            map.computeIfAbsent(newstr, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
