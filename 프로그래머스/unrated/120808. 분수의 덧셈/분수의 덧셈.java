class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        // 분수 덧셈
        int denom = denom1 * denom2;
        int numer = denom2 * numer1 + denom1 * numer2;
        
        // 최대공약수 계산
        int max = 1;    
        for (int i = 1; i<=denom && i<=numer; i++) {
            if (denom % i == 0 && numer % i == 0) {
                max = i;
            }
        }
        
        // 기약분수 계산
        denom = denom / max;
        numer = numer / max;
        
        // 배열로 표시
        int[] result = {numer, denom};
        return result;
        
    }
}