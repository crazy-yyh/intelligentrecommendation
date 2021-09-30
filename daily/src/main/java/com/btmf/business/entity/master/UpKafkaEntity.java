package com.btmf.business.entity.master;

import io.swagger.models.auth.In;
import lombok.Data;

import java.util.List;

@Data
public class UpKafkaEntity {

    private Integer customerId;

    private List<Integer> productIds;

    private String marketRecommendDesc;

    private Integer UserId;

    private String orderType = "2";

    private String orderSource = "5";

    private String marketName ="产品营销";
}
