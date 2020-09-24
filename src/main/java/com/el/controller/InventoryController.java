package com.el.controller;

import com.el.pojo.Adjustment;
import com.el.pojo.OutPutMsg;
import com.el.serivce.InventoryService;
import com.jdedwards.system.connector.dynamic.ApplicationException;
import com.jdedwards.system.connector.dynamic.Connector;
import com.jdedwards.system.connector.dynamic.SystemException;
import com.jdedwards.system.connector.dynamic.callmethod.BSFNExecutionWarning;
import com.jdedwards.system.connector.dynamic.callmethod.ExecutableMethod;
import com.jdedwards.system.connector.dynamic.spec.SpecFailureException;
import com.jdedwards.system.connector.dynamic.spec.source.BSFNMethod;
import com.jdedwards.system.connector.dynamic.spec.source.BSFNSpecSource;
import com.jdedwards.system.connector.dynamic.spec.source.OneworldBSFNSpecSource;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Alan on 2020/9/22 9:27
 */

@Controller
//@RestController
@RequestMapping("/inventory")
@Api(tags = "库存相关")
public class InventoryController {

    @Autowired(required=false)
    private InventoryService inventoryService;

    @PostMapping("/Adjustment")
    @ApiOperation(value="库存调整",notes="库存调整接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name="erpDocId",value="年月，格式为：201801",dataType="String", paramType = "query"),
            @ApiImplicitParam(name="wmsDocId",value="页码",dataType="String", paramType = "query"),
            @ApiImplicitParam(name="warehouseCode",value="每页条数",dataType="String", paramType = "query"),
            @ApiImplicitParam(name="orderType",value="业务员名称",dataType="String", paramType = "query"),
            @ApiImplicitParam(name="supplierCode",value="排序类型",dataType="String", paramType = "query"),
    })
    public OutPutMsg inventoryAdjustment(@RequestBody Adjustment adjustment) {
        OutPutMsg msg=null;
        int sessionID =0;

        BSFNSpecSource specSource = null;
        try {
            // Step 1: Login
         sessionID = Connector.getInstance().login("ELHAITAO", "ELHAITAO", "JPY920", "*ALL");
        System.out.println("SessionID--->" + sessionID);
        // Pre-condition: create the SpecDictionary or BSFNSpecSource

            specSource = new OneworldBSFNSpecSource(sessionID);


        // Step 2: Lookup the BSFN method from SpecDictionary or BSFNSpecSource
        BSFNMethod bsfnMethod = (BSFNMethod) specSource.getBSFNMethod("GetEffectiveAddress");
        //System.out.println(specSource.getSpec("F0101")+"DDD");
        // Step 3: create the executable method from the BSFN metadata
        ExecutableMethod addressbook = bsfnMethod.createExecutable();


            // Step 4: Set parameter values
            addressbook.setValue("mnAddressNumber", "80001875");

            // Step 5: Execute the business function
            BSFNExecutionWarning warning = addressbook.execute(sessionID);

            // Step 6: Get return parameter values
            System.out.println("szNamealpha= " + addressbook.getValueString("szNamealpha"));
            System.out.println("mnAddressNumber= " + addressbook.getValueString("mnAddressNumber"));
        } catch (SystemException e) {
            // SystemException is thrown when system crash, this is a fatal
            // error and must be caught
            System.exit(1);
        } catch (ApplicationException e) {
            // ApplicationException is thrown when business function
            // execution fail, this is RuntimeException and thus can be
            // unchecked. But it is strongly recommend to catch this
            // exception
        } finally {
            // Log off and shut down connector if necessary
            Connector.getInstance().logoff(sessionID);
            Connector.getInstance().shutDown();
        }

        return msg;
    }


}
