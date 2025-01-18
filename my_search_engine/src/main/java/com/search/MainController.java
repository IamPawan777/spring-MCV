package com.search;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class MainController {
	
	@RequestMapping("/home")
	public String showHome() {		
		return "home";
	}
	
	@RequestMapping("/googleProcess")
	public RedirectView showGooglePage(@RequestParam("googleQueryBox") String query) {
		RedirectView redirectView = new RedirectView();
		String url = "https://www.google.com/search?q="+query;		
		redirectView.setUrl(url);
		return redirectView;	
	}
	
	@RequestMapping("/yahooProcess")
	public RedirectView showYahooPage(@RequestParam("yahooQueryBox") String query) {
		RedirectView redirectView = new RedirectView();
		String url = "https://in.search.yahoo.com/search;_ylt=AwrKB5VOZYpnwjoJazW6HAx.;_ylc=X1MDMjExNDcyMzAwMgRfcgMyBGZyAwRmcjIDcDpzLHY6c2ZwLG06c2ItdG9wBGdwcmlkA1NVZkkxSVI1VExXSk8waTQxY2hfaEEEbl9yc2x0AzAEbl9zdWdnAzAEb3JpZ2luA2luLnNlYXJjaC55YWhvby5jb20EcG9zAzAEcHFzdHIDBHBxc3RybAMwBHFzdHJsAzQEcXVlcnkDamF2YQR0X3N0bXADMTczNzE0NDU0NQ--?p="+query;
		redirectView.setUrl(url);
		return redirectView;
	}
	
	@RequestMapping("/braveProcess")
	public RedirectView showBravePage(@RequestParam("braveQueryBox") String query) {
		RedirectView redirectView = new RedirectView();
		String url = "https://search.brave.com/search?q="+query;
		redirectView.setUrl(url);
		return redirectView;
	}
	
	@RequestMapping("/edgeProcess")
	public RedirectView showedgePage(@RequestParam("edgeQueryBox") String query) {
		RedirectView redirectView = new RedirectView();
		String url = "https://www.bing.com/search?q="+query;
		redirectView.setUrl(url);
		return redirectView;
	}
}
