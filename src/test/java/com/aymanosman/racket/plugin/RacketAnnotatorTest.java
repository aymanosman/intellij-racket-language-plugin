package com.aymanosman.racket.plugin;

import com.intellij.testFramework.fixtures.LightJavaCodeInsightFixtureTestCase;

public class RacketAnnotatorTest extends LightJavaCodeInsightFixtureTestCase {
    @Override
    protected String getTestDataPath() {
        return "src/test/testData";
    }

    public void testAnnotation() {
        myFixture.configureByFiles("annotator-test-data.rkt");

//        myFixture.checkHighlighting(true, true, true, false);
        myFixture.checkHighlighting(false, false, true, true);    }
}
