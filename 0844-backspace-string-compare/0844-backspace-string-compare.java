class Solution {

    public boolean backspaceCompare(String s, String t) {

        int i = s.length() - 1;
        int j = t.length() - 1;

        while (i >= 0 || j >= 0) {

            i = nextValid(s, i);
            j = nextValid(t, j);

            char ch1;
            char ch2;

            if (i >= 0) {
                ch1 = s.charAt(i);
            } else {
                ch1 = '$';
            }

            if (j >= 0) {
                ch2 = t.charAt(j);
            } else {
                ch2 = '$';
            }

            if (ch1 != ch2) {
                return false;
            }

            i--;
            j--;
        }

        return true;
    }

    public int nextValid(String s, int i) {

        int skip = 0;

        while (i >= 0) {

            if (s.charAt(i) == '#') {
                skip++;
                i--;
            } else if (skip > 0) {
                skip--;
                i--;
            } else {
                break;
            }
        }

        return i;
    }
}