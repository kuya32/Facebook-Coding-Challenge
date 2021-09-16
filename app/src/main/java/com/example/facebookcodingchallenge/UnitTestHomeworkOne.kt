package com.example.facebookcodingchallenge

object UnitTestHomeworkOne {

    /**
     * Returns the n-th fibonacci number
     * They are defined like this:
     * fib(0) = 0
     * fib(1) = 1
     * fib(n) = fib(n-2) + fib(n-1)
     */
    fun fib(n: Int): Long {
        return if(n == 0 || n == 1) {
            n.toLong()
        } else if (n == 2) {
            1
        } else {
            val array = intArrayOf(1, 1)
            for (i in 3..n) {
                val temp = array[1]
                array[1] = array[0] + array[1]
                array[0] = temp
            }
            array[1].toLong()
        }
    }

    /**
     * Checks if the braces are set correctly
     * e.g. "(a * b))" should return false
     */
    fun checkBraces(string: String): Boolean {
        return string.count { it == '(' } == string.count { it == ')' }
    }
}