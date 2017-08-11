# 适配器模式

> 适配器模式的意图在，使用不同接口的类所提供的服务是客户端所期望的接口。

## 分类

* 类适配器 【继承】
* 对象适配器 【委托】

## 适配器角色

* Target (对象) 
    * 该角色负责定义所需的方法 （如 ：Restful 接口）
* Client (请求者)
    * Target的需求方 （如 ：Test::main 方法）
* Adaptee (被适配者)
    * 不满足Client的需求，需要被适配 (OldDataApi)
* Adapter (适配者)
    * 使用 Adaptee 方法满足 Target 的要求 (DataApi)