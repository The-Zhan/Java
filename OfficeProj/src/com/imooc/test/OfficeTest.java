package com.imooc.test;
import com.imooc.model.*;
public class OfficeTest {

	public static void main(String[] args) {
		
		Position po1=new Position("P001","经理");
		Position po2=new Position("P002","助理");
		Position po3=new Position("P003","职员");
		
		
		Staff sf1=new Staff("张铭","S001","男",29);
		Staff sf2=new Staff("李艾爱","S002","女",21);
		Staff sf3=new Staff("孙超","S003","男",29);
		Staff sf4=new Staff("张美美","S004","女",26);
		Staff sf5=new Staff("蓝迪","S005","男",379);
		Staff sf6=new Staff("米莉","S006","女",24);
		
		Department dp1=new Department("D001","人事部");
		Department dp2=new Department("D002","市场部");
		
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
		System.out.println(dp1.getDepartmentName()+"共有"+dp1.getStaffNum()+"名员工");
		System.out.println(dp2.getDepartmentName()+"共有"+dp2.getStaffNum()+"名员工");
	}

}
