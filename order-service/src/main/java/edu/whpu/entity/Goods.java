package edu.whpu.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {
    private Long goodsId;

    private String goodsName;

    private BigDecimal goodsPrice;

    private String goodsDesc;

}
