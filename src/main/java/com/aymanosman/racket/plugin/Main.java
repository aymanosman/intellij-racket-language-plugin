package com.aymanosman.racket.plugin;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Reader in = new StringReader("#lang racket\n(define foo 42)\n");

        RacketLexer2 lex = new RacketLexer2(in);
        System.out.println("hello");
        System.out.println(lex);
        System.out.println(lex.advance());
        System.out.println(lex.advance());
        System.out.println(lex.advance());

    }
}
