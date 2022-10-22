package com.src.practice;

public class UserdefinedArray {
	 int sno;
	 String sname;
	 
	public UserdefinedArray(int sno, String sname) {
		super();
		this.sno = sno;
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "UserdefinedArray [sno=" + sno + ", sname=" + sname + "]";
	}

	public static void main(String[] args) {
		UserdefinedArray obj1 = new UserdefinedArray(111,"ABC");
		UserdefinedArray obj2 = new UserdefinedArray(222,"PQR");
		UserdefinedArray obj3 = new UserdefinedArray(333,"XYZ");
		UserdefinedArray obj4 = new UserdefinedArray(444,"KLM");
		UserdefinedArray obj5 = new UserdefinedArray(555,"AWS");
		/*	System.out.println(obj1);
			System.out.println(obj2);
			System.out.println(obj3);
			System.out.println(obj4);
			System.out.println(obj5);*/
			UserdefinedArray st[] =new UserdefinedArray[5];
			st[0]= obj1;
			st[1]=obj2;
			st[2]=obj3;
			st[3]=obj4;
			st[4]=obj5;
			for(UserdefinedArray p:st) 
			{
				System.out.println(p);
			}
			
			
			

	}

}
