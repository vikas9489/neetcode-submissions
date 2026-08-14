class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map=HashMap<Int,Int>()
        for(i in nums.indices)
        {
            if(nums[i] in map)
            {
                map[nums[i]]=map[nums[i]]!!+1
            }
            else{
                map[nums[i]]=1
            }
        }

        val list=map.entries.sortedByDescending{
             it.value}

        return list.take(k).map{it.key}.toIntArray()

    }
}
