

##Question

Symmetric Tree
Solved
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

 

Example 1:


Input: root = [1,2,2,3,4,4,3]
Output: true
Example 2:


Input: root = [1,2,2,null,3,null,3]
Output: false


#Solution

class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSym(root.left,root.right);
    }

    public boolean isSym(TreeNode left, TreeNode right){
        if(left==null||right==null) return left==right;
        return (left.val==right.val) && isSym(left.left,right.right)&&isSym(left.right,right.left);
    }
}
