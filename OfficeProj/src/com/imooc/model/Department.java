package com.imooc.model;

public class Department {
	//部门的编号、名称
	private String departmentNum;
	private String departmentName;
	private Staff[] myStaff;
	private int staffNum;
	//无参构造
	public Department() {
		
	}
	//多参构造，实现对部门编号和部门名称的赋值
	public Department(String departmentNum,String departmentName) {
		this.setDepartmentNum(departmentNum);
		this.setDepartmentName(departmentName);
	}
	//多参构造，实现对全部属性赋值
	public Department(String departmentNum,String departmentName,Staff[] myStaff) {
		this.setDepartmentNum(departmentNum);
		this.setDepartmentName(departmentName);
	}
	public String getDepartmentNum() {
		return departmentNum;
	}
	public void setDepartmentNum(String departmentNum) {
		this.departmentNum = departmentNum;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	/**
	 *  获取部门的员工信息，如果保存员工信息的数组未被初始化，则先初始化，长度为200
	 * @return 保存员工信息的数组
	 */
	public Staff[] getMyStaff() {
		if(this.myStaff==null) {
			this.myStaff=new Staff[200];
		}
		return myStaff;
	}
	public void setMyStaff(Staff[] myStaff) {
		this.myStaff = myStaff;
	}
	public int getStaffNum() {
		return staffNum;
	}
	public void setStaffNum(int staffNum) {
		this.staffNum = staffNum;
	}
	
	
	/**
	 * 描述部门信息方法
	 * @return 部门信息包括部门编号、部门名称
	 */
	public String info() {
		String str="部门编号："+this.getDepartmentNum()+"\n部门名称："+this.getDepartmentName();
		return str;
	}
	/**
	 * 将员工保存到数组中
	 * 将员工数量保存到setStaffNum中
	 * @param sf 
	 */
	public void addStaff(Staff sf) {
		for(int i=0;i<this.getMyStaff().length;i++) {
			if(this.getMyStaff()[i]==null) {
				sf.setStaffDepartment(this);
				this.getMyStaff()[i]=sf;
				this.setStaffNum(i+1);
				return;
			}
		}
	}
}
