package com.abnamro.apps.referenceandroid

import org.junit.Test

import org.junit.Assert.*

/**
 * Added more tests to see how JUnitAsserter is working
 */

class SomeMoreUnitTests {
    /**
     * Extension on example unit test
     */
    @Test
    fun addition_isCorrect() {
        assertEquals(8, 2 + 2 + 4 )
    }

    /**
     * Trying another function
     */
    @Test
    fun addition_isNotCorrect() {
        assertNotEquals(100500, 123 + 333)
    }

    /**
     * Making a test fail
     */
    @Test
    fun addition_isNull() {
        assertNull(null+null)
    }

    /**
     * Fixing above test as Kotlin sees "null" as a string and null+null results in nullnull
     */
    @Test
    fun addition_isNotNull() {
        assertNotNull(null+null)
    }
}
