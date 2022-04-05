import java.util.ArrayList;

public interface PassportDAO {

	public void addPassport(Passport passport);
	public void updatePassport(String passportId,Passport passport);
	public void deletePassport(String passportId);
	public Passport selectPassport(String passportId);
	public ArrayList<Passport> selectAll();
}
