(defproject webflux-clj "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [
    [org.clojure/clojure "1.10.1"]
    [am.ik.yavi/yavi "0.2.2"]
    [ch.qos.logback/logback-classic "1.2.3"]
    [ch.qos.logback/logback-core "1.2.3"]
    [com.fasterxml.jackson.core/jackson-annotations "2.9.0"]
    [com.fasterxml.jackson.core/jackson-core "2.9.9"]
    [com.fasterxml.jackson.core/jackson-databind "2.9.9"]
    [com.fasterxml.jackson.datatype/jackson-datatype-jsr310 "2.9.9"]
    [io.netty/netty-buffer "4.1.36.Final"]
    [io.netty/netty-codec-http2 "4.1.36.Final"]
    [io.netty/netty-codec-http "4.1.36.Final"]
    [io.netty/netty-codec-socks "4.1.36.Final"]
    [io.netty/netty-codec "4.1.36.Final"]
    [io.netty/netty-common "4.1.36.Final"]
    [io.netty/netty-handler-proxy "4.1.36.Final"]
    [io.netty/netty-handler "4.1.36.Final"]
    [io.netty/netty-resolver "4.1.36.Final"]
    [io.netty/netty-transport-native-epoll "4.1.36.Final"]
    [io.netty/netty-transport-native-unix-common "4.1.36.Final"]
    [io.netty/netty-transport "4.1.36.Final"]
    [io.projectreactor.netty/reactor-netty "0.9.0.M2"]
    [io.projectreactor/reactor-core "3.3.0.M2"]
    [org.reactivestreams/reactive-streams "1.0.2"]
    [org.slf4j/slf4j-api "1.7.26"]
    [org.springframework/spring-aop "5.2.0.M3"]
    [org.springframework/spring-beans "5.2.0.M3"]
    [org.springframework/spring-context "5.2.0.M3"]
    [org.springframework/spring-core "5.2.0.M3"]
    [org.springframework/spring-expression "5.2.0.M3"]
    [org.springframework/spring-jcl "5.2.0.M3"]
    [org.springframework/spring-web "5.2.0.M3"]
    [org.springframework/spring-webflux "5.2.0.M3"]
  ]
  :repositories [
    ["spring-snapshots" {:url "https://repo.spring.io/snapshot" :snapshots true}]
    ["spring-milestones" {:url "https://repo.spring.io/milestone" :snapshots false}]
  ]
  :main ^:skip-aot webflux-clj.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
