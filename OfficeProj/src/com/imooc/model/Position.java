package com.imooc.model;

public class Position {
	//ְ��ı�š�����
	private String positionNum;
	private String positionName;
	//�޲ι���
	public Position() {
		
	}
	//��ι��죬ʵ�ֶ�ְ���š����Ƶĸ�ֵ
	public Position(String positionNum,String positionName) {
		this.setPositionNum(positionNum);
		this.setPositionName(positionName);
	}
	public String getPositionNum() {
		return positionNum;
	}
	public void setPositionNum(String positionNum) {
		this.positionNum = positionNum;
	}
	public String getPositionName() {
		return positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	public String info() {
		String str="ְ���ţ�"+this.getPositionNum()+"\nְ�����ƣ�"+this.getPositionName();
		return str;
	}
		
}
