package kr.ac.yonsei.maist.nlp.matcher;

import kr.ac.yonsei.maist.nlp.datastructure.Similarity;

public class StringMatcherTester {
    public static void main(String[] args) {
        StringMatcher matcher = new StringMatcher();
        String src = "음성 인식을 비교하기 위한 실제 문자열";
        String compare = "음성 인식은 비고하기 의한 실제 문자얼";

        Similarity sim = matcher.compare(src, compare);

        System.out.println(sim.toString());
    }
}
