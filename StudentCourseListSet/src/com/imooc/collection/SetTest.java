package com.imooc.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {

	public List<Course> coursesToSelect;

	public SetTest() {
		coursesToSelect = new ArrayList<Course>();
	}

	/**
	 * 用于往coursesToSelect中添加备选课程
	 */
	public void testAdd() {
		// 创建一个课程对象，并通过调用add方法，添加到备选课程List中
		Course cr1 = new Course("1", "数据结构");
		coursesToSelect.add(cr1);
		Course temp = (Course) coursesToSelect.get(0);
		// System.out.println("添加了课程：" + temp.id + ":" + temp.name);

		Course cr2 = new Course("2", "C语言");
		coursesToSelect.add(0, cr2);
		Course temp2 = (Course) coursesToSelect.get(0);
		// System.out.println("添加了课程：" + temp2.id + ":" + temp2.name);

		// coursesToSelect.add(cr1);
		// Course temp0 = (Course) coursesToSelect.get(2);
		// System.out.println("添加了课程：" + temp.id + ":" + temp.name);

		// 以下方法会抛出数组下标越界异常
		// Course cr3 = new Course("3", "test");
		// coursesToSelect.add(4, cr3);

		Course[] course = { new Course("3", "离散数学"), new Course("4", "汇编语言") };
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3 = (Course) coursesToSelect.get(2);
		Course temp4 = (Course) coursesToSelect.get(3);

		// System.out.println("添加了两门课程：" + temp3.id + ":" +
		// temp3.name + ";" + temp4.id + ":" + temp4.name);

		Course[] course2 = { new Course("5", "高等数学"), new Course("6", "大学英语") };
		coursesToSelect.addAll(2, Arrays.asList(course2));
		Course temp5 = (Course) coursesToSelect.get(2);
		Course temp6 = (Course) coursesToSelect.get(3);
		// System.out.println("添加了两门课程：" + temp5.id + ":" +
		// temp5.name + ";" + temp6.id + ":" + temp6.name);

	}

	/**
	 * 通过for each方法访问集合元素
	 * 
	 * @param args
	 */
	public void testForEach() {
		System.out.println("有如下课程待选(通过for each访问)：");
		for (Object obj : coursesToSelect) {
			Course cr = (Course) obj;
			System.out.println("课程：" + cr.id + ":" + cr.name);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SetTest st = new SetTest();
		st.testAdd();
		st.testForEach();
		// 创建一个学生对象
		Student student = new Student("1", "小明");
		System.out.println("欢迎学生：" + student.name + "选课！");
		// 创建一个Scanner对象，用来接收从键盘输入的课程ID
		Scanner console = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("请输入课程ID");
			String courseId = console.next();
			for (Course cr : st.coursesToSelect) {
				if (cr.id.equals(courseId)) {
					student.courses.add(cr);
					/**
					 * Set中，添加某个对象，无论添加多少次， 最终只会保留一个该对象（的引用）， 并且，保留的是第一次添加的那一个
					 */
					// student.courses.add(null);
					student.courses.add(cr);
				}
			}
		}
		st.testForEachForSet(student);
	}

	public void testForEachForSet(Student student) {
		// 打印输出，学生所选的课程！
		System.out.println("共选择了：" + student.courses.size() + "门课程！");
		for (Course cr : student.courses) {
			System.out.println("选择了课程：" + cr.id + ":" + cr.name);
		}
	}

}
