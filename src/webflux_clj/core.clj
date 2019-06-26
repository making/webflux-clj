(ns webflux-clj.core
  (:gen-class)
  (:import 
         (java.time Duration)
         (reactor.netty.http.server HttpServer)
         (org.springframework.http.server.reactive HttpHandler ReactorHttpHandlerAdapter)
         (org.springframework.web.reactive.function.server HandlerFunction HandlerStrategies RouterFunction RouterFunctions ServerResponse)
         ))

(defn function [f] (reify java.util.function.Function (apply [_ x] (f x))))
(defn consumer [f] (reify java.util.function.Consumer (accept [_ x] (f x))))
(defn handler [f] (reify org.springframework.web.reactive.function.server.HandlerFunction (handle [_ request] (f request))))

(defmacro routes [& body] 
  `(.. RouterFunctions route 
                   ~@body 
                   (build)))

(defn http-server [routes]
  (let [port (System/getenv "PORT")]
    (-> (HttpServer/create) 
      (.host "0.0.0.0")
      (.port (if port (Integer/parseInt port) 8080))
      (.handle (ReactorHttpHandlerAdapter. (RouterFunctions/toHttpHandler routes (-> (HandlerStrategies/builder) (.build))))))))

(defn r []
  (routes 
    (GET "/" (handler (fn [req] (-> (ServerResponse/ok) (.syncBody "Hello GET!!")))))
    (POST "/" (handler (fn [req] (-> (ServerResponse/ok) (.syncBody "Hello POST!!")))))))

(defn -main
  [& args]
  (let [begin (System/currentTimeMillis) 
        server (http-server (r))]
    (. server bindUntilJavaShutdown 
      (Duration/ofSeconds 30) 
      (consumer (fn [_] (println "Started in" (/ (- (System/currentTimeMillis) begin) 1000.0) "seconds"))))))
