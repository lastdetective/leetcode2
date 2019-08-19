//Given a non-negative integer numRows, generate the first numRows of Pascal's triangle. 
//
// 
//In Pascal's triangle, each number is the sum of the two numbers directly above it. 
//
// Example: 
//
// 
//Input: 5
//Output:
//[
//     [1],
//    [1,1],
//   [1,2,1],
//  [1,3,3,1],
// [1,4,6,4,1]
//]
// 
//

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution118 {
    // 此解法时间超时
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> oneLineItem = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                oneLineItem.add(helper(i, j));
            }
            result.add(oneLineItem);

        }
        return result;
    }

    private Integer helper(int i, int j) {
        if (i == 1 || j == 1 || j == i) {
            return 1;
        } else {
            return helper(i - 1, j - 1) + helper(i - 1, j);
        }
    }

    public List<List<Integer>> generate2(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows == 0) {
            return triangle;
        }
        generate(triangle, numRows);
        return triangle;
    }

    private void generate(List<List<Integer>> list, int numRows) {
        if (numRows == 1) {
            list.add(Arrays.asList(1));
        } else {
            generate(list, numRows - 1);

            List<Integer> previousList = list.get(numRows - 2);
            List<Integer> currentList = new ArrayList<>();

            for (int i = 0; i < previousList.size(); i++) {
                if (i == 0) {
                    currentList.add(1);
                }
                if (i > 0) {
                    currentList.add(previousList.get(i) + previousList.get(i - 1));
                }
                if (i == previousList.size() - 1) {
                    currentList.add(1);
                }
            }
            list.add(currentList);
        }
    }



    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Pascal's Triangle.
     * Memory Usage: 33.9 MB, less than 7.23% of Java online submissions for Pascal's Triangle.
     * Next challenges:
     *
     * @param numbers
     * @return
     */
    public List<List<Integer>> generate4(int numbers) {
        return helper(numbers);
    }

    List<List<Integer>> helper(int numbers) {
        List<List<Integer>> result = new ArrayList<>();
        if (numbers < 1) {
            return result;
        }
        for (int i = 0; i < numbers; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
            result.add(row);
        }
        return result;
    }
}