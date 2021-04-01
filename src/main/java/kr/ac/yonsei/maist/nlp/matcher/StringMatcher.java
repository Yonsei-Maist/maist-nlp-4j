/**
 * Compare two String and return similarity about spell and sequence
 * @author Chanwoo Gwon, Yonsei Univ. Researcher, since 2020.05.~
 * @Date 2021.04.01
 */

package kr.ac.yonsei.maist.nlp.matcher;

import kr.ac.yonsei.maist.nlp.datastructure.Similarity;
import kr.ac.yonsei.maist.nlp.lib.StringUtil;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.ArrayList;

/**
 * StringMatcher class
 * 1. compare two strings
 * 2. return similarity about spell and sequence
 */
public class StringMatcher {
    /**
     * compare two string
     *
     * @param src src String
     * @param compare String to compare
     * @return Similarity object
     */
    public Similarity compare(String src, String compare) {
        Similarity result = new Similarity();
        char[] charArraySrc = src.replaceAll("\\s+", "").toCharArray();
        char[] charArrayCompare = compare.replaceAll("\\s+", "").toCharArray();

        int matchCount = 0;
        int cursorCompare = 0;

        ArrayList<String> listMatch = new ArrayList<String>();
        ArrayList<String> listMismatchSrc = new ArrayList<String>();
        ArrayList<String> listMismatchCompare = new ArrayList<String>();

        for (int cursorSrc = 0;cursorSrc < charArraySrc.length;cursorSrc++){
            if (cursorCompare >= charArrayCompare.length)
                break;

            char srcOne = charArraySrc[cursorSrc];
            char compareOne = charArrayCompare[cursorCompare];
            boolean match = srcOne == compareOne;
            if (!match) {
                // check more
                for (int i = cursorCompare;i<Math.min(charArrayCompare.length, cursorCompare + 3);i++) {
                    char compareOneTemp = charArrayCompare[i];

                    if (srcOne == compareOneTemp) {
                        char[] sub = Arrays.copyOfRange(charArrayCompare, cursorCompare, i);
                        for (char temp : sub) {
                            listMismatchCompare.add(temp + "");
                        }

                        cursorCompare = i;
                        match = true;
                    }
                }
            }

            if (match) {
                listMatch.add(srcOne + "");
                matchCount++;
                cursorCompare++;
            } else {
                listMismatchSrc.add(srcOne + "");
            }
        }

        if (cursorCompare < charArrayCompare.length - 1) {
            char[] sub = Arrays.copyOfRange(charArrayCompare, cursorCompare, charArrayCompare.length);

            for (char temp : sub) {
                listMismatchCompare.add(temp + "");
            }
        }

        result.setSim((matchCount * 2 ) / (double) (charArraySrc.length + charArrayCompare.length));
        result.setMatchList(listMatch.toArray(new String[0]));
        result.setMismatchSrcList(listMismatchSrc.toArray(new String[0]));
        result.setMismatchCompareList(listMismatchCompare.toArray(new String[0]));

        return result;
    }
}
