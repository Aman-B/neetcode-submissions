class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        var numMap = mutableMapOf<Int, Int>() // value, count
        for(i in nums.indices) {
            if(numMap != null) {
                var count = numMap[nums[i]]
                if((count?:0)>0) return true
                else {
                    numMap[nums[i]] = 1 
                }
            } 
        }
        return false
    }
}
