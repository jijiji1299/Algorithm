class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        int result = 0;
        boolean var = (0<=num1 && num1<=100 && 0<=num2 && num2<=100);
        if (var){
            answer = 1000*num1/num2;
        }
        return answer;
    }
}