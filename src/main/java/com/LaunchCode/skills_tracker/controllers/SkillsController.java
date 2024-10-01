package com.LaunchCode.skills_tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

	@PostMapping
	@ResponseBody
	public String skillsMessage(@RequestParam String name, @RequestParam String first, @RequestParam String second, @RequestParam String third) {
		return "<html>" +
				"<body>" +
				"<h1>Skills Tracker</h1>" +
				"<h2>" +
				name +
				"</h2>" +
				"<ol>" +
				"<li>" +
				first +
				"</li>" +
				"<li>" +
				second +
				"</li>" +
				"<li>" +
				third +
				"</li>" +
				"</ol>" +
				"</body>" +
				"</html>";
	}

	@GetMapping("form")
	@ResponseBody
	public String userFavorites() {
		return "<html>" +
					"<body>" +
						"<form action = '/' method = 'post'>" +
							"<div><label>Name: <input type = 'text' name ='name'></label></div>" +
								"<div><label>My favorite language: <select name = 'first'>" +
									"<option value = 'Java'>Java</option>" +
									"<option value = 'Python'>Python</option>" +
									"<option value = 'JavaScript'>JavaScript</option>" +
								"</select></label></div>" +
								"<div><label>My second favorite language: <select name = 'second'>" +
									"<option value = 'Java'>Java</option>" +
									"<option value = 'Python'>Python</option>" +
									"<option value = 'JavaScript'>JavaScript</option>" +
								"</select></label></div>" +
								"<div><label>My third favorite language: <select name = 'third'>" +
									"<option value = 'Java'>Java</option>" +
									"<option value = 'Python'>Python</option>" +
									"<option value = 'JavaScript'>JavaScript</option>" +
								"</select></label></div" +
							"<div><input type = 'submit'></div>" +
						"</form>" +
					"</body>" +
				"</html";
	}

}
