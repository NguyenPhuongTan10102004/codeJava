import java.util.*;
class btfile
{
	public static void main(String args [])
	{
		//khai bao bien
		int n = 0;
		String str1 = new String("Day la chuoi thu nhat ");
		String str2 = new String("Day la chuoi thu hai ");
		String str3 = "Day la chuoi thu 3 ";
		String str4 = new String(str3);
		String str5 = str1;
		int doDaiStr = 0;
		doDaiStr = str4.length();
		doDaiStr = str3.length();
		int dk = 0;
		//input
		Scanner input = new Scanner(System.in);
		
		do
		{
			System.out.print("Nhap so luong phan tu : " );
			n = input.nextInt();
		}while(n <= 0);
		
		int mang [] = new int [n];
		
		//Nhap mang
		System.out.println();
		for (int i = 0 ; i< mang.length ; i++)
		{
			System.out.print("Nhap phan tu thu " + i + " : ");
			mang [i] = input.nextInt();
		}
		
		//Xuat mang
		System.out.println("Mang cua ban gom : ");
		for (int i = 0 ; i< mang.length ; i++)
		{
			System.out.print(mang[i] + " ");
		}
		System.out.println();
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(); 
		 for(int i = 0; i < str1.length(); i++) 
		 {
			 System.out.print(str1.charAt(i) + " "); 
		 }
		 
		 //
		 System.out.println(); 
		 if(str1.equals(str2)) 
		 System.out.println("str1 == str2"); 
		 else 
		 System.out.println("str1 != str2"); 
		 
		 //Cu phap compareTo
		 // chuoi1.compareTo(chuoi2)
		 dk = str1.compareTo(str2);
		 if (dk == 0)
		 {
			 System.out.println("Hai chuoi bang nhau");
		 }
		 else
		 {
			 if (dk < 0)
			 {
				 System.out.println("Chuoi 1 dai hon chuoi hai ");
			 }
			 else
			 {
				 System.out.println("Chuoi 1 dai hon chuoi 2");
			 }
		 }
		 
		 //indexOf tim ra vi tri xuat hien dau tien
		 //lastIndexOf tim ra vi tri xuat hien sau cung , luu y la chu Index viet hoa
		 String str = "hello hello hello hello hello ";
		 
		 int index1 = -1;
		 int index2 = -1;
		 index1 = str1.indexOf("Day");
		 index2 = str.lastIndexOf("hello");
		 System.out.println("index1 : " + index1);
		 System.out.println("index1 : " + index2);
		 
		// Lay chuoi con dung ham 
		// public String substring(int beginIndex, int 
		// endIndex) 
		 //String substr = orgstr.substring(4, 7); 
		
	}
}