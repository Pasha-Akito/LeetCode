package pascal.learning.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ZigzagConversionTest {

    private final ZigzagConversion zigzagConversion = new ZigzagConversion();
    private record TestCase(String name, String input1, int input2, String expected) {}

    static Stream<TestCase> testCases() {
        return Stream.of(
                new TestCase("Test Case One", "PAYPALISHIRING", 3, "PAHNAPLSIIGYIR"),
                new TestCase("Test Case Two", "PAYPALISHIRING", 4, "PINALSIGYAHRPI"),
                new TestCase("Test Case Three", "A", 1, "A")
        );
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("testCases")
    void testZigzagConvert(TestCase testCase) {
        String result = zigzagConversion.convert(testCase.input1, testCase.input2);
        assertEquals(testCase.expected, result);
    }

}