public class MVCPatternDemo {

	public static void main(String[] args) {
		Course model = retrieveCourseFromDatabase();
		CourseView view = new CourseView();
		CourseController controller = new CourseController(model, view);
		controller.updateView();
		
		controller.setCourseName("Python");
		System.out.println("\nAfter updateing, Course Details are as follows");
		controller.updateView();
	
	}

	private static Course retrieveCourseFromDatabase() {
		Course course = new Course();
		course.setName("Java");
		course.setId("01");
		course.setCategory("Programming");
		return course;
	}
}
