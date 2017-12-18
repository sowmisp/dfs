package yuga;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="hms_user_profiles")
public class UserProfile {
	@Id
	@Column(name="user_id")
	private int userId;
	
	@Column(name="profile_id")
	private int profileId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="department")
	private String department;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="gurdian_name")
	private String gurdianName;
	
	@Column(name="date_of_birth")
	private String dateOfBirth;
	
	@Column(name="email_id")
	private String email_id;
	
	@Column(name="phone_number")
	private int phoneNumber;
	
	@Column(name="joined_date")
	private int joinedDate;
	
	//@OneToOne(mappedBy="profile")
	//@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "profile")
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getProfileId() {
		return profileId;
	}
	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGurdianName() {
		return gurdianName;
	}
	public void setGurdianName(String gurdianName) {
		this.gurdianName = gurdianName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(int joinedDate) {
		this.joinedDate = joinedDate;
	}
	
	}
