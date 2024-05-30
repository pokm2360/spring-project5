package com.example.demo.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.BookDTO;
import com.example.demo.dto.PersonDTO;
import com.example.demo.dto.SampleDTO;

@Controller
@RequestMapping("/quiz")
public class QuizController {

	@GetMapping("/q1")
	public void q1(Model model) {
		model.addAttribute("name", "둘리");
		model.addAttribute("age", "20");
		model.addAttribute("address", "인천 구월동");
	}
	
	@GetMapping("/q2")
	public void q2(Model model) { // model: 화면에 데이터를 전달하는 클래스
		model.addAttribute("msg1", "스프링부트웹프로젝트"); //컨트롤러 > 화면으로 전달
		model.addAttribute("msg2", "구멍가게 코딩단");
		model.addAttribute("msg3", LocalDate.of(2022,12,25));
//		msg는 변수 이름
	}
	
	@GetMapping("/q3")
	public void q3(Model model) {
		
		PersonDTO personDTO = new PersonDTO("둘리", 20, "인천 구월동");
		
		model.addAttribute("dto", personDTO);
	}
	
	@GetMapping("/q4")
	public void q4(Model model) {
		
//		BookDTO bookDTO = new BookDTO("스프링부트웹프로젝트", "구멍가게코딩단", LocalDate.of(2022,12,25));
		BookDTO bookDTO = BookDTO.builder()
                .title("스프링부트웹프로젝트").author("구멍가게코딩단").publicationDate(LocalDate.of(2022,12,25))
                .build();
		
		model.addAttribute("dto", bookDTO);		
	}
	
	@GetMapping("/q5")
	public void q5(Model model) {
		int[] list = {1,2,3,4,5,6,7,8,9,10};
		model.addAttribute("arr", list);
	}
	
	@GetMapping("/q6")
	public void q6(Model model) {
		List<PersonDTO> list = new ArrayList<>();
		
		list.add(new PersonDTO("둘리", 20, "인천 구월동"));
		list.add(new PersonDTO("또치", 30, "서울 신림동"));
		list.add(new PersonDTO("도우너", 40, "부산 문래동"));
		model.addAttribute("list", list);
	}

	@GetMapping("/q7")
	public void q7(Model model) {
		List<SampleDTO> list = new ArrayList<>();
		
		list.add(new SampleDTO(1, "1번", LocalDate.now()));
		list.add(new SampleDTO(2, "2번", LocalDate.now()));
		list.add(new SampleDTO(3, "3번", LocalDate.now()));
		list.add(new SampleDTO(4, "4번", LocalDate.now()));
		list.add(new SampleDTO(5, "5번", LocalDate.now()));
		list.add(new SampleDTO(6, "6번", LocalDate.now()));
		list.add(new SampleDTO(7, "7번", LocalDate.now()));
		list.add(new SampleDTO(8, "8번", LocalDate.now()));
		list.add(new SampleDTO(9, "9번", LocalDate.now()));
		list.add(new SampleDTO(10, "10번", LocalDate.now()));
		list.add(new SampleDTO(11, "11번", LocalDate.now()));
		list.add(new SampleDTO(12, "12번", LocalDate.now()));
		list.add(new SampleDTO(13, "13번", LocalDate.now()));
		list.add(new SampleDTO(14, "14번", LocalDate.now()));
		list.add(new SampleDTO(15, "15번", LocalDate.now()));
		list.add(new SampleDTO(16, "16번", LocalDate.now()));
		list.add(new SampleDTO(17, "17번", LocalDate.now()));
		list.add(new SampleDTO(18, "18번", LocalDate.now()));
		list.add(new SampleDTO(19, "19번", LocalDate.now()));
		list.add(new SampleDTO(20, "20번", LocalDate.now()));
		model.addAttribute("list", list);
	}
	
	@GetMapping({"/q8", "/q9"})
	public void q8(Model model) {
		List<PersonDTO> list = new ArrayList<>();
		
		list.add(new PersonDTO("박하나", 25, "인천 구월동"));
		list.add(new PersonDTO("홍재범", 17, "서울 신림동"));
		list.add(new PersonDTO("문유리", 31, "부산 문래동"));
		list.add(new PersonDTO("김재민", 8, "인천 연수동"));
		list.add(new PersonDTO("장유라", 33, "부산 문래동"));
		model.addAttribute("list", list);
	}
}
