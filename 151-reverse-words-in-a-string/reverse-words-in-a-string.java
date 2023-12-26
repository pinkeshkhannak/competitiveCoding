class Solution {
    public String reverseWords(String s) {
        String word[] = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        int n = word.length-1;
        for(int i = n;i>=0;i--) {
            String a = word[i];
            System.out.println(a);
            sb.append(a.trim());
            if(i>0)
            sb.append(" ");
        }
        
        return sb.toString().trim();
    }       
}

