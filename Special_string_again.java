static long substrCount(int n, String s) {
        long ans = s.length();
        for(int i =0; i< s.length(); i++){
        int repeat =0;
        while(i+1 < s.length() && s.charAt(i) == s.charAt(i+1)){
        repeat++;
        i++;
        }
        ans += repeat*(repeat+1)/2;

        int pointer = 1;
        while(i-pointer >= 0 && i+pointer < s.length() && s.charAt(i+pointer) == s.charAt(i-1) && s.charAt(i-pointer) == s.charAt(i-1)){
        ans++;
        pointer++;
        }
        }
    return ans;
}