class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        //save the array element with index in this map
        var numMap = mutableMapOf<Int, Int>() //element, index

        //iterate through the array.
        for(i in 0 until nums.size) {
            //check if target-element exists already in the app
            var index = numMap[target-nums[i]]
            if(index!=null) {
                //if yes, return the array
                return intArrayOf(index,i)
            }
            //if not, add it.
            numMap[nums[i]] = i
        }
        return intArrayOf()
    }
}
