class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] ary = new int[1001]; //array의 원소
        
        for (int i=0; i<array.length; i++){  
            ary[array[i]]++;    //원소 갯수 ary에 저장
        }
        
        int max = 0 ;  //최빈값의 갯수
        int maxIndex = 0 ; //최빈값 
        
        for (int i = 0; i<ary.length; i++){
            if(ary[i]>max){
                max = ary[i];
                maxIndex = i;
            }
        }
        
        int count =0;
        for (int i = 0; i<ary.length; i++){ //최빈값 갯수 확인
            if(ary[i] == max) count++;
        }
        if(count>1){
            return answer = -1;
        }

        answer = maxIndex;
        return answer;
    }
}