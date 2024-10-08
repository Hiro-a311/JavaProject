package model;

public class CustomerBean {
	
	private String name;
	private String address;
	private String nickname;
	private String workplace;
	
	public CustomerBean(String name, String address, String nickname, String workplace) {
		super();
		this.name = name;
		this.address = address;
		this.nickname = nickname;
		this.workplace = workplace;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getWorkplace() {
		return workplace;
	}

	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}
	
	
	
}
