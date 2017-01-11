(ns stringcalc.core
  (:require [clojure.math.numeric-tower :as math]))



; flatten
(defn flatit [col]
    (loop [srccol col flatcol []]
      (if (empty? srccol)
        flatcol
           (if (seq? (first srccol))
              (first srccol (conj flatcol (flatit (first srccol)))) 
              (recur (rest srccol) (conj flatcol (first srccol)))))))



