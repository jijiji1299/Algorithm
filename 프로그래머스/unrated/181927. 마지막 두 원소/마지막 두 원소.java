class Solution {
    public int[] solution(int[] num_list) {
        int temp = num_list.length -1;  // 원본 배열의 마지막 위치값
        // 원본 배열 크기의 +1을 가지는 배열 생성
        int[] new_list = new int[num_list.length+1];
        
        // 새로운 배열에 값 할당
        for(int i=0; i<num_list.length; i++) {
            new_list[i] = num_list[i];
        }
        
        // 원소의 크기 비교 후 결과값 마지막 위치 배열에 추가
        if(num_list[temp] > num_list[temp-1]) {
            new_list[temp+1] = num_list[temp] - num_list[temp-1];
        }
        else {
            new_list[temp+1] = num_list[temp]*2;
        }
        
        return new_list;
    }
}