class Solution {

    class Node {
        int left, right;
        int prefix, suffix, max;

        Node(int left, int right) {
            this.left = left;
            this.right = right;
            this.prefix = 1;
            this.suffix = 1;
            this.max = 1;
        }
    }

    char[] s;
    Node[] tree;

    void build(int index, int left, int right) {
        tree[index] = new Node(left, right);

        if (left == right) {
            return;
        }

        int mid = (left + right) / 2;

        build(index * 2, left, mid);
        build(index * 2 + 1, mid + 1, right);

        merge(index);
    }

    void merge(int index) {
        Node left = tree[index * 2];
        Node right = tree[index * 2 + 1];
        Node curr = tree[index];

        curr.prefix = left.prefix;
        curr.suffix = right.suffix;
        curr.max = Math.max(left.max, right.max);

        // If boundary characters are same,
        // we can join the two parts
        if (s[left.right] == s[right.left]) {

            if (left.prefix == left.right - left.left + 1) {
                curr.prefix += right.prefix;
            }

            if (right.suffix == right.right - right.left + 1) {
                curr.suffix += left.suffix;
            }

            curr.max = Math.max(curr.max,
                    left.suffix + right.prefix);
        }
    }

    void update(int index, int left, int right, int pos, char ch) {

        if (left == right) {
            s[pos] = ch;
            return;
        }

        int mid = (left + right) / 2;

        if (pos <= mid) {
            update(index * 2, left, mid, pos, ch);
        } else {
            update(index * 2 + 1, mid + 1, right, pos, ch);
        }

        merge(index);
    }

    public int[] longestRepeating(String s,
                                  String queryCharacters,
                                  int[] queryIndices) {

        this.s = s.toCharArray();

        int n = s.length();

        tree = new Node[4 * n];

        build(1, 0, n - 1);

        int[] ans = new int[queryIndices.length];

        for (int i = 0; i < queryIndices.length; i++) {

            update(
                1,
                0,
                n - 1,
                queryIndices[i],
                queryCharacters.charAt(i)
            );

            ans[i] = tree[1].max;
        }

        return ans;
    }
}