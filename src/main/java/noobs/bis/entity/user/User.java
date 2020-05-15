package noobs.bis.entity.user;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import noobs.bis.common.entity.Auditing;
import noobs.bis.constant.Gender;

@Entity
@Table(name="users")
public class User extends Auditing {

	private static final long serialVersionUID = -1308851172018396568L;
	
	@Column(name="family_name")
	private String familyName;
	
	@Column(name="given_name")
	private String givenName;
	
	@Column(name="gender")
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@Column(name="date_of_birth")
	private Date dateOfBirth;
	
	@Column(name="mobile")
	private String mobile;
	
	@Column(name="address")
	private String address;
	
	@Column(name="email")
	private String email;
	
	@Column(name="avatar")
	private String avatar;
	
	@Column(name="id_number")
	private String IdNumber;

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

}
