package blog.tsuchiya.tutorial.step1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// 最需要アノテーション。このクラスがControllerであることを宣言する。
@Controller
public class InputController {

	// どのURLにアクセスしたらこのメソッドが呼ばれるか宣言する
	// @GetMappingはmethodがgetのときだけ対応するアノテーション
	// もしmethodがpostで呼ばれた場合405エラーになる
	@GetMapping("input")
	// メソッド名は何でもいい
	public String input() {
		// 戻り値はThymeleafテンプレートの位置
		// src/main/resources/templatesからのパスを書く
		// 拡張子は省略する
		return "input";
	}
}
