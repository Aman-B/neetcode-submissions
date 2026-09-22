class Solution {
    fun isValid(s: String): Boolean {
        var sArray = s.toCharArray()
        var stack = ArrayDeque(listOf<Char>())
        var sizeOfArray = sArray.size;
        for(i in 0 until sizeOfArray) {
            when(sArray[i]) {
                '(','{','[' -> if(i==sizeOfArray-1) { return false } else {stack.addLast(sArray[i])}
                ')' -> if (stack.pollLast() != '(') {  return false}
                '}' ->if (stack.pollLast() != '{') {  return false}
                ']' ->if (stack.pollLast() != '[') { return false}
            }
        }
        if(!stack.isEmpty()) return false
        return true
    }
}
