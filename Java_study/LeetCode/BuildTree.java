package LeetCode;
/*编一个程序，读入用户输入的一串先序遍历字符串，根据此字符串建立一个二叉树（以指针方式存储）。
例如如下的先序遍历字符串： ABC##DE#G##F### 其中“#”表示的是空格，空格字符代表空树。
建立起此二叉树以后，再对二叉树进行中序遍历，输出遍历结果。*/
import java.util.Scanner;

public class BuildTree {
    public static class TreeNode {
        public char val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(char val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意!!!!
        // 系统给的测试用例, 往往是多组!!
        while (scanner.hasNext()) {
            String line = scanner.next();
            TreeNode root = build(line);
            inOrder(root);
            // 打印换行
            System.out.println();
        }
    }

    // 当前这个 String line 里的每个字符就对应到
    // 树的一个节点.
    // 接下来我们要进行递归.
    // 为了在递归过程中, 也能明确的知道当前正在处理的是哪个节点
    // 使用一个成员变量 index, 记录当前节点对应的下标.
    public static int index = 0;
    public static TreeNode build(String line) {
        // 由于我们的用例可能有多组.
        // 需要保证每组用例开始递归之前, 都把
        // index 设为 0, 保证多个用例之间不干扰
        index = 0;
        return _build(line);
    }

    // 实际是通过这个 _build 方法来进行递归的.
    // 不能直接拿 build 来递归, 因为 build 里面有一个
    // index = 0 的语句. 这个东西如果递归中执行了,
    // 就把 index 的值搞混乱了.
    public static TreeNode _build(String line) {
        // 先根据 index 把当前要处理的节点给获取到.
        char ch = line.charAt(index);
        if (ch == '#') {
            // 遇到 # 说明当前节点是一个空树, 直接返回 null 即可
            return null;
        }
        TreeNode root = new TreeNode(ch);
        index++;
        root.left = _build(line);
        index++;
        root.right = _build(line);
        return root;
    }

    public static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
}

