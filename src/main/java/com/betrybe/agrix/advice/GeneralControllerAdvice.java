package com.betrybe.agrix.advice;

import com.betrybe.agrix.exception.FarmNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * GeneralControllerAdvice class.
 */
@ControllerAdvice
public class GeneralControllerAdvice {

  @ExceptionHandler(FarmNotFoundException.class)
  @ResponseBody
  public ResponseEntity<String> handleFarmNotFoundException(FarmNotFoundException exception) {
    return new ResponseEntity<>("Fazenda não encontrada!", HttpStatus.NOT_FOUND);
  }

  @ExceptionHandler(Exception.class)
  @ResponseBody
  public ResponseEntity<String> handleException(Exception exception) {
    return new ResponseEntity<>("Erro interno!", HttpStatus.INTERNAL_SERVER_ERROR);
  }
}
