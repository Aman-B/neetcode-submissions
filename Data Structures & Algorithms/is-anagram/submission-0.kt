class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        var anaMap = mutableMapOf<Char, Int>()
        if(s.length != t.length)
        {
            return false
        }
        for(letter in s) {
            anaMap[letter]= (anaMap[letter]?:0)+1
        }
        for(letter in t) {
            var anaChar = (anaMap[letter]?:0)
        if((anaChar?:0) == 0) return false
        else {
            anaMap[letter]= anaChar-1
        }
        }
        return true
    }
}
