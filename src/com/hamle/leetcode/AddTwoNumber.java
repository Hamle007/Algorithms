package com.hamle.leetcode;

/**
 * 链式结构的两个数字相加
 * @author Hamle
 * @date 2019/2/11.
 */
public class AddTwoNumber {

    public static void main(String[] args) {
        ListNode one = new AddTwoNumber().new ListNode(2);
        one.next = new AddTwoNumber().new ListNode(4);
        one.next.next = new AddTwoNumber().new ListNode(3);
        ListNode two = new AddTwoNumber().new ListNode(5);
        two.next = new AddTwoNumber().new ListNode(6);
        two.next.next = new AddTwoNumber().new ListNode(4);
        AddTwoNumber test = new AddTwoNumber();
        ListNode result = test.addTwoNumbers(one, two);
        result.print(result);
    }

    /**
     * 每一个位置的数字代表一个节点
     */
    class ListNode {
        /**
         * 值
         */
        int val;
        /**
         * 下一个节点
         */
        ListNode next;
        ListNode (int val) {
            this.val = val;
        }

        public void print(ListNode node) {
            while(node != null) {
                System.out.print(node.val);
                if(node.next == null) {
                    break;
                }
                node = node.next;
            }
        }
    }

    /**
     * 实现
     * @param l1 节点一
     * @param l2 节点二
     * @return 结果节点
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return null;
        }
        int shi = 0;
        int ge = 0;
        ListNode result = null;
        ListNode temp = null;
        while(true) {
            ge = l1.val + l2.val + shi;
            if (ge > 9) {
                shi = ge / 10;
                ge = ge % 10;
            } else {
                shi = 0;
            }
            if (temp != null) {
                temp.next = new ListNode(ge);
                temp = temp.next;
            } else {
                temp = new ListNode(ge);
                result = temp;
            }
            if (l1.next == null && l2.next == null) {
                if (shi != 0) {
                    temp.next = new ListNode(shi);
                }
                break;
            }
            if (l1.next == null) {
                l1 = new ListNode(0);
                l2 = l2.next;
            } else if (l2.next == null) {
                l2 = new ListNode(0);
                l1 = l1.next;
            } else {
                l1 = l1.next;
                l2 = l2.next;
            }
        }
        return result;
    }

}
