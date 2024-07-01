package leetcode;

public class _67_AddBinary {

    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int aPointer = a.length() - 1;
        int bPointer = b.length() - 1;
        boolean currentBit, aBit, bBit, carry = false;
        while (aPointer >= 0 || bPointer >= 0) {
            aBit = aPointer >= 0 && a.charAt(aPointer) == '1';
            bBit = bPointer >= 0 && b.charAt(bPointer) == '1';
            currentBit = aBit ^ bBit ^ carry;
            result.insert(0, currentBit ? '1' : '0');
            carry = aBit && bBit || carry && (aBit || bBit);
            aPointer--;
            bPointer--;
        }
        if (carry) {
            result.insert(0, '1');
        }
        return result.toString();
    }

}
