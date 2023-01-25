import java.util.Scanner;
public class B1C5_1 {
	public static void main(String [] args)
	{
		//khai bao bien
		int n = 0;
		int tongSoLe = 0;
		long tichBoiSo3 = 1;
		long tongCacSoDaoNguoc = 0;
		long tichChan = 0;
		
		//input
		n = NhapN();// nhap n nguyen duong
		//Prosessing
		tongSoLe = TinhTongCacSoLeTu1DenN(n);// ham tinh tong so le
		tichBoiSo3 = TinhTichCacBoiSoCua3BeHonHoacBangN(n); // ham tinh tich cac boi so cua 3 be hon hoac bang n
		tongCacSoDaoNguoc = TinhTongCacSoDaoNguocTu1DenN(n); // ham bai 3
		tichChan = TinhTichCacSoChanBeHonHoacBang2n(n);
		//OUTPUT
		//output bai 1
		System.out.println("Bai 1 : Tong cac so le tu 1 den N la : " + tongSoLe);
		
		//output bai 2
		if (tichBoiSo3 != 1)
		{
			System.out.println("Bai 2 : Vay tich cac boi so cua 3 be hon hoac bang " + n + " la : " + tichBoiSo3 );
		}
		else
		{
			System.out.println("Bai 2 : Khong co so la boi so cua 3");
		}
		
		//output bai 3
		System.out.println("Bai 3 : Vay tong cac so dao nguoc tu 1 den n la : " + tongCacSoDaoNguoc);
		
		//output bai 4
		System.out.println("Bai 4 : Vay tich cac so le be hon hoac bang 2n la : " + tichChan);
		
		//output bai 5
		
		//output bai 6
		InCacUocSoCuaN(n);
	}
	// 1. Ham nhap N nguyen duong
	public static int NhapN()
	{
		int n = 0;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("Nhap N : ");
			n = sc.nextInt();
			
		}while(n<=0);
		return n;
	}
	// 2 .Ham Tinh tong cac so le tu mot den N
	public static int TinhTongCacSoLeTu1DenN(int n)
	{
		int tong = 0;
		for (int i = 1 ; i <= n ; i ++)
		{
			if (i % 2 != 0)
			{
				tong = tong + i;
			}
		}
		return tong;
	}
	// 3 . Ham tinh tich cac boi so cua 3 be hon hoac bang N
	public static long TinhTichCacBoiSoCua3BeHonHoacBangN(int n)
	{
		// vi du 3 la uoc cua 6, 6 la boi cua 3
		long tich = 1;
		
		for (int i = 1; i <= n ; i++)
		{
			if (i % 3 == 0)
			{
				tich = tich * i;
			}
		}
		return tich;
	}
	// 4. Ham tinh tong nghich dao cac so be hon hoac bang N
	// 4.1 Ham tim so nghich dao
	public static int TimSoNghichDao(int num)
	{
		int numDaoNguoc = 0;
		//int x = 0;
		while (num >= 1)
		{
			//x = num %10;
			numDaoNguoc = numDaoNguoc*10 + num%10;
			num = num / 10;
		}
		return numDaoNguoc;
	}
	//4.2 Ham tinh tong cac so dao nguoc be hon bang n
	public static long TinhTongCacSoDaoNguocTu1DenN(int n)
	{
		long tong = 0;
		for (int i = 1 ; i <= n ; i ++)
		{
			tong = tong + TimSoNghichDao(i);
		}
		return tong;
	}
	//5. Tinh tich cac so chan be hon hoac bang 2n
	public static long TinhTichCacSoChanBeHonHoacBang2n(int n)
	{
		long tich = 1;
		
		for (int i = 2; i <= 2n ; i = i + 2)
		{
			if (i % 2 == 0)
			{
				tich = tich * i;
			}
		}
		return tich;
	}
	// 6. Ham tinh n giai thua
	public static long TinhGiaiThua(int n)
	{
		long tich = 1;
		for (int i = 1; i <=n ; i++)
		{
			tich = tich * i;
		}
		return tich;
	}
	// 7 . In ra cac uoc so cua n
	public static void InCacUocSoCuaN(int n)
	{
		System.out.print("Cac uoc la : ");
		for (int i = 1; i <=n ; i++ )
		{
			if ( n % i == 0)
			{
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

}
