package com.imooc.model;

public class Department {
	//���ŵı�š�����
	private String departmentNum;
	private String departmentName;
	private Staff[] myStaff;
	private int staffNum;
	//�޲ι���
	public Department() {
		
	}
	//��ι��죬ʵ�ֶԲ��ű�źͲ������Ƶĸ�ֵ
	public Department(String departmentNum,String departmentName) {
		this.setDepartmentNum(departmentNum);
		this.setDepartmentName(departmentName);
	}
	//��ι��죬ʵ�ֶ�ȫ�����Ը�ֵ
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
	 *  ��ȡ���ŵ�Ա����Ϣ���������Ա����Ϣ������δ����ʼ�������ȳ�ʼ��������Ϊ200
	 * @return ����Ա����Ϣ������
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
	 * ����������Ϣ����
	 * @return ������Ϣ�������ű�š���������
	 */
	public String info() {
		String str="���ű�ţ�"+this.getDepartmentNum()+"\n�������ƣ�"+this.getDepartmentName();
		return str;
	}
	/**
	 * ��Ա�����浽������
	 * ��Ա���������浽setStaffNum��
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
