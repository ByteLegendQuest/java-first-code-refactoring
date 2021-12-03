package com.bytelegend;

import com.github.blindpirate.extensions.CaptureSystemOutput;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class ChallengeTest {
    @Test
    @CaptureSystemOutput
    public void test(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(Matchers.containsStringIgnoringCase("Start!"));
        capture.expect(Matchers.containsStringIgnoringCase("Number is: 123"));
        capture.expect(Matchers.containsStringIgnoringCase("Number+1 is: 124"));
        capture.expect(Matchers.containsStringIgnoringCase("Number*10 is: 1230"));
        capture.expect(Matchers.containsStringIgnoringCase("Number*100 is: 12300"));
        Challenge.print(123);
    }
}
