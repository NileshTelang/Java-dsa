public class RevWords {
    
    public static void main(String[] args) {
        String s = "Computer Is Fun";
        String rev="" ;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)== ' '){
                rev = rev +  s.substring(i, s.length());   
            }else if(i==0){
                rev = rev +  s.substring(i,s.length());
            }
        }
        System.out.println(rev);
    }
}
