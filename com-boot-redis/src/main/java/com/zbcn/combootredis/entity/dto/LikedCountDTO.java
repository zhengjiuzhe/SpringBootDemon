package com.zbcn.combootredis.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 点赞数量 DTO。用于存储从 Redis 取出来的被点赞数量
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LikedCountDTO implements Serializable {
	private static final long serialVersionUID = -7600798766254895758L;
	private String id;

	private Integer count;

}
