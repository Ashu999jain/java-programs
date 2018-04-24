import java.net.*;

public class UrlDemo{
public static void main(String [] args) throws Exception
{
URL h = new URL( "https://www.amazon.com/s/ref=nb_sb_noss_1/143-3453483-6542044?url=search-alias%3Daps&field-keywords=shoes" );
System.out.println("host is  :   "+h.getHost() );

System.out.println("port is  :   "+h.getIp() );

System.out.println("file is  :   "+h.getFile() );


System.out.println("protcol is  :   "+h.getProtocol() );

}
}