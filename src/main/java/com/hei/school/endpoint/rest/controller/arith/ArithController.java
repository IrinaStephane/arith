package com.hei.school.endpoint.rest.controller.arith;

import com.hei.school.service.arith.AddService;
import com.hei.school.service.arith.DivideService;
import com.hei.school.service.arith.MultiplyService;
import com.hei.school.service.arith.SubtractService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ArithController {

  private final AddService addService;
  private final SubtractService subtractService;
  private final MultiplyService multiplyService;
  private final DivideService divideService;

  @GetMapping("/add")
  public double add(@RequestParam double a, @RequestParam double b) {
    return addService.operate(a, b);
  }

  @GetMapping("/subtract")
  public double subtract(@RequestParam double a, @RequestParam double b) {
    return subtractService.operate(a, b);
  }

  @GetMapping("/multiply")
  public double multiply(@RequestParam double a, @RequestParam double b) {
    return multiplyService.operate(a, b);
  }

  @GetMapping("/divide")
  public double divide(@RequestParam double a, @RequestParam double b) {
    return divideService.operate(a, b);
  }
}
