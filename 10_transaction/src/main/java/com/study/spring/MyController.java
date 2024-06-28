package com.study.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.spring.service.IBuyTicketService;

@Controller
//@RequestMapping("/v1/api")
public class MyController {

	@Autowired
	IBuyTicketService buyTicket;
	
	@RequestMapping("/member")
	public @ResponseBody String root() {
		return "transaction";
	}
	
	@RequestMapping("/buyticket")
	public String buy_ticket() {
		return "buy_ticket";
	}
	
	@RequestMapping("/buy_ticket_card")
	public String buy_ticket_card(
			@RequestParam("consumerId") String consumerId,
			@RequestParam("amount") String amount,
			@RequestParam("error") String error,
			Model model
			) {
		int nResult = buyTicket.buy(consumerId, Integer.parseInt(amount), error); // 0 or 1 이 나온다
				
		model.addAttribute("consumerId", consumerId);
		model.addAttribute("amount", amount);
		
		if(nResult == 1) {
			return "buy_ticket_end";
		}else {
			return "buy_ticket_end";
		}
		
	}
	
}




