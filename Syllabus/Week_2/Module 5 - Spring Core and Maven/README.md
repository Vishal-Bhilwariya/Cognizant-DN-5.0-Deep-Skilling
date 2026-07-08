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
| 3 | @Component | 🔜 Notes coming soon |

---

## Interview Questions
- Spring Framework & Maven related Q&A
