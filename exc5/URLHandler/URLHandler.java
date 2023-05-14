import java.util.regex.*;

public class URLHandler {
    public static void main(String[] args) {
        // checkInNum
        System.out.println(checkInTld("m.ir"));
        System.out.println(checkInProtocol("https://m.com"));
        System.out.println(checkInSld("https://Adsdsfsdffs2.com"));
        try {
        System.out.println(checkURL("https://gosogle.com"));
        //checkArray(4,"1,2,3,4,,,");
        //checkArray(4,"1,2,3,4");
        }
        catch (TopLevelDomainException a) {
            System.out.println("inv TLD");
        }
        catch (ProtocolException b) {
            System.out.println("inv protocol");
        }
        catch (SecondLevelDomainException c) {
            System.out.println("inv sld");
        }
        

    }
    public static boolean checkInTld (String s) {
        Pattern p = Pattern.compile(".*\\.\\b(?:com|ir|org)\\b$");
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        return !b;
    }

    public static boolean checkInProtocol (String s) {
        Pattern p = Pattern.compile("^http[s]{0,1}://.*");
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        return !b;
    }

    public static char checkInSld (String s) {
        int colonIndex = s.indexOf(':', 0);
        int tldIndex=0;
        int sldIndex=colonIndex+3;
        boolean flag=false;
        for (int i=0 ; i < s.length() ; i++)
            if (s.charAt(i) == '.' )
            {
                if (flag)
                    sldIndex=tldIndex;
                tldIndex=i;
                //flag=true;
            }
        for (int i = sldIndex ; i < tldIndex ; i++)
            //if (! ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) == '.')) )
            if (! ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) )
                return s.charAt(i);
        
        return 'A';
    }

    public static String checkURL(String URL) throws ProtocolException, SecondLevelDomainException, TopLevelDomainException {
        if (checkInTld(URL))
            throw new TopLevelDomainException("");
        if (checkInProtocol(URL))
            throw new ProtocolException("");
        if (checkInSld( URL) != 'A')
            throw new SecondLevelDomainException(checkInSld(URL)+" is an invalid character in this URL!");
        
        return "this web address is completely VALID!";
    }
}

