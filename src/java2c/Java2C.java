package java2c;
import java_cup.runtime.*;
import javaBNF.*;
import javaBNF.Absyn.*;
import java.io.*;
import java2c.Trans;

public class Java2C
{
	public static void main(String args[]) throws Exception
	{
		Yylex l = null;
		parser p;
		try {
			if (args.length == 0) {
				l = new Yylex(new InputStreamReader(System.in));
			}
			else l = new Yylex(new FileReader(args[0]));
		}
		catch(FileNotFoundException e) {
			System.err.println("Error: File not found: " + args[0]);
			System.exit(1);
		}
		p = new parser(l);
		try {
			javaBNF.Absyn.Stm parse_tree = p.pStm();
			System.out.println();
			System.out.println("Parse Succesful!");
			System.out.println();
			System.out.println("[Abstract Syntax]");
			System.out.println();
			System.out.println(PrettyPrinter.show(parse_tree));
			System.out.println();
			System.out.println("[Linearized Tree]");
			System.out.println();
			System.out.println(PrettyPrinter.print(parse_tree));
			C.Absyn.Stm s = parse_tree.accept(new java2c.Trans.StmVisitor(), null);
			System.out.println();
			System.out.println("Transformation Successful!");
			System.out.println();
			System.out.println("[Abstract Syntax]");
			System.out.println();
			System.out.println(C.PrettyPrinter.show(s));
			System.out.println("[Linearized Tree]");
			System.out.println();
			System.out.println(C.PrettyPrinter.print(s));
		}
		catch(Throwable e) {
			System.err.println("At line " + String.valueOf(l.line_num()) + ", near \"" + l.buff() + "\" :");
			System.err.println("     " + e.getMessage());
			System.exit(1);
		}
	}
}
