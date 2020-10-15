package com.imooc.test;
import com.imooc.model.*;
public class OfficeTest {

	public static void main(String[] args) {
		
		Position po1=new Position("P001","����");
		Position po2=new Position("P002","����");
		Position po3=new Position("P003","ְԱ");
		
		
		Staff sf1=new Staff("����","S001","��",29);
		Staff sf2=new Staff("���","S002","Ů",21);
		Staff sf3=new Staff("�ﳬ","S003","��",29);
		Staff sf4=new Staff("������","S004","Ů",26);
		Staff sf5=new Staff("����","S005","��",379);
		Staff sf6=new Staff("����","S006","Ů",24);
		
		Department dp1=new Department("D001","���²�");
		Department dp2=new Department("D002","�г���");
		
		dp1.addStaff(sf1);
		dp1.addStaff(sf2);
		dp1.addStaff(sf3);
		
		dp2.addStaff(sf4);
		dp2.addStaff(sf5);
		dp2.addStaff(sf6);
		
		sf1.setStaffPosition(po1);
		sf2.setStaffPosition(po2);
		sf3.setStaffPosition(po3);
		sf4.setStaffPosition(po3);
		sf5.setStaffPosition(po1);
		sf6.setStaffPosition(po3);
		
		System.out.println(sf1.introduction());
		System.out.println("======================");
		System.out.println(sf2.introduction());
		System.out.println("======================");
		System.out.println(sf3.introduction());
		System.out.println("======================");
		System.out.println(sf4.introduction());
		System.out.println("======================");
		System.out.println(sf5.introduction());
		System.out.println("======================");
		System.out.println(sf6.introduction());
		System.out.println("======================");
		System.out.println(dp1.getDepartmentName()+"����"+dp1.getStaffNum()+"��Ա��");
		System.out.println(dp2.getDepartmentName()+"����"+dp2.getStaffNum()+"��Ա��");
	}

}
