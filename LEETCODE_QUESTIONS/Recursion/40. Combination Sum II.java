class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates,target,0,ans,new ArrayList<>());
        return ans;
    }
    private void solve(int[] arr,int k,int index,List<List<Integer>>ans,List<Integer>list){
        if(k==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<arr.length;i++){
            if(i>index&&arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]>k){
                break;
            }
            list.add(arr[i]);
            solve(arr,k-arr[i],i+1,ans,list);
            list.remove(list.size()-1);

        }
    }
}
