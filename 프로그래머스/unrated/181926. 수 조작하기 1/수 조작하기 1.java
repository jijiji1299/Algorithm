class Solution {
    public int solution(int n, String control) {
        int answer = 0;

        for(int i=0; i<control.length(); i++) {
            String a = control.substring(i, i+1);
            
            if(a.equals("w")) {
                n += 1;
            } 
            else if(a.equals("s")) {
                n -= 1;
            }
            else if(a.equals("d")) {
                n += 10;
            }
            else if(a.equals("a")) {
                n -= 10;
            }
            answer = n;
        }

        return answer;
    }
}