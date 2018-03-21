/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AnnotationTest;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * test注解
 * @author lys
 */
@Target(ElementType.METHOD)//作用：用于描述注解的使用范围（被描述的注解用在什么地方）
@Retention(value=RetentionPolicy.RUNTIME)//作用：表示需要在什么级别保存该注释信息，用于描述注解的生命周期（即：被描述的注解在什么范围内有效）
@Documented//标记注解，作用：把注解包含在javadoc中
public @interface TestAnnotation {
    
    public int id() default -1;
    
    public String name() default "";
    
    public String code() default "32333";
    
}
