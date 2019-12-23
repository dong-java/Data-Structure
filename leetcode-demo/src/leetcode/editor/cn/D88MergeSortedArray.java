//给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。 
//
// 说明: 
//
// 
// 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。 
// 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。 
// 
//
// 示例: 
//
// 输入:
//nums1 = [1,2,3,0,0,0], m = 3
//nums2 = [2,5,6],       n = 3
//
//输出: [1,2,2,3,5,6] 
// Related Topics 数组 双指针

package leetcode.editor.cn;
//Java：Merge Sorted Array
public class D88MergeSortedArray{
    public static void main(String[] args) {
        Solution solution = new D88MergeSortedArray().new Solution();
        // TO TEST
    }

    /**
     * 混合插入有序数组，由于两个数组都是有序的，所有只要按顺序比较大小即可。题目中说了 nums1 数组有足够大的空间，说明不用 resize 数组，又给了m和n，那就知道了混合之后的数组的大小，这样就从 nums1 和 nums2 数组的末尾开始一个一个比较，把较大的数，按顺序从后往前加入混合之后的数组末尾。需要三个变量 i，j，k，分别指向 nums1，nums2，和混合数组的末尾。进行 while 循环，如果i和j都大于0，再看如果 nums1[i] > nums2[j]，说明要先把 nums1[i] 加入混合数组的末尾，加入后k和i都要自减1；反之就把 nums2[j] 加入混合数组的末尾，加入后k和j都要自减1。循环结束后，有可能i或者j还大于等于0，若j大于0，那么还需要继续循环，将 nums2 中的数字继续拷入 nums1。若是i大于等于0，那么就不用管，因为混合数组本身就放在 nums1 中，参见代码如下：
     */
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len1 = m - 1, len2 = n - 1, newLen1 = m + n - 1;
        while (len1 >= 0 && len2 >= 0) {
            if(nums1[len1] > nums2[len2]){
                nums1[newLen1--] = nums1[len1--];
            }else{
                nums1[newLen1--] = nums2[len2--];
            }
        }
        while (len2 >= 0) {
            nums1[newLen1--] = nums2[len2--];
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}