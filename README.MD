###Spring框架 通过xml获取对象调用方法
 1.我在考虑为什么要有注解这一说 
 因为我们通过配置文件获取对象并注入属性 所以需要一系列的配置
###Spring框架 自动装配
 1. @Autowired（Resource）
 顾名思义，就是自动装配，其作用是为了消除Java代码里面的getter/setter
 与bean属性中的property。当然，getter看个人需求，如果私有属性需要对外提供的话，应当予以保留。
 2. 这里@Autowired注解的意思就是，
 当Spring发现@Autowired注解时，将自动在代码上下文中找到和其匹配（默认是类型匹配）的Bean，
 并自动注入到相应的地方去 
 3. <context:annotation-config></context:annotation-config> 要告诉spring使用了注解
 ###Spring框架 Component 
 1.Component 注解标识某个类是Bean
 2.<context:component-scan base-package="demo2"></context:component-scan> 
 3.可以减少xml bean的配置 相当于配置文件中的<bean id="" class=""/>
 ###Spring框架 Value 
 value可用在成员变量和set方法上
 ###Spring框架 @Repository、 @Service和@Controller和@Resource结合使用 
 默认情况下，对于包含 name 属性的 @Component、@Repository、 @Service和@Controller，
 会把 name 取值作为 Bean 的名字。如果这个注解不包含 name值或是其他被自定义过滤器发现的组件，
 默认 Bean 名称会是小写开头的非限定类名.
 ###Spring框架 @Repository和@Resource结合使用  
 @Resource :免去<property></property>但还是需要<bean></bean>
 @Repository service controller 免去写<bean></bean> 但不能代替<property></property>功能
 ###Spring框架 
 expected single matching bean but found 2: bookDao1,bookDao2
 异常原因: <bean id="bookDao1" class="demo4.BookDao"></bean> <bean id="bookDao2" class="demo4.BookDao"></bean> 
 解决办法: 1. @Resource(name="bookDao1") 2. @Autowired @Qualifier("bookDao1")
 ###Spring框架 注解配合Junit单元测试
  Spring 测试框架主要解决下面几件事情 不用手动导入 Spring 的配置文件，
  可以使用注解进行 不同手动 getBean 得到 Bean 对象，Bean 对象可以使用@Autowired 来进行自动注入等。 
 不用调用完 DAO 层代码，然后撤销操作影响，Spring 测试框架直接事务回滚
 ###多配置文件