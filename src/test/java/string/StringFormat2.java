package string;

public class StringFormat2 {
	public static void main(String[] args) {
		
		String ty 	=	"2";
		String ch	= 	"1";
		String s	=	"P01";
		String ad	=	"xxxx";
		String c	=	"169";
		String sa	=	"19627";
		String dt	=	"25112013";
		
		String format = String.format("http://click.publicidade.uol.com.br/click?ty=%s&ch=%s&s=%s&ad=%s&c=%s&sa=%s&dt=%s&redir=http://www.uol.com.br", 
					  ty, ch, s, ad, c, sa, dt);
	
		System.out.println(format);
		
	}
		
}
