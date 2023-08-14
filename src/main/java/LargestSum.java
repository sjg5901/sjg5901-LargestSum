
import java.util.*;
import java.util.stream.Collectors;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){

        // if List is sorted, sum of last two elements will be largest sum, duplicates or not
        // can sort List with Collections.sort(nums) method or List.sort(null)
        // can also sort using stream API, but requires creation of another List or update of current one

        //Collections.sort(nums);

        //nums.sort(null);

        nums = nums.stream().sorted().collect(Collectors.toList());

        return nums.get(nums.size() -2) + nums.get(nums.size() - 1);
    }
}
