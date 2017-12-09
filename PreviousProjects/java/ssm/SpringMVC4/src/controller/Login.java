package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes(value="userSession")
//Ҳ����ͬʱ���ö��session����
//@SessionAttributes({"a","b"})
@RequestMapping("/a")
public class Login {
	
	@RequestMapping("login")
	public   String   doLogin(Model  model)
	{//�����Model�д�����ΪuserSession��key���Ͱ�key�����Ӧ��ֵ���뵽HttpSession��
		model.addAttribute("userSession","userSession111");//ΪʲôuserSession�����Ű���
		return "../index.jsp";
	}
	@RequestMapping("login1")
	public   String   doLogin(@ModelAttribute("userSession")   String userSession2)
	{//ʹ�ô�ע�����˼�ǣ���HttpSession��keyΪusernameSession��ֵע�뵽userSession2���������
		System.out.println(userSession2);
	 	return "../index1.jsp";
	}
}
