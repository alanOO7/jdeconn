package com.el.serivce;

import com.el.pojo.Adjustment;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by Alan on 2020/9/22 10:47
 */

@Service
public class InventoryService {

    public String inventoryAdj(Adjustment adj) {
        return "";
    }
}
