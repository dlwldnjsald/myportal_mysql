package himedia.myportal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/fileupload")
public class FileUploadController {
	
	//	업로드 폼
	@RequestMapping({"", "/form"})
	public String form() {
		return "fileupload/form";
	}

	//	업로드 액션
	@PostMapping("/upload")
	public String upload(@RequestParam("file1") MultipartFile file1) {
		System.out.println("원본파일명:" + file1.getOriginalFilename());
		System.out.println("파일사이즈:" + file1.getSize());
		System.out.println("파라미터 이름:" + file1.getName());
		
		return "fileupload/result";
	}
}
