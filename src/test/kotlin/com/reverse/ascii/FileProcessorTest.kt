package com.reverse.ascii

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FileProcessorTest {

    class FileProcessorTest {
        @Test
        fun testReverseFileContents() {
            // Given
            val originalContent = "ABC"
            val reversedContent = "CBA"

            // When
            val reversedResult = StringBuilder(originalContent).reverse()

            // Then
            assertEquals(reversedContent, reversedResult.toString())
        }
    }

}