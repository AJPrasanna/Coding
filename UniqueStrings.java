import java.util.ArrayList;
import java.util.Scanner;

public class UniqueStrings {
	static ArrayList<String> alpha = new ArrayList<>();
	static ArrayList<Integer> numbers = new ArrayList<>();
	static ArrayList<String> finallist = new ArrayList<>();
	public static String check(int index,char ch)
	{
		int pos = index + 1;
		String temp = "";
		int numberpos = 0;
		int frame =0;
		if(Character.isAlphabetic(ch))
		{
		if(Character.isUpperCase(ch))
		{
			if(pos==26)
			{
				temp="A";
			}
			else if(pos<26)
			{
				temp = alpha.get(pos).toUpperCase();
			}
			else
			{
				return(check(-1,'Z'));
			}
		}
		else
		{
			if(pos==26)
			{
				temp="a";
			}
			else if(pos<26)
			{
				temp = alpha.get(pos);
			}
			else
			{
				return(check(-1,'z'));
			}
		}
		if(!finallist.contains(temp))
		{
			return(temp);
		}
		return(check(pos,temp.charAt(0)));
		}
		else
		{
			if(pos!=10)
			{
				if(finallist.contains(pos+""))
				{
					frame = pos;
					char passing = (frame+"").charAt(0);
					return(check(pos,passing));
				}
				else
				{
					return(pos+"");
				}
			}
			else
			{
				if(finallist.contains("0"))
				{
					pos=pos;
				}
				else
				{
					return("0");
				}
			}
			
		}
		return null;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String input = s.next();
		alpha.add("a");
		alpha.add("b");
		alpha.add("c");
		alpha.add("d");
		alpha.add("e");
		alpha.add("f");
		alpha.add("g");
		alpha.add("h");
		alpha.add("i");
		alpha.add("j");
		alpha.add("k");
		alpha.add("l");
		alpha.add("m");
		alpha.add("n");
		alpha.add("o");
		alpha.add("p");
		alpha.add("q");
		alpha.add("r");
		alpha.add("s");
		alpha.add("t");
		alpha.add("u");
		alpha.add("v");
		alpha.add("w");
		alpha.add("x");
		alpha.add("y");
		alpha.add("z");
		ArrayList<String> out = new ArrayList<>();
		//java1246
		//BusRoute112 - BusRovte123
		//axbuzZ9900
		int index=0;
		for(int i=0;i<input.length();i++)
		{
			if(Character.isAlphabetic(input.charAt(i)))
			{
				if(!out.contains((input.charAt(i)+"").toLowerCase()))
				{
					if(!finallist.contains(input.charAt(i)+""))
					{
						out.add((input.charAt(i)+"").toLowerCase());
						finallist.add(input.charAt(i)+"");
					}
					else
					{
						index = alpha.indexOf(input.charAt(i)+"");
						char ch = input.charAt(i);
						String temp = check(index, ch);
						finallist.add(temp);
					}
				}
				else
				{
					index = alpha.indexOf((input.charAt(i)+"").toLowerCase());
					char ch = input.charAt(i);
					String temp = check(index, ch);
					finallist.add(temp);
					
				}
			}
			else if(Character.isDigit(input.charAt(i)))
			{
				if(!finallist.contains(input.charAt(i)+""))
					{
						finallist.add(input.charAt(i)+"");
					}
					else
					{
						index = Integer.parseInt(input.charAt(i)+"");
						char ch = input.charAt(i);
						String temp = check(index, ch);
						finallist.add(temp);
					}
			}
			else
			{
				
			}
		}
		for(String x : finallist)
		{
			System.out.print(x);
		}
		

	}

}
