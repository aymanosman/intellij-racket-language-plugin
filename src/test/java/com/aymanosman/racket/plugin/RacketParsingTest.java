package com.aymanosman.racket.plugin;

import com.intellij.testFramework.ParsingTestCase;

public class RacketParsingTest extends ParsingTestCase {
    public RacketParsingTest() {
        super("", "rkt", new RacketParserDefinition());
    }

    public void testParsingTestData() { doTest(true); }
    public void testParsingTestData2() {
        doTest(true);
    }
    public void testParsingIdentifiers() { doTest(true); }
    public void testParsingSymbols() {
        doTest(true);
    }
    public void testParsingStrings() { doTest(true); }
    public void testParsingCharacters() { doTest(true); }
    public void testParsingNumbers() { doTest(true); }

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
