class Solution {

    fun threeSum(nums: IntArray): List<List<Int>> {

        val list: MutableList<MutableList<Int>> = mutableListOf()

        nums.sort()

        var sum = 0

        for (i in nums.indices) {

            var left = i + 1
            var right = nums.size - 1

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue
            }

            while (left < right) {

                if (nums[left] + nums[right] + nums[i] == sum) {

                    list.add(
                        mutableListOf(
                            nums[left],
                            nums[right],
                            nums[i]
                        )
                    )

                    left++
                    right--

                    // Skip duplicate left values
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++
                    }

                    // Skip duplicate right values
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--
                    }

                } else if (nums[left] + nums[right] + nums[i] < sum) {

                    left++

                } else {

                    right--
                }
            }
        }

        return list
    }
}