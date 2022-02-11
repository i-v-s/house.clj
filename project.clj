(defproject org.clojars.i-s/house.clj "0.1.0-SNAPSHOT"
  :description "Clickhouse database tools"
  :url "https://github.com/i-v-s/house.clj"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/tools.logging "1.2.1"]]
  :resource-paths ["resources/clickhouse-native-jdbc-shaded-2.6.4.jar"]
  :repl-options {:init-ns house.core}
  :deploy-repositories [["releases" :clojars]
                        ["snapshots" :clojars]])
