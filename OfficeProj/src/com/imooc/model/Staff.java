package com.imooc.model;

public class Staff {
	// Ա�������������š��Ա�����
	private String staffName;
	private String staffNum;
	private String staffSex;
	private int staffAge;
	private Department staffDepartment;
	private Position staffPosition;

	// �޲ι���
	public Staff() {

	}

	// ��ι��죬ʵ�ֶ����������š��Ա�����ĸ�ֵ
	public Staff(String staffName, String staffNum, String staffSex, int staffAge) {
		this.setStaffName(staffName);
		this.setStaffNum(staffNum);
		this.setStaffSex(staffSex);
		this.setStaffAge(staffAge);
	}

	// ��ι��죬ʵ�ֶ����������š��Ա����䡢���š�ְ��ĸ�ֵ
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
	 * �����Ա�ֻ���ǡ��С����ߡ�Ů������֮ǿ�Ƹ�ֵΪ���С�
	 * 
	 * @param staffSex
	 */
	public void setStaffSex(String staffSex) {
		if (staffSex.equals("��") || staffSex.equals("Ů")) {
			this.staffSex = staffSex;
		} else {
			staffSex.equals("��");
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
	 * ��ȡ���Ŷ������û��ʵ��������ʵ�������ٷ���
	 * 
	 * @return ���Ŷ�����Ϣ
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
	 * ��ȡְ��������û��ʵ��������ʵ�������ٷ���
	 * 
	 * @return ְ�������Ϣ
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
	 * Ա�����ҽ��ܵķ���
	 * 
	 * @return ���ҽ�����Ϣ���������������š��Ա�����
	 */
	public String introduction() {
		String str = "������" + this.getStaffName() + "\n���ţ�" + this.getStaffNum() + "\n�Ա�" + this.getStaffSex() + "\n���䣺"
				+ this.getStaffAge() + "\nְ��" + this.getStaffDepartment().getDepartmentName()
				+ this.getStaffPosition().getPositionName();
		return str;
	}
}
