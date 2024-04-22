package com.oracle.erpProject.model.slmodel;

import lombok.Data;

@Data
public class SLSale_detail {
	private String s_date; 		//매출일자
	private int cust_no;		//거래처코드
	private int p_itemcode; 	//제품코드
	private int sd_cnt;			//판매수량
	private int sd_price;		//판매가격
	
	
	// 조회용 수불 마감
	private String d_year_month;	// 년월일
	private int d_cubun;					// 수불마감구분
		
	
}