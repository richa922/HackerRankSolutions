
class GfG
{
    public static void printSpace(String str)
    {
        int len=str.length();
        char[] buff=new char[2*len];
        buff[0]=str.charAt(0);
        validString(str,buff,1,1,len);
    }
    public static void validString(String str,char[] buff,int i,int j,int len)
    {
        if(i==len)
        {
            buff[j]='\0';
            System.out.print(buff);
            System.out.print("$");
            return;
        }
        
        buff[j]=str.charAt(i);
        validString(str,buff,i+1,j+1,len);
        
        buff[j]=' ';
        buff[j+1]=str.charAt(i);
        validString(str,buff,i+1,j+2,len);
    }
}