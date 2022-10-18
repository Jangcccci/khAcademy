package sh.java.io._byte.object;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * 객체 입출력 스트림을 통해 읽기/쓰기할 클래스는 Serializable 인터페이스를 구현해야 한다.
 * == Serializavle 인터페이스를 구현해야 객체 입출력 스트림을 통해 읽기/쓰기가 가능하다!
 * (java.io.NotSerializableException: sh.java.io._byte.object.User)
 * 
 * - implememts Serializable
 * - serialVersionUID값을 지정(지정하지 않으면 radom하게 부여)
 * 
 *
 */
public class User implements Serializable{

	/**
	 * userFile에 user객체를 만들고 다른 JVM에서 user객체를 읽어올 때 User클래스가 있어야돼서...
	 * 직렬화/역직렬화시에 동일한 클래스 검증용 
	 */
	private static final long serialVersionUID = 1L;
	
	private String userName;
	private String password;
	private LocalDate birthday;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userName, String password, LocalDate birthday) {
		super();
		this.userName = userName;
		this.password = password;
		this.birthday = birthday;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", birthday=" + birthday + "]";
	}
	
}
