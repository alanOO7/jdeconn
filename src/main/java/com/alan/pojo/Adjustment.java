package com.alan.pojo;

import java.util.List;

/**
 * Created by Alan on 2020/9/22 9:44
 */

public class Adjustment {
    private String erpDocId;

    private String wmsDocId;

    private String warehouseCode;

    private String orderType;

    private int supplierCode;

    private String completedDate;

    private String businessType;

    private String reqDepartment;

    private String carrierName;

    private String trackingNo;

    private String comments;

    private String signStr;

    private String sign;

    private int totalLines;

    private List<Details> details;

    public void setErpDocId(String erpDocId){
        this.erpDocId = erpDocId;
    }
    public String getErpDocId(){
        return this.erpDocId;
    }
    public void setWmsDocId(String wmsDocId){
        this.wmsDocId = wmsDocId;
    }
    public String getWmsDocId(){
        return this.wmsDocId;
    }
    public void setWarehouseCode(String warehouseCode){
        this.warehouseCode = warehouseCode;
    }
    public String getWarehouseCode(){
        return this.warehouseCode;
    }
    public void setOrderType(String orderType){
        this.orderType = orderType;
    }
    public String getOrderType(){
        return this.orderType;
    }
    public void setSupplierCode(int supplierCode){
        this.supplierCode = supplierCode;
    }
    public int getSupplierCode(){
        return this.supplierCode;
    }
    public void setCompletedDate(String completedDate){
        this.completedDate = completedDate;
    }
    public String getCompletedDate(){
        return this.completedDate;
    }
    public void setBusinessType(String businessType){
        this.businessType = businessType;
    }
    public String getBusinessType(){
        return this.businessType;
    }
    public void setReqDepartment(String reqDepartment){
        this.reqDepartment = reqDepartment;
    }
    public String getReqDepartment(){
        return this.reqDepartment;
    }
    public void setCarrierName(String carrierName){
        this.carrierName = carrierName;
    }
    public String getCarrierName(){
        return this.carrierName;
    }
    public void setTrackingNo(String trackingNo){
        this.trackingNo = trackingNo;
    }
    public String getTrackingNo(){
        return this.trackingNo;
    }
    public void setComments(String comments){
        this.comments = comments;
    }
    public String getComments(){
        return this.comments;
    }
    public void setSignStr(String signStr){
        this.signStr = signStr;
    }
    public String getSignStr(){
        return this.signStr;
    }
    public void setSign(String sign){
        this.sign = sign;
    }
    public String getSign(){
        return this.sign;
    }
    public void setTotalLines(int totalLines){
        this.totalLines = totalLines;
    }
    public int getTotalLines(){
        return this.totalLines;
    }
    public void setDetails(List<Details> details){
        this.details = details;
    }
    public List<Details> getDetails(){
        return this.details;
    }
}
