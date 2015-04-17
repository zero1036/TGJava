TW Project

*******************************************************************************

技术框架

：Jquery Angular Bootstrap JS.SDK
后台MVC：SpringMVC
IoC：Spring
数据库：Mysql
工作流引擎：jBPM
云平台：SAE

类别	技术
前台基础	jQuery、requireJS、JS.SDK
前台MVC	Angular
前台UI	Bootstrap
后台MVC	SpringMVC
Ioc	Spring
工作流引擎	jBPM
数据库	Mysql
云平台	SAE
	


*******************************************************************************

前端框架组件

UC	JS接口
页面模态框	
异常消息alert	
导航菜单	


*******************************************************************************

后端通用组件

UC	接口
日志输出	
AOP拦截	
异常捕捉	
JS注入拦截	


*******************************************************************************

异常代码

代码	内容


*******************************************************************************

规范

数据库
类型	命名	示例
表名	系统表（全小写，sys_起头）:sys_tablename	sys_wxconfig
	其他表（全小写，t_起头）：t_tablename
视图名	全小写，v_起头：v_viewname	v_wxconfig
序列名	全小写，seq_起头：seq_name	
主键	全小写，pk_起头：pk_name	
存储过程	全小写，pr_起头，表名在中间，执行动作在后：pr_tablename_update	
列名	全小写，不带任何符号：userid、createtime	

后端规范
类型	命名	示例
类命名	不允许带符号，词组拼写	

前端规范
类型	命名	示例

*******************************************************************************

数据表设计


序号	字段名称	字段代码	字段类型	字段长度	小数位数	值域	备注
	週期ID	OCID	uniqueidentifier	?	?	GUID，非空	?


*******************************************************************************

分组
对于超级管理员：平台管理员，拥有全部权限；
对于租户：固定只有两个功能组：租户管理员组及租户员工组；

租户管理员组：
1、拥有WA及BC所有后台功能菜单；
2、可以设置员工所属标签；

标签同微信标签一致，系统根据标签控制粒度等级2的功能

权限级别
编号	权限内容	粒度	粒度等级
	微信套件权限	套件应用	1
	通讯录WA菜单	后台菜单	1
	通讯录部门管理BC菜单	后台菜单	1
	通讯录员工管理BC菜单	后台菜单	1


编号	权限内容	粒度	粒度等级
		套件应用	2


*******************************************************************************

微信端及WebApp功能WA

应用	菜单	使用范围	功能范围	描述	数据表	功能接口
通讯录	通讯录	所有员工	WebApp	通讯录面试所有员工，员工查看不设权限；		
				功能列表显示：
				1级分类：常用联系人、部门；
				——2级分类：部门、员工；……如此类推
通告	公司动态	所有员工	WebApp	消息只属于单向消息，没有流程，不能回复，可以设置留言\评论	公司、内部、员工三种消息分开三张表；	
	内部通知				留言表只有一张表；
	员工消息
请假	我要请假	所有员工	WebApp			
	请假记录
	审批
	*我要审批
	*待我审批
						

*******************************************************************************

管理后台功能BC

应用	菜单	使用范围	功能范围	描述	数据表	功能接口
通讯录管理	部门	租户管理员组	WebApp	1、增删改部门		
				2、WA、BC选择部门控件（支持移动端）
				3、移动用户
				4、批量导入
				5、批量导出
通讯录管理	员工	租户管理员组	WebApp	1、增删改员工		
				2、WA、BC选择用户控件（支持移动端）
				3、邀请员工关注功能
						


*******************************************************************************
