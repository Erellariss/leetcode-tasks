package leetcode;

public class BackspaceCompare {

    public boolean backspaceCompare(String a, String b) {
        int aPointer, bPointer, aSkip, bSkip;
        aPointer = a.length() - 1;
        bPointer = b.length() - 1;
        aSkip = bSkip = 0;

        while (aPointer >= 0 || bPointer >= 0) {
            if (aPointer >= 0) {
                if (a.charAt(aPointer) == '#') {
                    aSkip++;
                    aPointer--;
                    continue;
                } else if (aSkip > 0) {
                    aPointer--;
                    aSkip--;
                    continue;
                }
            }
            if (bPointer >= 0) {
                if (b.charAt(bPointer) == '#') {
                    bPointer--;
                    bSkip++;
                    continue;
                } else if (bSkip > 0) {
                    bPointer--;
                    bSkip--;
                    continue;
                }
            }
            if (aPointer < 0 ^ bPointer < 0
                    || a.charAt(aPointer) != b.charAt(bPointer)) {
                return false;
            }
            aPointer--;
            bPointer--;
        }
        return aPointer == bPointer;
    }
}
