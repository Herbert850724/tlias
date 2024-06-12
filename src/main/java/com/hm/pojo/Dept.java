package com.hm.pojo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(title = "部門實體類")
public class Dept {
    @Id
    private Integer id;
    @Schema(title = "名稱")
    private String name;
    @Schema(title = "創建時間")
    private LocalDateTime createTime;
    @Schema(title = "修改時間")
    private LocalDateTime updateTime;
}
