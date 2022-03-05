# FoodMap
## 技术栈：

- SpringBoot
- mybatis plus
- shiro
- Tomcat
- MySql
- redis
- jwt


## 解释：

1. 使用 `SpringBoot` 作为项目整体框架，该框架直接嵌入tomcat，并能配置使用大量的自建库和第三方库，并能够进行定制化配置。
2. 利用`apcha`组织开源的`shrio`框架进行权限管理操作，相较于其他的安全框架，`shrio`极其轻便，并能很好地与`web`应用集成。
3. `Token`设置上使用`JWT`技术进行设置`token`。
5. 数据库使用目前最好的关系型数据库`MySql`并搭配`redis`缓存，实现快速内存读写，及时响应用户数据，并支持分布式、集群式配置。
6. 使用`mybatis-plus`进行数据库简易操作，`mybatis-plus`进行定制化`sql`语句查询以及修改。
