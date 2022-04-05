import java.util.ArrayList;

public interface AddressDAO {
	
	public void addAddress(Address address);
	public void updateAddress(String addressId,Address address);
	public void deleteAddress(String addressId);
	public Address selectAddress(String addressId);
	public ArrayList<Address> selectAll();

}
