class Solution {
    fun maxArea(heights: IntArray): Int {

        var max=0
        var i=0
        var j=heights.size-1
        while(i<j)
        {
            val area=min(heights[i],heights[j])*(j-i)
            max=max(area,max)

            if(heights[i]<heights[j])
            {
                i++
            }
            else
            {
                j--
            }
            
        }


        return max
    }
}
