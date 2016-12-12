(ns stringcalc.core)

(defn- string->number [string]
  (map read-string (clojure.string/split string #"(,|\n)")))



(defn sum-a-string
  "add two numbers separated by a comma"
  [string]
  (if (empty? string)
    0
    (reduce + (string->number string))))

