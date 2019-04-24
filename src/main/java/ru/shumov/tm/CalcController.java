package ru.shumov.tm;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calc")
public class CalcController {

    @PostMapping("/sum")
    public Integer sum (
            @PathVariable("a") Integer a,
            @PathVariable("b") Integer b

    ) {

        return  a+b;
    }

    @GetMapping("/calc/{a}/{b}")
    public Integer calc (
            @PathVariable("a") Integer a,
            @PathVariable("b") Integer b

    ) {

        return  a+b;
    }


    @GetMapping("/test")
    public Integer test (
            @PathVariable("a") Integer a,
            @PathVariable("b") Integer b

    ) {
        return  a+b;
    }


}
