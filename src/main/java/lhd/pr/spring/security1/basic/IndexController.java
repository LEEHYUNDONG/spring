package lhd.pr.spring.security1.basic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : lhd
 * @packageName : lhd.pr.spring.security1.basic
 * @fileName : spring
 * @description :
 * <p>
 * ====================================================
 * DATE            AUTHOR              NOTE
 * ====================================================
 * 2024-08-19         lhd
 */

@RestController
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
