package choi.arthur.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {
    @Value("${order:0}")
    private Long order;

    @GetMapping("/")
    public String indxe() {
        return "hello-- :" + order;
    }
}
