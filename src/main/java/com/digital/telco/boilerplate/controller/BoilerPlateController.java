package com.digital.telco.boilerplate.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digital.telco.utility.exception.BaseException;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;

@RestController
@Api(value = "bolier plate code")
@Slf4j
public class BoilerPlateController {

@GetMapping(value="boilerplate")
@ApiOperation(value = "get message for boiler plate code",response = String.class)
@ApiResponses(value= {@ApiResponse(code = 400, message = "Bad request",response = BaseException.class),@ApiResponse(code = 401, message = "Not authorized", response = BaseException.class),
        @ApiResponse(code = 404, message = "Not Found", response = BaseException.class),
        @ApiResponse(code = 403, message = "Forbidden", response = BaseException.class),
        @ApiResponse(code = 500, message = "Technical error", response = BaseException.class)})
public ResponseEntity<String> getMessage(){
	log.info("username is = " + SecurityContextHolder.getContext().getAuthentication().getName());
	return new ResponseEntity<String>("hello boiler plate code", HttpStatus.OK);
	
}
	
}

