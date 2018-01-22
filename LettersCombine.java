package aya;
public class LettersCombine
{
	public static void main(String[] args)
	{
		for(int i=1;i<5;i++)
		{
			char[] sequence=new char[i];
			combineLetters(sequence,0);
		}
	}
	public static void combineLetters(char[] sequence,int pos)
	{
		for(sequence[pos]='A';sequence[pos]<='z';sequence[pos]++)
		{
			if(!(sequence[pos]>='A'&&sequence[pos]<='Z'||sequence[pos]>='a'&&sequence[pos]<='z'))
				continue;
			if(pos<sequence.length-1)
				combineLetters(sequence,pos+1);
			else
				printSequence(sequence);
		}
	}
	public static void printSequence(char[] sequence)
	{
		for(int i=0;i<sequence.length;i++)
			System.out.print(sequence[i]);
		System.out.println();
	}
}