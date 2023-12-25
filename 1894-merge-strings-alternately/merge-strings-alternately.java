class Solution {
    public String mergeAlternately(String word1, String word2) {
        String output = "";
        int i = 0;
        int j = 0;
        if(word1 == "") return word2;
        if(word2 == "") return word1;
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        while(i<w1.length||j<w2.length) {
            if(i<w1.length)  output += w1[i];
           
           if(j<w2.length) output += w2[j];
            i++;
            j++;
        }
        while(i<w1.length) {
            output += w1[i];
        }
        while(j<w2.length) {
            output += w2[i];
        }
        return output;
    }
}