class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] student = new int[n];
        
        for(int i=0; i<n; i++){
            student[i]=1;
        }        
        for(int i:reserve){
            student[i-1]++;
        }
        for(int i:lost){
            student[i-1]--;
        }
        
        for(int i=0; i<n; i++){
            if(student[i]==0){
                if(i-1>=0 && student[i-1]==2){
                    student[i]++;
                    student[i-1]--;
                }else if(i+1<n && student[i+1]==2){
                    student[i]++;
                    student[i+1]--;
                }
            }
        }
        
        
        for(int i=0; i<n; i++){
            if(student[i]>=1){
                answer++;
            }
        }
        
        return answer;
    }
}