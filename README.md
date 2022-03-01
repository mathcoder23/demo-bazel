# 说明
> 此项目是关于Bazel相关demo工程的指南

# Bazel是什么
官网介绍：https://bazel.build/

# Bazel安装
https://bazel.build/install

# 示例工程

## 准备源码与环境
```shell
git clone git@github.com:mathcoder23/demo-bazel.git
cd demo-bazel
```

## java-helloworld
> 能够使用bazel构建最基础的java程序

### 命令行运行
```
cd java-heloworld
bazel run :HelloWorld
```
> 参考官方示例：https://github.com/bazelbuild/examples/tree/main/java-tutorial

#### 学习目标：
- 理解Bazel工程是由WORKSPACE、BUILD文件构成
- 理解bazel的run命令是用于运行BUILD文件中定义的target
- 理解在bazel run之后会在工作目录创建bazel-*的缓存

### IDEA-CE版运行
> IDEA与bazel命令行构建的本质没有区别，只是两者的职责不同，bazel基于自身的构建规则对java工程进行构建，而IDEA的职责是java代码开发的过程。bazel插件做的事情就是两者进行转换。
- 安装IDEA的bazel插件，直接在pulgin中搜索bazel，安装第一个即可
- 通过IDEA导入工程，直接运行BUILD中的HelloWorld

## java-maven
> 集成基于maven仓库的java开发实践

### 运行
```shel 
cd java-maven
bazel run :java-maven
bazel run :tests
```
> 参考官方示例：https://github.com/bazelbuild/examples/tree/main/java-maven

#### 学习目标：
- 理解maven如何通过在WORKSPACE、BUILD中引用、使用、构建
- 理解多个target(run的目标)的使用

## java-guice
> 基于java-maven的理解，新增guice框架的maven依赖，因此此项的侧重点将会是Guice框架，而非bazel了。

### 运行
```shel 
cd java-guice
bazel run :java-guice
```

#### 学习目标：
- 理解guice框架的使用
- 理解如何新增guice依赖

## java-grpc
> 基于bazel的grpc实践

### 运行
```shel 
cd java-grpc
bazel run :hello-world-client
bazel run :hello-world-server
```
> 参考grpc示例：https://github.com/grpc/grpc-java/tree/master/examples

#### 学习目标：
- 理解如何在bazel中引入grpc，难点在于
- 难点在于示例中WORKSPACE对grpc的bzl文件使用的是相对地址，在其他工程引入是需要特殊修改，具体参见WORKSPACE的代码