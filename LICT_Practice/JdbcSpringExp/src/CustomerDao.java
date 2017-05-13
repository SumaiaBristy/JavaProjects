import org.springframework.jdbc.core.JdbcTemplate;

public class CustomerDao {
	private JdbcTemplate template;
	public CustomerDao(JdbcTemplate template)
	{
		
		
		super();
		this.template=template;
	}
	public int saveCustomer(Customer customer)
	{
		
		String query="insert into CUS(NAME,AGE,ORDER_DETAILS)values(cust+"')";
		
	}
}
