class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> res = new HashMap<>();
        for(String s: strs){
            char[] charArray;
            charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = String.valueOf(charArray);
            res.putIfAbsent(sortedS, new ArrayList<>());
            res.get(sortedS).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
