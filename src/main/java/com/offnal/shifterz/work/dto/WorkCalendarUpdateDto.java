package com.offnal.shifterz.work.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Map;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "특정 연/월에 해당하는 근무일정 수정 요청 DTO")
public class WorkCalendarUpdateDto {

    @Valid
    @NotNull
    @NotEmpty(message = "근무일 정보는 필수입니다.")
    @Schema(description = "근무표(날짜별 근무타입)")
    private Map<String, String> shifts;

}
