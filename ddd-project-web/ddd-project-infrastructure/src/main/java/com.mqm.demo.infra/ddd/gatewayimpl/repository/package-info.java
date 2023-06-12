/**
 * repository - 资源库的实现,仓储实现本应属于基础层代码，但为了微服务代码拆分和重组的便利性，我们把聚合的仓储实现代码放到了领域层对应的聚合代码包内
 * 基础设施接口放在领域层主要的目的是减少领域层对基础设施层的依赖，接口的设计是不可暴露实现的技术细节，
 * 如不能将拼装的SQL作为参数 gateway对外暴露的是Entity，不能暴露 DO
 */
package com.mqm.demo.infra.ddd.gatewayimpl.repository;