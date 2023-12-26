package io.mohajistudio.tangerine.prototype.domain.post.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.locationtech.jts.geom.Point;

@Getter
@Setter
public class PlaceDTO {
    @NotNull
    @Schema(description = "Place Id", example = "1")
    private Long id;

    @Getter
    @Setter
    @Schema(name = "PlaceDTO.Details", description = "장소 블럭을 추가할 때 사용할 DTO")
    public static class Details extends PlaceDTO {
        @Schema(description = "장소명", example = "강남대학교")
        private String name;
        @Schema(description = "좌표")
        private Point coordinates;
        @Schema(description = "썸네일", example = "https://thumbnail.com")
        private String thumbnail;
        @Schema(description = "구 주소", example = "구갈동 111")
        private String address;
        @Schema(description = "도로명주소", example = "경기 용인시 기흥구 강남로 40 강남대학교")
        private String roadAddress;
        @Schema(description = "장소 설명", example = "개발팀이 재학중인 학교")
        private String description;
    }

    @Getter
    @Schema(name = "PlaceDTO.Add", description = "장소 블럭을 추가할 때 사용할 DTO")
    public static class Add extends PlaceDTO {
    }


    
}
