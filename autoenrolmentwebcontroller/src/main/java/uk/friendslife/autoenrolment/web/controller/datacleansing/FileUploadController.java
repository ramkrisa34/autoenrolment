package uk.friendslife.autoenrolment.web.controller.datacleansing;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import uk.friendslife.autoenrolment.web.model.datacleansing.EmployeeDetail;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Hello world!
 *
 */
public class FileUploadController extends MultiActionController {
	public ModelAndView upload(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		EmployeeDetail e = new EmployeeDetail();
		e.setAge(32);
		e.setName("yum yum");
		e.setSalary(1200);
		
		Map map = new HashMap();
		map.put("employee", e);
		
		return new ModelAndView("welcome", map);
	}
    
}
