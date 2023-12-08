package io.mohajistudio.tangerine.prototype;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Tag(name = "Test", description = "테스트 API")
@Controller
@AllArgsConstructor
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String getRoot() {
        return "Hello World";
    }

    @GetMapping("/login/kakao")
    public String getKakaoLogin() {
        return "redirect:/oauth2/authorization/kakao";
    }

    @GetMapping("/secured/home")
    @ResponseBody
    public String getSecuredHome() {
        return "Here is secured home";
    }
}
