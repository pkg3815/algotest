package algoTest;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution7 {

	/*
	 * Complete the timeConversion function below.
	 */
	static String timeConversion(String s) {
		/*
		 * Write your code here.
		 */

		String result = "";
		String[] strs = s.split(":");
		int hour = 0;
		if (s.contains("PM") ) {
			if(strs[0].equals("12"))
			{
				hour=12;
				strs[0] = "12";
			}else
			{
				hour = (Integer.parseInt(strs[0]) + 12);
				strs[0] =Integer.toString(hour); 		
			}
			
		} else{
			if(strs[0].equals("12"))
			{
				hour=00;
				strs[0] ="00";
			}	
			
		}
		

		for (int i = 0; i < strs.length; i++) {
				if (strs.length - 1 == i)
					result += strs[i];
				else
					result += strs[i] + ":";
		}
		System.out.println(result.substring(0,8));
		result=result.substring(0,8);
		return result;
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(
				new FileWriter("./solution7.txt"));

		String s = scan.nextLine();

		String result = timeConversion(s);

		bw.write(result);
		bw.newLine();

		bw.close();
	}
}
