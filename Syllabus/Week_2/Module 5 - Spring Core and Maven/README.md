# Module 5 – Spring Core and Maven

---

## a) Introduction to Spring Framework

| # | Topic | Description |
|---|-------|-------------|
| a | Introduction to Spring Framework | Open-source Java framework with pre-built features to reduce boilerplate code. Problems it solves: Too Much Boilerplate Code, Tight Coupling, Difficult Testing, Difficult Maintenance, Poor Reusability. Spring vs Traditional Java comparison. Analogy: restaurant — you order food, Spring handles everything else. Spring Modules: Core, IoC, AOP, Data Access, ORM, MVC, Boot. |

---

## b) Setting up a Spring Project with Maven

| # | Topic | Description |
|---|-------|-------------|
| 1 | Introduction to Maven Build Tool | Build = converting source code into runnable form. Build Tool = automates compiling, dependency management, testing, packaging. Maven uses `pom.xml` (Project Object Model). Problems solved: Manual Library Management, Dependency Conflicts, Manual Build Process, No Standard Structure. Maven workflow: pom.xml → Download Libraries → Compile → Run Tests → Package. Key commands: `mvn compile`, `mvn package`. |
| 2 | Creating a New Maven Project | Maven Project = Java Project + Maven. Standard directory structure: `src/main/java` (source), `src/main/resources` (XML, properties), `src/test/java` (test classes), `target` (compiled output, JAR/WAR). `pom.xml` is the heart of the project — contains project config, dependencies, build settings. Steps: File → New → Maven Project → Enter details (Name, Location, JDK, Build System). |
| 3 | Adding Spring Dependencies in pom.xml | Dependency = external library the project needs. Tags: `<dependencies>` (all libs), `<dependency>` (single lib), `<groupId>` (organization), `<artifactId>` (specific module), `<version>` (version number). Example: `spring-context` v6.1.10. After saving: Maven reads → checks local repo → downloads if missing → adds to project. |
| 4 | Configuring Maven | Configuring Maven = telling Maven which libraries, Java version, and build settings to use — all inside `pom.xml`. Java version config: `<maven.compiler.source>` and `<maven.compiler.target>` tags. Dependency config: `<dependencies>` section. |

---

## c) Spring IoC Container

| # | Topic | Description |
|---|-------|-------------|
| 1 | Understanding the IoC Container | Control = responsibility of creating/managing objects. Inversion = reversed. IoC = Spring takes over object creation from the developer. Container = place where objects are stored and managed. IoC Container responsibilities: Create, Store, Manage, Provide, Destroy objects (Beans). Analogy: HR Department manages employees so the company owner doesn't have to. |
| 2 | Configuring the Spring IoC Container using XML | XML = markup language for storing configuration (not business logic). XML Configuration = writing instructions in `beans.xml` to tell Spring which Beans to create. `beans.xml` stored in `src/main/resources`. Structure: `<beans>` root tag → `<bean id="..." class="...">` for each class. `<property>` tag injects values. Spring internally calls setters based on XML config. |
| 3 | Defining Beans and their Dependencies | Bean = Java object created and managed by Spring IoC Container. Without Spring: manual `new` for every object. With Spring: Spring creates and provides Beans. Define beans in XML using `<bean id="..." class="..."/>`. Dependency = what a class needs (e.g., `Car` needs `Engine`). Spring automatically provides the dependency Bean to the dependent Bean. |
| 4 | ApplicationContext | ApplicationContext = full-featured implementation of the Spring IoC Container. Responsibilities: Create, Manage, Provide Beans. Creation: `new ClassPathXmlApplicationContext("beans.xml")`. Retrieve Bean: `context.getBean("beanId", ClassName.class)` — no `new` needed. Startup flow: App starts → reads beans.xml → creates all Beans → stores them → returns on request. Supports events, internationalization, resource loading. |
| 5 | BeanFactory | BeanFactory = simplest/basic Spring IoC Container. Key feature: Lazy Loading — Beans are created only when `getBean()` is called, not at startup. Memory efficient. Creation (older style): `new XmlBeanFactory(new ClassPathResource("beans.xml"))`. Suitable for lightweight applications. BeanFactory vs ApplicationContext: BeanFactory is basic + lazy; ApplicationContext is full-featured + eager. |

---

## d) Spring Bean Configuration

