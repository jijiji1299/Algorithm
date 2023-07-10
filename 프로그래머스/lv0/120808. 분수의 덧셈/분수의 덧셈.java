class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        // 분수의 덧셈
        int boonmo = denom1*denom2;
        int boonja = denom1 * numer2 + denom2 * numer1;
        
        // 기약분수 구하기
        int max = 1;
        
        for (int i=1; i<=boonmo && i<=boonja; i++) {
            if (boonmo%i==0 && boonja%i==0) {
               max=i; 
            }
        }
        
        // 기약분수로 처리
        boonmo = boonmo/max;
        boonja = boonja/max;
        
        int[] answer = {boonja, boonmo};
        return answer;
    }
}