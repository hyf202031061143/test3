package test;

import java.sql.*;

public class MysqlJdbc {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序   
			System.out.println("JDBC驱动程序加载成功");
		}
		catch (Exception e) {
			System.out.print("JDBC驱动程序加载失败");
			e.printStackTrace();
		}
		try {
			//连接数据库
			Connection connect = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mysql","root","root123");
			System.out.println("成功连接数据库");
			Statement stmt = connect.createStatement();
			//开始时查询结果
			ResultSet rs = stmt.executeQuery("select * from humanManagement");
			System.out.println("开始时查询结果为：");
			System.out.println("+------+-------------+------+-------+");
			System.out.println("| name | phone       | age  |address|");
			System.out.println("+------+-------------+------+-------+");
			while (rs.next()) {
				System.out.println("| "+rs.getString("name")+"  | "+rs.getString("phone")+" | "+rs.getString("age")+"   | "+rs.getString("address")+"     |");
			}
			System.out.println("+------+-------------+------+-------+");
			
			//增加一条记录后查询结果
			System.out.println("增加一条记录后查询结果为：");
			stmt.executeUpdate("insert into humanManagement values('wcx','15982034402','17','sichuan');");
			rs = stmt.executeQuery("select * from humanManagement");
			System.out.println("+------+-------------+------+-------+");
			System.out.println("| name | phone       | age  |address|");
			System.out.println("+------+-------------+------+-------+");
			while (rs.next()) {
				System.out.println("| "+rs.getString("name")+"  | "+rs.getString("phone")+" | "+rs.getString("age")+"   | "+rs.getString("address")+"     |");
			}
			System.out.println("+------+-------------+------+-------+");
			
			//修改name为"lhk"学生的学号为"17401070733"
			System.out.println("修改hyf的住址为天津后查询结果为：");
			stmt.executeUpdate("update humanManagement set address='tianjin' where name='hyf';");
			rs = stmt.executeQuery("select * from humanManagement");
			System.out.println("+------+-------------+------+-------+");
			System.out.println("| name | phone       | age  |address|");
			System.out.println("+------+-------------+------+-------+");
			while (rs.next()) {
				System.out.println("| "+rs.getString("name")+"  | "+rs.getString("phone")+" | "+rs.getString("age")+"   | "+rs.getString("address")+"     |");
			}
			System.out.println("+------+-------------+------+-------+");
			
			//删除name为"lhk"的学生记录
			System.out.println("删除姓名为wcx的学生记录后查询结果为：");
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