| # | Topic | Description |
|---|-------|-------------|
| 1 | Using Annotations for Bean Configuration | Annotation = special marker starting with `@` that provides metadata to the framework. Problem with XML: 500 classes = 500 `<bean>` entries in XML — hard to maintain. Solution: `@Component` on a class tells Spring to create a Bean automatically. Common annotations: `@Component` (general), `@Service` (business logic), `@Repository` (DB layer), `@Controller` (web), `@Configuration` (config class), `@Bean` (manual bean declaration). XML vs Annotation: XML = external config, older style; Annotation = inline config, modern style preferred in Spring Boot. |
| 2 | Component Scanning | Process where Spring automatically searches packages for annotated classes and creates Beans for them. Spring scans packages and registers any class marked with `@Component` (or similar) as a Bean. Configured using `@ComponentScan("com.demo")` on a `@Configuration` class. Analogy: staff walking through classrooms registering anyone wearing a Teacher ID Card. Eliminates large XML files, faster development, cleaner project structure. |
| 3 | @Component | General-purpose stereotype annotation. Marks a class as a Spring-managed Bean. Spring detects it during component scanning and registers it in the IoC container. |
| 4 | @Service Annotation | Specialization of `@Component` for the service/business logic layer. Semantically meaningful — tells developers this class holds business logic. Functionally same as `@Component` but improves readability and layer separation. |
| 5 | @Repository Annotations | Specialization of `@Component` for the data access/persistence layer (DAO). Adds automatic exception translation — converts DB-specific exceptions into Spring's `DataAccessException`. |
| 6 | @Controller | Specialization of `@Component` for the web/presentation layer in Spring MVC. Marks a class as a web request handler. Works with `@RequestMapping` to map URLs to methods. |
| 7 | Java-based Configuration using @Configuration | `@Configuration` marks a class as a source of Bean definitions (replaces XML). `@Bean` on a method tells Spring to manage the returned object as a Bean. Pure Java config — no XML needed. |
| 8 | Mixing XML and Java-based Configurations | Both XML and Java config can coexist in the same project. Use `@ImportResource("classpath:beans.xml")` in a `@Configuration` class to import XML beans into Java config. Useful when migrating legacy XML projects to annotation-based config gradually. |

---

## e) Dependency Injection in Spring

| # | Topic | Description |
|---|-------|-------------|
| 1 | Introduction to Dependency Injection (DI) | DI = providing dependencies to a class from outside instead of creating them inside. Implements DIP. Types: Constructor Injection, Setter Injection, Field Injection. Benefits: Loose Coupling, Easy Testing, Better Maintainability. |
| 2 | Constructor Injection | Dependencies are injected via the class constructor. Use `@Autowired` on constructor (optional in Spring 4.3+ if single constructor). Preferred for mandatory dependencies — ensures object is fully initialized. |
| 3 | Setter Injection | Dependencies are injected via setter methods. Use `@Autowired` on setter method. Preferred for optional dependencies — object can be created without the dependency. |
| 4 | Autowiring Dependencies (@Autowired) | `@Autowired` tells Spring to automatically inject the matching Bean. Can be applied on constructor, setter, or field. Spring matches by type by default. Throws `NoSuchBeanDefinitionException` if no matching Bean found. |
| 5 | Qualifiers for Resolving Autowiring Conflicts (@Qualifier) | Problem: multiple Beans of the same type — Spring doesn't know which to inject. Solution: `@Qualifier("beanName")` alongside `@Autowired` to specify exact Bean. Example: two implementations of `PaymentService` — `@Qualifier("upiService")` picks the right one. |
| 6 | Using @Resource and @Inject Annotations | `@Resource` (javax/jakarta) — injects by name first, then by type. `@Inject` (javax/jakarta) — similar to `@Autowired` but from Java standard (JSR-330). Both are alternatives to `@Autowired` for framework-independent code. |

---

## f) Spring AOP (Aspect-Oriented Programming)

| # | Topic | Description |
|---|-------|-------------|
| 1 | Introduction to AOP | AOP = separating cross-cutting concerns (logging, security, transactions) from business logic. Core concepts: Aspect (module of cross-cutting concern), Advice (action taken — Before, After, Around), JoinPoint (point in execution — method call), Pointcut (expression selecting which JoinPoints to intercept), Weaving (applying aspects to target objects). Analogy: security guard at office entrance — checks everyone without changing their work. |

---

## Interview Questions
- Spring Framework & Maven related Q&A
