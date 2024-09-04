// Solution 1
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();
        Arrays.sort(schar);
        Arrays.sort(tchar);
        // for (int i = 0; i < schar.length; i++) {
        //     if (schar[i] != tchar[i]) return false;
        // }
        // return true;
        return Arrays.equals(schar, tchar);
    }
}

// Solution 2
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            table[s.charAt(i) - 'a']++;
            table[t.charAt(i) - 'a']--;
        }
        for (int n : table) {
            if (n != 0) return false;
        }
        return true;
    }
}

// Follow up Solution
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }
        for (Integer n : map.values()) {
            if (n != 0) return false;
        }
        return true;
    }
}
