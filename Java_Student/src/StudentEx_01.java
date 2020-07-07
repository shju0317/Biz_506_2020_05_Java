import com.biz.student.service.StudentService;
import com.biz.student.service.StudentServiceImplV1;

public class StudentEx_01 {
	public static void main(String[] args) {
		StudentService sService = new StudentServiceImplV1();
		
		while(true) {
			if(!sService.inputStudent()) {
				break;
			}
		}
		sService.studentList();
		System.out.println("학생리스트 출력 :)");
	}
}
