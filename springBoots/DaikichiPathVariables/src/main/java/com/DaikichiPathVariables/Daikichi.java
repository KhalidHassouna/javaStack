package com.DaikichiPathVariables;



import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Daikichi {

@RequestMapping("/daikichi/travel/{city}")	
public String display(@PathVariable("city") String name){
	return  "Congratulations! You will soon travel to kyoto!"+name;
}
@RequestMapping("/daikichi/lotto/{x}")
public String luck(@PathVariable("x") int y) {
	if (y%2==1) {
		return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends." ;
	}
	else {
		return "ou will take a grand journey in the near future, but be weary of tempting offers" ;
	}
	
}
}
