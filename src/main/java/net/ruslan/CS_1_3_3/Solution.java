package net.ruslan.CS_1_3_3;

import java.util.LinkedList;

public class Solution {
    public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> result = new LinkedList<>();
        int carry = 0;

        while (!l1.isEmpty() || !l2.isEmpty() || carry != 0) {

            int sum = carry;

            if (!l1.isEmpty()) {
                sum += l1.removeFirst();
            }

            if (!l2.isEmpty()) {
                sum += l2.removeFirst();
            }

            carry = sum / 10;

            result.add(sum % 10);
        }

        return result;
    }

    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(2);
        l1.add(4);
        l1.add(3);

        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(5);
        l2.add(6);
        l2.add(4);

        LinkedList<Integer> result = addTwoNumbers(l1, l2);

        for (int num : result) {
            System.out.print(num + " ");
        }

    }
}
