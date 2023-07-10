class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        if(num1==num2) {
            answer = 1;
        }else {
            answer =-1;
        }
        return answer;
    }
}

// 다른 풀이 (삼항연산자)
class Solution {
    public int solution(int num1, int num2) {
        int answer = (num1 == num2) ? 1 : -1;
        return answer;
    }
}
