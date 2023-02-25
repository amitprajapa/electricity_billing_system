package electricitybillingsystem;
import java.awt.Color;
import java.sql.ResultSet;
import net.proteanit.sql.*;
import javax.swing.*;
public class BillDetails extends JFrame{
	String meter;
	public BillDetails(String meter)  {
		this.meter=meter;
		setSize(700, 500);
		setLocation(400, 150);
		
		getContentPane().setBackground(Color.WHITE);
		
		JTable table=new JTable();
		
		try {
			Conn c=new Conn();
			String query="select * from bill where meter_no='"+meter+"'";
			ResultSet rs=c.s.executeQuery(query);
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		JScrollPane sp=new JScrollPane(table);
		sp.setBounds(0,0,700,650);
		add(sp);
		setVisible(true);
	
	}
	
	

	public static void main(String[] args) {
	new BillDetails("");	
	}

}
