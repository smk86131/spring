package com.mh.org3;

/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mh.org3.db.DBManager;

@Controller
public class insertProcController {
	
	@Autowired
	DBManager dbm;
	

	
	@RequestMapping(value="/insertproc", method = RequestMethod.POST)
	public String insertproc(Model model, String para1, String para2) {
		
		
		
		
		return "insertproc";
	}

}
