package chapters.chapter_10.Exercise;

public class MyString1 {
    private char[] chars;

    public MyString1(char[] chars){
        this.chars=chars;
    }
    public char charAt(int index){
        return (char) chars[index];
    }
    public int length(){
        return chars.length;
    }
    public MyString1 substring(int begin , int end){
        if(!(begin > 0) && (begin < length() - 1) && (end > 0 && end <length()-1)){
            System.out.println("invalid input ! ");
            System.exit(-1);

        }
        char[] newArray = new char[end - begin];
        int oldIndex = begin;
        for(int newIndex = 0 ; newIndex < newArray.length;newIndex++){
            newArray[newIndex] =charAt(oldIndex);
            oldIndex++;
        }
        return new MyString1(newArray);
    }
    public MyString1 toLowerCase(){
        char[] ch = new char[length()];
        for (int i = 0; i < length(); i++) {
            if(chars[i] <= 'Z' && chars[i] >= 'A'){
                ch[i] = (char)(charAt(i) + ('a' - 'A'));
            }else{
                ch[i] = charAt(i);
            }
        }
        return new  MyString1(ch);
    }
    public boolean equals(MyString1 str){
        if(length() != str.length()){
            return  false;
        }
        for(int i=0;i<str.length();i++){
            if(charAt(i)!=str.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static MyString1 valueOf(int i ){
        int counter = 0;
        int number = i ;//1250
        while(number > 0 ){
            number /= 10; //125,12,2,0
            counter++; //1,2,,3,4
        }
        char[] ch = new char[counter];
        for (int j = counter - 1 ; j >= 0 ; j--) {//1250
            ch[j] = (char)('0' + i % 10);//0,5,2,1
            i /= 10;//125,12,1,0

        }
        return new MyString1(ch);
    }

}

