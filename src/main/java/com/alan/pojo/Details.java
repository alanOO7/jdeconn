package com.alan.pojo;

/**
 * Created by Alan on 2020/9/22 9:37
 */
public class Details {
    private int orderLine;

    private String productNo;

    private String jdeUom;

    private int quantity;

    private String productDate;

    private String expiredDate;

    private String location;

    private String lot;

    private String comment1;

    private String mcu;

    private String txt1;

    private String txt2;

    private String txt3;

    public void setOrderLine(int orderLine){
        this.orderLine = orderLine;
    }
    public int getOrderLine(){
        return this.orderLine;
    }
    public void setProductNo(String productNo){
        this.productNo = productNo;
    }
    public String getProductNo(){
        return this.productNo;
    }
    public void setJdeUom(String jdeUom){
        this.jdeUom = jdeUom;
    }
    public String getJdeUom(){
        return this.jdeUom;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public void setProductDate(String productDate){
        this.productDate = productDate;
    }
    public String getProductDate(){
        return this.productDate;
    }
    public void setExpiredDate(String expiredDate){
        this.expiredDate = expiredDate;
    }
    public String getExpiredDate(){
        return this.expiredDate;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public String getLocation(){
        return this.location;
    }
    public void setLot(String lot){
        this.lot = lot;
    }
    public String getLot(){
        return this.lot;
    }
    public void setComment1(String comment1){
        this.comment1 = comment1;
    }
    public String getComment1(){
        return this.comment1;
    }
    public void setMcu(String mcu){
        this.mcu = mcu;
    }
    public String getMcu(){
        return this.mcu;
    }
    public void setTxt1(String txt1){
        this.txt1 = txt1;
    }
    public String getTxt1(){
        return this.txt1;
    }
    public void setTxt2(String txt2){
        this.txt2 = txt2;
    }
    public String getTxt2(){
        return this.txt2;
    }
    public void setTxt3(String txt3){
        this.txt3 = txt3;
    }
    public String getTxt3(){
        return this.txt3;
    }
}
