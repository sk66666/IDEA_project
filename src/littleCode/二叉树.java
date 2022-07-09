package littleCode;

public class 二叉树 {
    static class TreeNode {
        TreeNode left;
        TreeNode right;
        private int data;

        public TreeNode(int data) {
            super();
            this.left = null;
            this.right = null;
            this.data = data;
        }

        public int getData() {
            return this.data;
        }
    }

    public static class BinaryTree {
        TreeNode rootNode;

        public BinaryTree(int data) {
            rootNode = new TreeNode(data);
        }

        public void insertToTree(int nextdata) {
            insertToTree(rootNode, nextdata);
        }

        public void insertToTree(TreeNode rootNode, int nextdata) {
            if (nextdata > rootNode.getData()) {
                if (rootNode.right == null)
                    rootNode.right = new TreeNode(nextdata);
                else
                    insertToTree(rootNode.right, nextdata);
            } else {
                if (rootNode.left == null)
                    rootNode.left = new TreeNode(nextdata);
                else
                    insertToTree(rootNode.left, nextdata);
            }
        }

        //前序遍历
        public void preOrderTree() {
            preOrderTree(rootNode);
        }

        public void preOrderTree(TreeNode subroot) {
            if (!(subroot == null)) {
                System.out.println(subroot.getData());
                preOrderTree(subroot.left);
                preOrderTree(subroot.right);
            }
        }

        //后序遍历
        public void lastOrderTree() {
            lastOrderTree(rootNode);
        }

        public void lastOrderTree(TreeNode subroot) {
            if (!(subroot == null)) {
                lastOrderTree(subroot.left);
                lastOrderTree(subroot.right);
                System.out.println(subroot.data);

            }
        }

        //中序输出
        public void midOrderTree() {
            midOrderTree(rootNode);
        }

        public void midOrderTree(TreeNode subroot) {
            if (!(subroot == null)) {
                midOrderTree(subroot.left);
                System.out.println(subroot.data);
                midOrderTree(subroot.right);
            }
        }

        //输出叶子数
        public void TreesNumber() {
            int cnt = 0;
            System.out.println("叶子数为" + TreesNumber(rootNode, cnt));
        }

        public int TreesNumber(TreeNode subroot, int cnt) {
            if (!(subroot == null)) {
                cnt++;
                cnt = TreesNumber(subroot.left, cnt);
                cnt = TreesNumber(subroot.right, cnt);
            }
            return cnt;
        }

        //输出树高
        public void TreesHigh() {
            int high = 0;
            System.out.println("树高" + TreesHigh(rootNode, high));
        }

        public int TreesHigh(TreeNode subroot, int high) {
            if (!(subroot == null)) {
                high++;
                high = Math.max(
                        TreesHigh(subroot.left, high),
                        TreesHigh(subroot.right, high));
            }
            return high;
        }


    }

    public static void main(String[] args) {
        int[] data = {49, 45, 80, 11, 55, 86};
        BinaryTree my_tree = new BinaryTree(data[0]);
        for (int i = 1; i < data.length; i++) {
            my_tree.insertToTree(data[i]);
        }
        System.out.println("--前序---");
        my_tree.preOrderTree();
        System.out.println("--中序---");
        my_tree.midOrderTree();
        System.out.println("--后序---");
        my_tree.lastOrderTree();
        my_tree.TreesNumber();
        my_tree.TreesHigh();
    }

}
