package com.imooc.model;

public class Staff {
	// 员工的姓名、工号、性别、年龄
	private String staffName;
	private String staffNum;
	private String staffSex;
	private int staffAge;
	private Department staffDepartment;
	private Position staffPosition;

	// 无参构造
	public Staff() {

	}

	// 多参构造，实现对姓名、工号、性别、年龄的赋值
	public Staff(String staffName, String staffNum, String staffSex, int staffAge) {
		this.setStaffName(staffName);
		this.setStaffNum(staffNum);
		this.setStaffSex(staffSex);
		this.setStaffAge(staffAge);
	}

	// 多参构造，实现对姓名、工号、性别、年龄、部门、职务的赋值
	public Staff(String staffName, String staffNum, String staffSex, int staffAge, Department staffDepartment,
			Position staffPosition) {
		this.setStaffName(staffName);
		this.setStaffNum(staffNum);
		this.setStaffSex(staffSex);
		this.setStaffAge(staffAge);
		this.setStaffDepartment(staffDepartment);
		this.setStaffPosition(staffPosition);
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffNum() {
		return staffNum;
	}

	public void setStaffNum(String staffNum) {
		this.staffNum = staffNum;
	}

	public String getStaffSex() {
		return staffSex;
	}

	/**
	 * 限制性别只能是“男”或者“女”，反之强制赋值为“男”
	 * 
	 * @param staffSex
	 */
	public void setStaffSex(String staffSex) {
		if (staffSex.equals("男") || staffSex.equals("女")) {
			this.staffSex = staffSex;
		} else {
			staffSex.equals("男");
		}

	}

	public int getStaffAge() {
		return staffAge;
	}

	public void setStaffAge(int staffAge) {
		if (staffAge < 18 || staffAge > 65) {
			this.staffAge = 18;
		} else {
			this.staffAge = staffAge;
		}
	}

	/**
	 * 获取部门对象，如果没有实例化，先实例化后再返回
	 * 
	 * @return 部门对象信息
	 */
	public Department getStaffDepartment() {
		if (this.staffDepartment == null) {
			this.staffDepartment = new Department();
		}
		return staffDepartment;
	}

	public void setStaffDepartment(Department staffDepartment) {
		this.staffDepartment = staffDepartment;
	}

	/**
	 * 获取职务对象，如果没有实例化，先实例化后再返回
	 * 
	 * @return 职务对象信息
	 */
	public Position getStaffPosition() {
		if (this.staffPosition == null) {
			this.staffPosition = new Position();
		}
		return staffPosition;
	}

	public void setStaffPosition(Position staffPosition) {
		this.staffPosition = staffPosition;
	}

	/**
	 * 员工自我介绍的方法
	 * 
	 * @return 自我介绍信息，包括姓名、工号、性别、年龄
	 */
	public String introduction() {
		String str = "姓名：" + this.getStaffName() + "\n工号：" + this.getStaffNum() + "\n性别：" + this.getStaffSex() + "\n年龄："
				+ this.getStaffAge() + "\n职务：" + this.getStaffDepartment().getDepartmentName()
				+ this.getStaffPosition().getPositionName();
		return str;
	}
}
