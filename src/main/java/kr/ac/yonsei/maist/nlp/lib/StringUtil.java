package kr.ac.yonsei.maist.nlp.lib;

public class StringUtil {
    public static boolean isWhiteSpace(char... src) {
        if (src == null)
            return false;

        String stringSrc = new String(src);
        return stringSrc.trim().equals("");
    }

    public static boolean isNullOrWhiteSpace(char... src) {
        if (src == null)
            return true;

        String stringSrc = new String(src);
        return stringSrc.trim().equals("");
    }
}
