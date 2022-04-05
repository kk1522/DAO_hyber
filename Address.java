import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "add_tbl")
public class Address {
		
		@Id
		@Column(name = "add_id")
		private int id;
		
		@Column(name = "add_flat_no")
		private String flatNo;
		
		@Column(name = "add_society")
		private String soceity;
		
		@Column(name = "add_sector")
		private String sector;
		
		@Column(name = "add_city")
		private String city;
		
		@Column(name = "add_pin")
		private int pin;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFlatNo() {
			return flatNo;
		}

		public void setFlatNo(String flatNo) {
			this.flatNo = flatNo;
		}

		public String getSoceity() {
			return soceity;
		}

		public void setSoceity(String soceity) {
			this.soceity = soceity;
		}

		public String getSector() {
			return sector;
		}

		public void setSector(String sector) {
			this.sector = sector;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public int getPin() {
			return pin;
		}

		public void setPin(int pin) {
			this.pin = pin;
		}

		@Override
		public String toString() {
			return "Address [id=" + id + ", flatNo=" + flatNo + ", soceity=" + soceity + ", sector=" + sector
					+ ", city=" + city + ", pin=" + pin + "]";
		}
		
		
		
}
