package kr.ac.yonsei.maist.nlp.matcher;

import kr.ac.yonsei.maist.nlp.datastructure.Similarity;

public class StringMatcherTester {
    public static void main(String[] args) {
        StringMatcher matcher = new StringMatcher();
        String src = "누가야 온도 예열해줘";
        String compare = "누가야 몸도 예얼애주";

        Similarity sim = matcher.compare(src, compare);

        System.out.println(sim.toString());
    }
}
