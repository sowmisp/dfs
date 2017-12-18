package yuga;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "hms_user_credentials")
public class UserCredential {
	@Id
	@Column(name = "user_id")
	private int userId; 
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "auth_key")
	private String authKey;
	 
	//@OneToOne(mappedBy="credenial")
	private UserProfile Profile;
	

	public UserProfile getProfile() {
		return Profile;
	}

	public void setProfile(UserProfile profile) {
		Profile = profile;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAuthKey() {
		return authKey;
	}

	public void setAuthKey(String authKey) {
		this.authKey = authKey;
	}

}

