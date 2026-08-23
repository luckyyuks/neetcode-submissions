class Solution {
    public boolean isPalindrome(String s) {
        int startIndex = 0;
        int endIndex = s.length() -1; 

        while(startIndex<endIndex){    
           if(!Character.isLetterOrDigit(s.charAt(startIndex))){
            startIndex = startIndex + 1;
            continue;
           } 

           if(!Character.isLetterOrDigit(s.charAt(endIndex))){
            endIndex = endIndex - 1;
            continue;
           }       

           if(Character.toLowerCase(s.charAt(startIndex))!= Character.toLowerCase(s.charAt(endIndex))){
            return false;
           }

           startIndex++;
           endIndex--;
        }

        return true;
    }
}
