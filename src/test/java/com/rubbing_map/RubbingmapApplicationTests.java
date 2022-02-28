package com.rubbing_map;

import cn.hutool.core.lang.UUID;
import com.rubbing_map.common.dto.LoginDto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RubbingmapApplicationTests {
    @Test
    void contextLoads() {
//        LoginDto loginDto = new LoginDto();
//        long times1 = loginDto.getNowDate().getTime();
//        long times2 = loginDto.getExpireDate().getTime();
//        System.out.println(times1);
//        System.out.println(times2);
        String uuid = UUID.randomUUID().toString();
        System.out.println(uuid);
        uuid = uuid.replace("-", "");
        System.out.println(uuid);
    }
}
