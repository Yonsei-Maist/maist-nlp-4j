/**
 * Data Structure of Similarity
 * @author Chanwoo Gwon, Yonsei Univ. Researcher, since 2020.05.~
 * @Date 2021.04.01
 */

package kr.ac.yonsei.maist.nlp.datastructure;

import java.util.Arrays;

public class Similarity {
    private double sim;
    private String[] matchList;
    private String[] mismatchSrcList;
    private String[] mismatchCompareList;

    public double getSim() {
        return sim;
    }

    public void setSim(double sim) {
        this.sim = sim;
    }

    public String[] getMatchList() {
        return matchList;
    }

    public void setMatchList(String[] matchList) {
        this.matchList = matchList;
    }

    public String[] getMismatchSrcList() {
        return mismatchSrcList;
    }

    public void setMismatchSrcList(String[] mismatchSrcList) {
        this.mismatchSrcList = mismatchSrcList;
    }

    public String[] getMismatchCompareList() {
        return mismatchCompareList;
    }

    public void setMismatchCompareList(String[] mismatchCompareList) {
        this.mismatchCompareList = mismatchCompareList;
    }

    @Override
    public String toString() {
        return "Similarity{" +
                "sim=" + sim +
                ", matchList=" + Arrays.toString(matchList) +
                ", mismatchSrcList=" + Arrays.toString(mismatchSrcList) +
                ", mismatchCompareList=" + Arrays.toString(mismatchCompareList) +
                '}';
    }
}
