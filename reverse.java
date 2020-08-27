class Solution {
    public void reverseString(char[] s) {
        String r = Reverse("hello");
        System.out.println(r);
    }
    
    public static String Reverse(String s){
        char[] letters = new char[s.length()];

        int letterindex = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            letters[letterindex] = s.charAt(i);
            letterindex++;
        }

        String Reverse = "";
        for(int i = 0; i < s.length(); i++){
            Reverse = Reverse + letters[i];
        }

        return Reverse;
    }
}
