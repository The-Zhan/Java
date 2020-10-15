package com.imooc.model;

public class Position {
	//职务的编号、名称
	private String positionNum;
	private String positionName;
	//无参构造
	public Position() {
		
	}
	//多参构造，实现对职务编号、名称的赋值
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
		String str="职务编号："+this.getPositionNum()+"\n职务名称："+this.getPositionName();
		return str;
	}
		
}
