package chapters.chapter_10.Exercise;

public class MyString2 {
    private char[] chars;

    public MyString2(String s) {
        this.chars = s.toCharArray();
    }
    private char charAt(int index) {
        return (char) chars[index];
    }
    public int length() {
        return chars.length;
    }
    public int compare(String s) {
        int charactherNumber = s.length();
        char[] chArray = s.toCharArray();

        int i = 0;
        while (i < charactherNumber) {
            char ch1 = charAt(i);
            char ch2 = chArray[i];
            if (ch1 != ch2) {
                return ch1 - ch2;
            }
            i++;
        }

        return length() - s.length();

    }

    public MyString2 substring(int begin) {
        String s = "";
        for (int i = begin; i < chars.length; i++) {
            s += chars[i];
        }
        return new MyString2(s);
    }

    public MyString2 toUpperCase() {
        String upper = "";
        for (int i = 0; i < length(); i++) {
            if (charAt(i) >= 'a' && charAt(i) <= 'z')
                upper +=(char)(charAt(i) - 32);
            else
                upper += charAt(i);
        }
        return new MyString2(upper);
    }
    // TODO BURAYI ANLAMADIM!!!

    public static MyString2 valueOf(boolean b) {
        return b ? new MyString2("true") : new MyString2("false");
    }
    public char[] toChars() {
        return chars;

    }

}

