public class User {

	private String nickName;
	private String nationalId;

	private User (String nickName, String nationalId) {
		this.nickName = nickName;
		this.nationalId = nationalId;
	}

	private void setNickName (String newNickName) {
		this.nickName = newNickName;
	}

	private String getNickName () {
		return this.nickName;
	}

	private void setNationalId (String newNationalId) {
		this.nationalId = newNationalId;
	}

	private String getNationalId () {
		return this.nationalId;
	}
}
