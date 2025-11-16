package pascal.learning.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestPalindromicSubstringTest {
    private final LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
    private record TestCase(String name, String input, String expected) {}

    static Stream<TestCase> testCases() {
        return Stream.of(
                new TestCase("Test Case One", "babad", "bab"),
                new TestCase("Test Case Two", "cbbd", "bb")
        );
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("testCases")
    void testLongestPalindrome(TestCase testCase) {
        String result = longestPalindromicSubstring.longestPalindrome(testCase.input);
        assertEquals(result, testCase.expected);
    }
}