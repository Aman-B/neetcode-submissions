class Solution {
    fun isValid(s: String): Boolean {
        var sArray = s.toCharArray()
        var stack = ArrayDeque(listOf<Char>())

        for(i in sArray.indices) {
            when(sArray[i]) {
                '(','{','[' -> if(i==sArray.size-1) { return false } else {stack.addLast(sArray[i])}
                ')' -> if (stack.pollLast() != '(') {  return false}
                '}' ->if (stack.pollLast() != '{') {  return false}
                ']' ->if (stack.pollLast() != '[') { return false}
            }
        }
        if(!stack.isEmpty()) return false
        return true
    }
}
