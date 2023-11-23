// 피보나치 수열
//

class Solution {
    fun fibo(n: Int):Int{//재귀함수의 시간복잡도 O(2^n) >>다른방식으로 짜야한다
        if(n==0) return 0
        if(n==1) return 1
        return fibo(n-1)+fibo(n-2)
    }
    fun solution(n: Int): Int {
        var answer = 0
        answer = fibo(n)%1234567
        return answer
    }
}
fun main(){
    var a = Solution()
    a.solution(3)//2
    a.solution(5)//5
}