import java.util.ArrayList;

public class SubArray {
    public static void main(String[] args) {
        String word =  "abc";
        
       ArrayList<String> ans =  getSubArray("",word);
    //    System.out.println(Arrays.toString(ans));
    System.out.println(ans.subList(1,ans.size()));
    }

    static ArrayList<String> getSubArray(String p,String up){
        
        if(up.isEmpty()){
          ArrayList<String> list = new ArrayList<>();
        list.add(p);
        System.out.println(p);
        return list;
      }

      char ch = up.charAt(0);
     ArrayList<String> left =  getSubArray(p,up.substring(1));
     ArrayList<String> right =  getSubArray(p+ch,up.substring(1));
      left.addAll(right);
      return left;
    }
}
