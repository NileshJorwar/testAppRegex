
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
    public static void main(String[] args) {

        String testStr="12233";

        //Find alphabets
        Pattern pattern= Pattern.compile("[a-zA-Z]*");
        Matcher m= pattern.matcher(testStr);
        while(m.find())
        {
            System.out.println(m.group());
        }

        //ExtractMaxFromString
        String testStr2="1aba12sj11sjdj56k23";
        Pattern pattern2= Pattern.compile("[0-9]+");
        Matcher m2= pattern2.matcher(testStr2);
        List<Integer> list= new ArrayList<>();
        while(m2.find())
        {
            int n=0;
            n=Integer.parseInt(m2.group());
            System.out.println(n);
            list.add(n);
        }

        int max=0;
        if(list.isEmpty())
            System.out.println("No Max");
        else
        {
            for(int i:list)
            {
                if(max<i)
                    max=i;
            }
        }
        System.out.println("Max--"+max);
    }


}
