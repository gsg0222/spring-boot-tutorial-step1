package blog.tsuchiya.tutorial.step1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import blog.tsuchiya.tutorial.step1.controller.form.InputForm;

@Controller
public class OutputController {

	// postメソッドのときに呼ばれることを宣言
	// getでこのURLが指定されたら405エラー
	@PostMapping("output")
	public String output(@RequestParam(required = false) String text1, InputForm inputForm, Model model) {
		model.addAttribute("output1", text1);
		model.addAttribute("output2", inputForm);
		return "output";
	}
}
