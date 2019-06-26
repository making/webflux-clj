# webflux-clj

Spring WebFlux.fn in Clojure

```
brew install leiningen
```

## Usage

```
brew install leiningen
```


### Repl

```
lein repl
```

```lisp
(def disposable (let [server (http-server 
                 (routes 
                   (GET "/" (handler (fn [req] (-> (ServerResponse/ok) (.syncBody "Hello GET!!")))))
                   (POST "/" (handler (fn [req] (-> (ServerResponse/ok) (.syncBody "Hello POST!!")))))))]
    (.bindNow server)))

; curl localhost:8080

(.disposeNow disposable)
```

### Run

```
lein run
```

### Create a uberjar


```
lein uberjar
java -jar target/uberjar/webflux-clj-0.1.0-SNAPSHOT-standalone.jar 
```

## License

Copyright © 2019 FIXME

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
