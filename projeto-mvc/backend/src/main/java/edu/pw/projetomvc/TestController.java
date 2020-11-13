package edu.pw.projetomvc;

import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestHeader;
import javax.annotation.security.RolesAllowed;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.ServletException;

@RestController
public class TestController {

    @RequestMapping(value = "/anonymous", method = RequestMethod.GET)
    public ResponseEntity<String> getAnonymous() {
        return ResponseEntity.ok("Hello Anonymous");
    }

    //@RolesAllowed("usuario")
    //@RequestMapping(value = "/user", method = RequestMethod.GET)
    //public ResponseEntity<String> getUser(@RequestHeader String Authorization) {
    //    return ResponseEntity.ok("Hello User");
    //}
//
    @RequestMapping(value = "/private", method = RequestMethod.GET)
    public ResponseEntity<String> getPrivate() {
        return ResponseEntity.ok("Boa!");
    }

    @GetMapping(path = "/logout")
	public String logout(HttpServletRequest request) throws ServletException {
		request.logout();
		return "/";
	}
}