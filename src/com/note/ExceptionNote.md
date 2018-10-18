# 异常为两块

## 1、error	错误 ： 

​	是指程序无法处理的错误，表示应用程序运行时出现的重大错误。例如jvm运行时出现的OutOfMemoryError以及Socket编程时出现的端口占用等程序无法处理的错误。

## 2、Exception 	 异常 ：

异常可分为运行时异常跟编译异常

### 2.1  运行时异常：

​	即RuntimeException及其之类的异常。这类异常在代码编写的时候不会被编译器所检测出来，是可以不需要被捕获，但是程序员也可以根据需要进行捕获抛出。常见的RUNtimeException有：NullpointException（空指针异常），ClassCastException（类型转换异常），IndexOutOfBoundsException（数组越界异常）等。

### 2.2  编译异常：	

​	RuntimeException以外的异常。这类异常在编译时编译器会提示需要捕获，如果不进行捕获则编译错误。常见编译异常有：IOException（流传输异常），SQLException（数据库操作异常）等。

### 2.3  java处理异常的机制：

​	抛出异常以及捕获异常 ，一个方法所能捕捉的异常，一定是Java代码在某处所抛出的异常。简单地说，异常总是先被抛出，后被捕捉的。

### 2.4  throw跟throws的区别:

```java
public void test() throws Exception {
    throw new Exception();
}
```

从上面这一段代码可以明显的看出两者的区别。throws表示一个方法声明可能抛出一个异常，throw表示此处抛出一个已定义的异常（可以是自定义需继承Exception，也可以是java自己给出的异常类）。

### 2.5  如何捕获异常：

​	首先java对于异常捕获使用的是try---catch或try --- catch --- finally 代码块，程序会捕获try代码块里面的代码，若捕获到异常则进行catch代码块处理。若有finally则在catch处理后执行finally里面的代码。然而存在这样两个问题：

- a.看如下代码：

```java
try{
    //待捕获代码
}catch（Exception e）{
    System.out.println("catch is begin");
    return 1 ；
}finally{
     System.out.println("finally is begin");
}
```

在catch里面有一个return，那么finally会不会被执行呢？答案是肯定的，上面代码的执行结果为：

```cmd
catch is begin
finally is begin
```

也就是说会先执行catch里面的代码后执行finally里面的代码最后才return1 ；

- b.看如下代码：

```java
try{
   //待捕获代码
}catch（Exception e）{
    System.out.println("catch is begin");
    return 1 ；
}finally{
     System.out.println("finally is begin");
     return 2 ;
}
```

​	在b代码中输出结果跟a是一样的，然而返回的是return 2 ； 原因很明显，就是执行了finally后已经return了，所以catch里面的return不会被执行到。也就是说finally永远都会在catch的return前被执行。

### 2.6  注意事项

对于异常的捕获不应该觉得方便而将几个异常合成一个Exception进行捕获，比如有IO的异常跟SQL的异常，这样完全不同的两个异常应该分开处理！而且在catch里处理异常的时候不要简单的e.printStackTrace()，而是应该进行详细的处理。比如进行console打印详情或者进行日志记录。

> 注意：异常和错误的区别：异常能被程序本身可以处理，错误是无法处理。