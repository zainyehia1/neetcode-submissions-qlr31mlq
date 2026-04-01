class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char sSorted [] = s.toCharArray();
        char tSorted [] = t.toCharArray();

        Arrays.sort(sSorted);
        Arrays.sort(tSorted);

        // if (sSorted.equals(tSorted)) return true;
        // else return false;

        return Arrays.equals(sSorted, tSorted);
    }
}
