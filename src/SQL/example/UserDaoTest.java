package SQL.example;

import java.util.List;
import java.util.Scanner;

public class UserDaoTest {

	private String name;
	private int age;
	private String address;
	private double salary;
	private int id;
	public static final String[] titles = { "ID", "NAME", "SEX", "EMAIL", };

	public static void main(String[] args) throws  Exception{


		Scanner scanner = new Scanner(System.in);

		while(true){
			System.out.println("########请选择你要输入的类型：########");
			System.out.println("\t a.添加员工信息");
			System.out.println("\t b.查询员工信息");
			System.out.println("\t c.删除员工信息");
			System.out.println("\t q.断开链接");

			Thread.sleep(3000);
			System.out.println("please enter character");
			String sel = scanner.next();
			if ("a".equalsIgnoreCase(sel)) {

				testInsert();
			
			} else if ("b".equalsIgnoreCase(sel)) {

				testQuery();
			
			} else if ("c".equalsIgnoreCase(sel)) {
				//delete user
				testDelete();

			} else if("q".equalsIgnoreCase(sel)){
				UserDao.exit();
				break;
			} else {
				System.out.println("您的输入有误，请重新进入程序。");
			}

		}

	}
	public static void testDelete(){
		System.out.println("请输入删除的id号");
		Scanner input=new Scanner(System.in);
		int id=input.nextInt();
		int deleteCount = UserDao.delete(id);
		System.out.println(deleteCount > 0 ? "删除成功" : "删除失败");
	}

	public static void testInsert() {
		User user = new User("LinChong", "Man", "Linchong@qq.com");
		int insertCount = UserDao.save(user);
		System.out.println(insertCount > 0 ? "添加成功" : "添加失败");

	}

	private static void testQuery() {
		// TODO Auto-generated method stub

		List<User> list = UserDao.getAllRecords();

		// print titles of company table
		String format = "%-10s";
		for (int i = 0; i < titles.length; i++) {
			System.out.printf(format, titles[i]);
		}
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			User rs = (User) list.get(i);

			System.out.printf(format, rs.getId());
			System.out.printf(format, rs.getName());
			System.out.printf(format, rs.getSex());
			System.out.printf(format, rs.getEmail());

			System.out.println();

		}
	}

}
