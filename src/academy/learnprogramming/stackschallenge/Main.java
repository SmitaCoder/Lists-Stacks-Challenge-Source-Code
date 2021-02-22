package academy.learnprogramming.stackschallenge;

public class Main {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
        int len = string.length();
        boolean flag = false;
        String strWithoutSpace= string.replace(" ","");
        strWithoutSpace = strWithoutSpace.replaceAll("[^a-zA-Z]", "");
        //System.out.println(strWithoutSpace);
        char[] strArray = strWithoutSpace.toCharArray();
        //System.out.println(strArray[2]);
        StackImpl stack = null;
        for(int i =0;i<strArray.length;i++){
            stack = new StackImpl(strArray.length);
            //if(Character.isLetter(strArray[i])) {
                stack.push(strArray[i]);
            //}
        }
        for(int i =stack.getSize()-1;i >= 0;i--){
            char test = stack.pop();

            if(Character.toString(test).equalsIgnoreCase(Character.toString(strArray[i]))){
                flag = true;
            }
        }
        return flag;
    }
}
