public class SkipChar {
    public static void main(String[] args) {
        String up = "cfdgbc";
        System.out.println(up.substring(1));
        // skip("","cbfbg");
       String ans =  skip("cbfbg");
       String ans1 =  skipApple("bcaappledg");
       System.out.println(ans1);
    }

    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'b'){
            skip(p, up.substring(1));
        }else{
            skip(p+ch, up.substring(1));
        }
    }


    static String skip( String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(ch == 'b'){
           return skip(up.substring(1));
        }else{
           return ch + skip(up.substring(1));
        }
    }

    static String skipApple( String up){
        if(up.isEmpty()){
            return "";
        }


        if((up.startsWith("apple"))){
           return skipApple(up.substring(3));
        }else{
           return up.charAt(0) +  skipApple(up.substring(1));
        }
    }

}
