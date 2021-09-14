package com.example.facebookcodingchallenge

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `username and password are verified`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Michael",
            "1234",
            "1234"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "1234",
            "1234"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Patrick",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `username is already taken returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Carl",
            "1234",
            "1234"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `confirm password does not match real password`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Sara",
            "corgiBuns23",
            "iLoveCorgiBuns23"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password contains at least 2 digits`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Samantha",
            "11223344",
            "11223344"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `password does not contain at least 2 digits`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Samantha",
            "curiousGeorge2",
            "curiousGeorge2"
        )
        assertThat(result).isFalse()
    }
}