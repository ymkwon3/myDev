package com.myDev.first.controller.dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class mainResponseDtoTest {
    @Test
    public void 롬복_기능_테스트() {
        String name = "test";
        int amount = 1000;

        mainResponseDto dto = new mainResponseDto(name, amount);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
