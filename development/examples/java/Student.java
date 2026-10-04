package set.courseregistration;

import java.util.HashSet;

import java.util.Set;

public class Student {
	private int id;
	private String name;
	private Set<Course> registeredCourses;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
		this.registeredCourses = new HashSet<Course>(); // 코스를 등록할 수 있는 시간표 생성
	}

	// 수강 신청
	public void resisterCourse(Course course) {
		if (registeredCourses.add(course)) {
			System.out.println(course.getName() + "정상적으로 신청되었습니다.");
		} else {
			System.out.println("이미 신청한 과목입니다.");
		}
	}

	// 수강 취소
	public void cancelCourse(Course course) {
		if (registeredCourses.remove(course)) {
			System.out.println(course.getName() + "정상적으로 취소되었습니다.");
		} else {
			System.out.println("신청하지 않은 과목입니다.");
		}
	}

	// 수강 신청 내역 출력
	public void printRegisteredCourses() {
		System.out.println("== " + name + " 학생이 신청한 과목 ==");
		if (registeredCourses.isEmpty()) {
			System.out.println("신청한 과목이 존재하지 않습니다.");
		} else {
			for (Course course : registeredCourses) {
				System.out.print(course.getName() + " ");
			}
			System.out.println();
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Course> getRegisteredCourses() {
		return registeredCourses;
	}

	public void setRegisteredCourses(Set<Course> registeredCourses) {
		this.registeredCourses = registeredCourses;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", registeredCourses=" + registeredCourses + "]";
	}

}
