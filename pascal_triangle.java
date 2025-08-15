##Question

Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


##Solution

class Solution {
    public List<List<Integer>> generate(int numRows) {
     List<List<Integer>> res = new ArrayList<>();
     if(numRows==1){
     res.add(List.of(1));
     return res;}
    res.add(List.of(1));         
    res.add(List.of(1, 1));   
       int n =1;
    for(int i = 2;i<numRows;i++){
        List<Integer> r = new ArrayList();
        r.add(1);
 
        for(int j =0;j<n;j++){
        r.add(res.get(i-1).get(j)+res.get(i-1).get(j+1));
        }
        r.add(1);
        res.add(r);
        n++;
    }
    return res;
    }
}
