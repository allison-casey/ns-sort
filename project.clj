(defproject ns-sort "1.0.0"
  :description "Sort :require block in Clojure namespaces"
  :url "http://github.com/ilevd/ns-sort"
  :dependencies [[org.clojure/clojure "1.10.3"]]
  :profiles {:uberjar
             {:aot [ns-sort.core],
              :main ns-sort.core
              :omit-source true,
              :uberjar-name "ns-sort-%s"}}
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :jvm-opts
  ^:replace ["-server"
             "-Xms2048m"
             "-Xmx2048m"
             "-Xss500m"
             "-XX:-OmitStackTraceInFastThrow"])
