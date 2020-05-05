
/**
 * 108. Convert Sorted Array to Binary Search Tree
 * problem : Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 * link : https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 * tag : easy array bst tree recursion
 * pattern : recursion
 * 
 * @author mayurm
 */

class ConvertSortedArraytoBinarySearchTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    
        public TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null)
            return null;
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    TreeNode sortedArrayToBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, left, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, right);
        return root;
    }

    public static void main(String[] args){
        int[] nums = new int[] {1};
        TreeNode node = new ConvertSortedArraytoBinarySearchTree().sortedArrayToBST(nums);
        assert node.val == 1;        
    }

}