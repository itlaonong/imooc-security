# 慕课网《Spring Security开发安全的REST服务》课程代码

本代码库为跟随课程学习所写，属于学习笔记。尽量贴近课程内容，部分细节因环境不同，会有些许差异。

主要不同：

1. 代码结构，课程中parent项目与其他项目同级，本代码库采用父子文件夹形式

2. 本代码库mysql数据库为mysql8版本，故驱动做了升级。

3. 课程中一开始引入了redis，但是未交代启动redis以及配置redis的步骤，默认需要本地启动redis，否则会启动报错

4. 前面几节课的代码中我将UserController的包弄错了，和老师的不一样，后面的代码调整过来了。

5. 课程3-7和3-8的标题应该是弄反了。 

6. 引入wiremock运行异常```java.lang.ClassNotFoundException: org.apache.http.HttpEntity```，增加了httpclient依赖


## 2021-01-29

QQ登陆部分，因为没有申请QQ互联应用，无法测试代码。仓库中QQ登陆的appId和appSecret是从[imooc-SpringSecurity](https://github.com/Mr-zhango/imooc-SpringSecurity/blob/master/imooc-security-demo/src/main/resources/application.properties) 项目中复制而来，但是并不能正常使用。