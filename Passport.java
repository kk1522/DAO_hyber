import java.time.LocalDate;

import javax.persistence.*;

@Table(name ="pass_tbl")
public class Passport {

	@Id
	@Column(name="pass_no")
	private int passportNo;
	
	@Column(name="pass_exp_dt")
	private LocalDate expiryDate;

	public int getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(int passportNo) {
		this.passportNo = passportNo;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "Passport [passportNo=" + passportNo + ", expiryDate=" + expiryDate + "]";
	}
	
	
	
}
