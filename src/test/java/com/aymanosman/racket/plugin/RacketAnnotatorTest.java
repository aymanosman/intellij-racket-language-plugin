package com.aymanosman.racket.plugin;

import com.intellij.testFramework.fixtures.BasePlatformTestCase;

public class RacketAnnotatorTest extends BasePlatformTestCase {
  @Override
  protected void setUp() throws Exception {
      super.setUp();
  }

  @Override
    protected String getTestDataPath() { return "testData"; }

    public void testAnnotation() {
      myFixture.configureByFiles("AnnotatorTestData.rkt");

      myFixture.checkHighlighting(false, true, true, false);
    }
}
