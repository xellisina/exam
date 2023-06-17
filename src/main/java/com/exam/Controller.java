package com.exam;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Api(value = "/controller")
@RequestMapping("/controller")
public class Controller {
    private final Service service;

    @ApiOperation(value = "randomNum")
    @PostMapping("/randomNum")
    public Long randomNum(@RequestBody Nums nums){
        return service.findRandomNum(nums);
    }
}

