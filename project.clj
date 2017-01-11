(defproject stringcalc "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [expectations "2.0.9"]
                 [proto-repl "0.3.1"]
                 [proto-repl-charts "0.3.1"]
                 [org.clojure/math.numeric-tower "0.0.4"]
                 [spyscope "0.1.5"]]
  :plugins      [[lein-autoexpect "1.9.0"]]

  :profiles
  {:dev {:source-paths ["dev" "src" "test"]
         :dependencies [[org.clojure/tools.namespace "0.2.11"]
                        [spyscope "0.1.5"]]}})
