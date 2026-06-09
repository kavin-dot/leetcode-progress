class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> li=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        back(0,0,arr,target);
        return ans;
    }
    public boolean back(int idx,int sum,int[] arr,int target){
        if(sum==target){
            return true;
        }
        if(sum>target || idx==arr.length){
            return false;
        }
        for(int i=idx;i<arr.length;i++){
            li.add(arr[i]);
            if(back(i,sum+arr[i],arr,target)){
                ans.add(new ArrayList<>(li));
                li.remove(li.size()-1);
            }else{
                li.remove(li.size()-1);
            }           
        }
        return false;
    }

}
