package com.example.facebookcodingchallenge

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class UnitTestHomeworkOneTest {

    @Test
    fun `when n is 0 returns 0`() {
        val result = UnitTestHomeworkOne.fib(0)
        assertThat(result).isEqualTo(0)
    }

    @Test
    fun `when n is 1 returns 1`() {
        val result = UnitTestHomeworkOne.fib(1)
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `when n is 20 returns 6765`() {
        val result = UnitTestHomeworkOne.fib(20)
        assertThat(result).isEqualTo(6765)
    }

    @Test
    fun `when n is 50 returns 102334155`() {
        val result = UnitTestHomeworkOne.fib(40)
        assertThat(result).isEqualTo(102334155)
    }

    @Test
    fun `less left bracket string returns false`() {
        val result = UnitTestHomeworkOne.checkBraces("(a * b ))")
        assertThat(result).isFalse()
    }

    @Test
    fun `less right bracket string returns false`() {
        val result = UnitTestHomeworkOne.checkBraces("((a * b )")
        assertThat(result).isFalse()
    }

    @Test
    fun `correct number of bracket string returns true`() {
        val result = UnitTestHomeworkOne.checkBraces("(a(b(c * d)e)f)")
        assertThat(result).isTrue()
    }
}