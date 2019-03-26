package com.winter.enumerate;

public enum BusinessTypeEnum {
	GIRL(1);
	private Integer code;

	BusinessTypeEnum(Integer code) {
		this.code = code;
	}

	public Integer getCode() {
		return this.code;
	}

	public static BusinessTypeEnum valueOf(Integer value) {
		for (BusinessTypeEnum e : BusinessTypeEnum.values()) {
			if (e.getCode() == value) {
				return e;
			}
		}
		return null;
	}
}