class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
    
        if (hash(t).equals(hash(s))){
            return true;
        }

        return false;
    }

    public Map<Character, Integer> hash(String text){
        Map<Character, Integer> hashMap = new HashMap<>();

        for(int i=0; i< text.length(); i++){
                int frequency = hashMap.getOrDefault(text.charAt(i), 0) + 1;
                hashMap.put(text.charAt(i), (frequency));
            }

        return hashMap;
    }
   
   
}
