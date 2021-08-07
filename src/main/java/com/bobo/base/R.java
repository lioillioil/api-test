package com.bobo.base;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 响应信息主体
 *
 * @param <T> 数据实体
 * @author lilibo
 * @date 2019/8/26
 */
@Builder
@ToString
@Accessors(chain = true)
@AllArgsConstructor
public class R<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 成功标记
	 */
	private static final Integer SUCCESS = 0;

	/**
	 * 失败标记
	 */
	private static final Integer FAIL = 1;

	@Getter
	@Setter
	private int code = SUCCESS;

	@Getter
	@Setter
	private String msg = "success";

	@Getter
	@Setter
	private T data;

	public R() {
		super();
	}

	public R(T data) {
		super();
		this.data = data;
	}

	public R(T data, String msg) {
		super();
		this.data = data;
		this.msg = msg;
	}

	public R(Throwable e) {
		super();
		this.msg = e.getMessage();
		this.code = FAIL;
	}

}
