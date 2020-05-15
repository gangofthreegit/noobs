package noobs.bis.common.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Access(AccessType.FIELD)
public class Auditing implements Serializable {
	private static final long serialVersionUID = -974945835582543446L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="created_date")
	@CreatedDate
	private Date created_date;
	
	@Column(name="created_by")
	@CreatedBy
	private Long created_by;
	
	@Column(name="modified_date")
	@LastModifiedDate
	private Date modified_date;
	
	@Column(name="modified_by")
	@LastModifiedBy
	private Long Modified_by;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public Long getCreated_by() {
		return created_by;
	}

	public void setCreated_by(Long created_by) {
		this.created_by = created_by;
	}

	public Date getModified_date() {
		return modified_date;
	}

	public void setModified_date(Date modified_date) {
		this.modified_date = modified_date;
	}

	public Long getModified_by() {
		return Modified_by;
	}

	public void setModified_by(Long modified_by) {
		Modified_by = modified_by;
	}
	
}
