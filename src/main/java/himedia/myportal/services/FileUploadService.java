package himedia.myportal.services;

import java.util.Calendar;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileUploadService {
	private static String SAVE_PATH = "c:/uploads";
	
	//	멀티파트 파일을 실제 파일로 저장하는 메서드
	public String store(MultipartFile multipartFile) {
		
	}
	
	//	멀티파트 파일을 전달 받아서 실제 저장소에 저장하는 유틸리티 함수
	private void writeFile(MultipartFile multipartFile, String saveFilename) throws IOException {
		
	}
	
	//	확장자를 전달 받아서 임시파일명을 만드는 함수
	public String getSaveFilename(String extName) {
		//	현재시간을 밀리세컨드로 변환해서 파일명으로 삼음
		Calendar cal = Calendar.getInstance();
		return String.valueOf(cal.getTimeInMillis()) + extName.toLowerCase();
	}
}
