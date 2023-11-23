// 피보나치 수열
// n의 범위 0~100000
//재귀함수의 시간복잡도 O(2^n) >>다른방식으로 짜야한다
import java.math.BigInteger

class Solution {
    /*
    fun fibo(n: Int):Int{//재귀함수의 시간복잡도 O(2^n) >>다른방식으로 짜야한다
        if(n==0) return 0
        if(n==1) return 1
        return fibo(n-1)+fibo(n-2)
    }
    */
    fun solution(n: Int): Int {
        var answer = 0
        var listFibo = mutableListOf<BigInteger>()
        listFibo.add(BigInteger("0"))
        listFibo.add(BigInteger("1"))
        for(i in 2..n){
            listFibo.add(listFibo[i-1].add(listFibo[i-2]))
        }
        answer = (listFibo.last().remainder(BigInteger("1234567"))).toInt()
        return answer
    }
}
fun main(){
    var a = Solution()
    a.solution(99999)//2
    a.solution(5)//5
}