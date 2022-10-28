package test;

import java.sql.*;

public class MysqlJdbc {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");     //����MYSQL JDBC��������   
			System.out.println("JDBC����������سɹ�");
		}
		catch (Exception e) {
			System.out.print("JDBC�����������ʧ��");
			e.printStackTrace();
		}
		try {
			//�������ݿ�
			Connection connect = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mysql","root","root123");
			System.out.println("�ɹ��������ݿ�");
			Statement stmt = connect.createStatement();
			//��ʼʱ��ѯ���
			ResultSet rs = stmt.executeQuery("select * from humanManagement");
			System.out.println("��ʼʱ��ѯ���Ϊ��");
			System.out.println("+------+-------------+------+-------+");
			System.out.println("| name | phone       | age  |address|");
			System.out.println("+------+-------------+------+-------+");
			while (rs.next()) {
				System.out.println("| "+rs.getString("name")+"  | "+rs.getString("phone")+" | "+rs.getString("age")+"   | "+rs.getString("address")+"     |");
			}
			System.out.println("+------+-------------+------+-------+");
			
			//����һ����¼���ѯ���
			System.out.println("����һ����¼���ѯ���Ϊ��");
			stmt.executeUpdate("insert into humanManagement values('wcx','15982034402','17','sichuan');");
			rs = stmt.executeQuery("select * from humanManagement");
			System.out.println("+------+-------------+------+-------+");
			System.out.println("| name | phone       | age  |address|");
			System.out.println("+------+-------------+------+-------+");
			while (rs.next()) {
				System.out.println("| "+rs.getString("name")+"  | "+rs.getString("phone")+" | "+rs.getString("age")+"   | "+rs.getString("address")+"     |");
			}
			System.out.println("+------+-------------+------+-------+");
			
			//�޸�nameΪ"lhk"ѧ����ѧ��Ϊ"17401070733"
			System.out.println("�޸�hyf��סַΪ�����ѯ���Ϊ��");
			stmt.executeUpdate("update humanManagement set address='tianjin' where name='hyf';");
			rs = stmt.executeQuery("select * from humanManagement");
			System.out.println("+------+-------------+------+-------+");
			System.out.println("| name | phone       | age  |address|");
			System.out.println("+------+-------------+------+-------+");
			while (rs.next()) {
				System.out.println("| "+rs.getString("name")+"  | "+rs.getString("phone")+" | "+rs.getString("age")+"   | "+rs.getString("address")+"     |");
			}
			System.out.println("+------+-------------+------+-------+");
			
			//ɾ��nameΪ"lhk"��ѧ����¼
			System.out.println("ɾ������Ϊwcx��ѧ����¼���ѯ���Ϊ��");
			stmt.executeUpdate("delete from humanManagement where name='wcx';");
			rs = stmt.executeQuery("select * from humanManagement");
			System.out.println("+------+-------------+------+-------+");
			System.out.println("| name | phone       | age  |address|");
			System.out.println("+------+-------------+------+-------+");
			while (rs.next()) {
				System.out.println("| "+rs.getString("name")+"  | "+rs.getString("phone")+" | "+rs.getString("age")+"   | "+rs.getString("address")+"     |");
			}
			System.out.println("+------+-------------+------+-------+");
		}
		catch (Exception e) {
			System.out.print("get data error!");
			e.printStackTrace();
		}
	}

}
