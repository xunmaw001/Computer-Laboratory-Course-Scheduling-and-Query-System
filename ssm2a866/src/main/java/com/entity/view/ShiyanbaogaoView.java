package com.entity.view;

import com.entity.ShiyanbaogaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 实验报告
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-11 12:02:42
 */
@TableName("shiyanbaogao")
public class ShiyanbaogaoView  extends ShiyanbaogaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShiyanbaogaoView(){
	}
 
 	public ShiyanbaogaoView(ShiyanbaogaoEntity shiyanbaogaoEntity){
 	try {
			BeanUtils.copyProperties(this, shiyanbaogaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
