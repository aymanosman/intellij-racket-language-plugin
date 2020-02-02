package com.aymanosman.racket.plugin;

import com.intellij.testFramework.ParsingTestCase;

public class RacketParsingTest extends ParsingTestCase {
    public RacketParsingTest() {
        super("", "rkt", new RacketParserDefinition());
    }

    public void testParsingTestData() {
        System.out.println(System.getProperty("user.dir"));
        doTest(true);
    }

    @Override
    protected String getTestDataPath() {
        return "testData";
    }

    @Override
    protected boolean skipSpaces() {
        return false;
    }

    @Override
    protected boolean includeRanges() {
        return true;
    }
}
