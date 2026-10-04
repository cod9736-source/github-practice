package set.courseregistration;

import java.util.Scanner;

public class CourseRegistration {
	static Course[] courses = { new Course(1, "자바"), new Course(2, "웹"), new Course(3, "스프링") };
	static Student[] students = { new Student(1, "김땡땡"), new Student(2, "이뿅뿅") };
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.println("메뉴 선택: 1.과목확인 2.수강신청 3.수강취소 4.수강확인 5.종료");
			System.out.print(">>>");
			int choice = input.nextInt();

			switch (choice) {
			case 1:
				// 과목 목록 출력
				for (Course course : courses) {
					System.out.println(course);
				}
				break;
			case 2:
				registerCourse();
				break;
			case 3:
				cancelCourse();
				break;
			case 4:
				System.out.print("학번: ");
				int studentID = input.nextInt();
				Student student = findStudent(studentID);
				if (student != null) {
					student.printRegisteredCourses();
				} else {
					System.out.println("학번을 잘 못 입력하셨습니다.");
				}
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				return;

			default:
				System.out.println("잘못된 선택입니다. 다시 입력해주세요.");
				break;
			}
		}

	} // main 종료

	// 수강 취소
	private static void cancelCourse() {
		// 학번 입력 -> 등록된 학생 여부 판별
		System.out.print("학번: ");
		int studentID = input.nextInt();
		// 학생 찾기
		Student student = findStudent(studentID);
		if (student != null) {
			// 신청할 과목 코드 입력 -> 과목 존재 여부 판별(in courses)
			System.out.print("과목 코드: ");
			int courseCode = input.nextInt();
			Course course = findCourseByStudent(student, courseCode);
			if (course != null) {
				student.cancelCourse(course); // 수강 취소
			} else {
				System.out.println("과목코드를 잘 못 입력하셨습니다.");
			}
		} else {
			System.out.println("학번을 잘 못 입력하셨습니다.");
		}

	}

	// 학생별 시간표에서 과목 찾아내는 기능
	private static Course findCourseByStudent(Student student, int courseCode) {
		for (Course course : student.getRegisteredCourses()) {
			if (course.getCode() == courseCode) {
				return course;
			}
		}
		return null;
	}

	// 수강 신청
	private static void registerCourse() {
		// 학번 입력 -> 등록된 학생 여부 판별
		System.out.print("학번: ");
		int studentID = input.nextInt();
		// 학생 찾기
		Student student = findStudent(studentID);
		if (student != null) {
			// 신청할 과목 코드 입력 -> 과목 존재 여부 판별(in courses)
			System.out.print("과목 코드: ");
			int courseCode = input.nextInt();
			Course course = findCourse(courseCode);
			if (course != null) {
				student.resisterCourse(course); // 수강 신청
			} else {
				System.out.println("과목코드를 잘 못 입력하셨습니다.");
			}
		} else {
			System.out.println("학번을 잘 못 입력하셨습니다.");
		}

	}

	// 학생 찾기
	private static Student findStudent(int studentID) {
		for (Student student : students) {
			if (studentID == student.getId()) {
				return student;
			}
		}
		return null;
	}

	// 과목 찾기
	private static Course findCourse(int courseCode) {
//		과목 존재 여부 판별(in courses)
		for (Course course : courses) {
			if (course.getCode() == courseCode) {
				return course;
			}
		}
		return null;
	}

}
