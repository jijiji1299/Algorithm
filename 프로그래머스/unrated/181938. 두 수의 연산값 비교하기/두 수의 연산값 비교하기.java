class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String aa = Integer.toString(a);
        String bb = Integer.toString(b);
        String str_test1 = aa+bb;
        int test1 = Integer.parseInt(str_test1);
        int test2 = 2*a*b;
        
        if(test1>test2) {
            answer = test1;
        } else {
            answer = test2;
        }
        
        return answer;
    }
}