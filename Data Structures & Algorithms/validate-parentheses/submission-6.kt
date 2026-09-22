class Solution {
    fun isValid(s: String): Boolean {
        var stack = ArrayDeque(listOf<Char>())
        var sizeOfArray = s.length;
        for(i in 0 until sizeOfArray) {
            when(s[i]) {
                '(','{','[' -> if(i==sizeOfArray-1) { return false } else {stack.addLast(s[i])}
                ')' -> if (stack.pollLast() != '(') {  return false}
                '}' ->if (stack.pollLast() != '{') {  return false}
                ']' ->if (stack.pollLast() != '[') { return false}
            }
        }
        if(!stack.isEmpty()) return false
        return true
    }
}
