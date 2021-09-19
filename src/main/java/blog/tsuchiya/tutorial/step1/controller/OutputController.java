package blog.tsuchiya.tutorial.step1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import blog.tsuchiya.tutorial.step1.controller.form.InputForm;

@Controller
public class OutputController {

	// postメソッドのときに呼ばれることを宣言。
	// getでこのURLが指定されたら405エラー。
	@PostMapping("output")
	// 2つの方法で入力Formから値を取得している。
	// @RequestParamを使うと、特定の1つの値を取得できる。
	// クラスを使うとまとめて複数の値を取得できる。
	public String output(@RequestParam(required = false) String text1, InputForm inputForm, Model model) {
		// Modelに値を格納してThymeleafに渡す。
		model.addAttribute("output1", text1);
		model.addAttribute("output2", inputForm);
		return "output";
	}
}
