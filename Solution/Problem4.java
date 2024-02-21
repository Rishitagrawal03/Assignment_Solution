public class Problem4{
    public static void main(String args[])
    {
        String str = "UpPerLoWeRCaSe";
        int upper = 0, lower = 0;
 
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if (ch >= 'a' && ch <= 'z')
                lower++;
            else{

            }
        }
        if(upper==lower){
            System.out.println("equal number of uppercase and lowercase letters.");
        }
        else{
            System.out.println("number of uppercase and lowercase letters are not equal");
        }
    }

}
