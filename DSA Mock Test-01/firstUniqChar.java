import java.util.*;

class firstUniqChar {
    public static void main(String[] args) {
        // Testcases
        String s = "leetcode";
        // String s = "loveleetcode";
        // String s = "aabb";
        Boolean flag = false;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) == 1) {
                System.out.println(i);
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(-1);
    }
}
