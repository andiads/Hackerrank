class MyRegex{
 
   String pattern0255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";

    public String pattern = pattern0255 + "\\." + pattern0255 + "\\." + pattern0255 + "\\." + pattern0255;
   /*
   StringBuilder IP_PATTERN = new StringBuilder(pattern0255);

   IP_PATTERN.append("\\."+pattern0255+"\\."+pattern0255+"\\."+pattern0255);
   pattern = IP_PATTERN.toString();
*/
   
    public static void main(String[]args){
        



        //public static Pattern regPattern = Pattern.compile(pattern);

        System.out.println("000.12.12.034".matches(new MyRegex().pattern));
        System.out.println("121.234.12.12".matches(new MyRegex().pattern));
        System.out.println("23.45.12.56".matches(new MyRegex().pattern));
        System.out.println("00.12.123.123123.123".matches(new MyRegex().pattern));
        System.out.println("123.23".matches(new MyRegex().pattern));
        System.out.println("Hello.IP".matches(new MyRegex().pattern));
    }
}





