package noobs.bis.entity.account;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import noobs.bis.common.entity.Auditing;
import noobs.bis.constant.AccountState;
import noobs.bis.constant.AccountType;


@Entity
@Table(name = "accounts")
public class Account extends Auditing {

	private static final long serialVersionUID = 2981664525824183311L;
	
	@Column(name = "login_name")
	private String loginName;
	
	@Column(name = "login_password")
	private String loginPassword;
	
	@Column(name = "account_type")
	@Enumerated(EnumType.STRING)
	private AccountType accountType;
	
	@Column(name = "account_state")
	@Enumerated(EnumType.STRING)
	private AccountState accountState;
	
	@Column(name = "user_id")
	private Long userId;

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public AccountState getAccountState() {
		return accountState;
	}

	public void setAccountState(AccountState accountState) {
		this.accountState = accountState;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
}
