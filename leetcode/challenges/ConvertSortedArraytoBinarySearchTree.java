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
        System.out.println(node.val == 1);        
    }

}