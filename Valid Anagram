class Solution {
    public boolean isAnagram(String s, String t) {
            StringBuilder sb = new StringBuilder(s);
            StringBuilder tb = new StringBuilder(t);
            if (sb.length() == tb.length()) {
                for (int i = 0; i < sb.length(); i++) {
                    for (int j = 0; j < tb.length(); j++) {
                        if (sb.charAt(i) == tb.charAt(j) && tb.length() > 0) {
                            tb.deleteCharAt(j);
                            break;
                        }
                    }
                }
            }
            if (tb.length() == 0) {
                return true;
            } else {
                return false;
            }
    }
}
