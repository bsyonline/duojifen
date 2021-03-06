package com.alipay.api.response;

import com.alipay.api.AlipayResponse;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ALIPAY API: koubei.marketing.data.customreport.save response.
 * 
 * @author auto create
 * @since 1.0, 2016-12-05 17:13:15
 */
public class KoubeiMarketingDataCustomreportSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 2197533511794383687L;

	/** 
	 * 自定义报表的规则ID
	 */
	@ApiField("condition_key")
	private String conditionKey;

	public void setConditionKey(String conditionKey) {
		this.conditionKey = conditionKey;
	}
	public String getConditionKey( ) {
		return this.conditionKey;
	}

}
