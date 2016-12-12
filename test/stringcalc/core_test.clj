(ns stringcalc.core-test
  (:require [expectations :refer :all]
            [stringcalc.core :refer :all]))

;; expect zero for empty string
(expect 0 (sum-a-string ""))

;; a single digit should return itself
(expect 1 (sum-a-string "1"))

;; two numbers separated by comma should be added
(expect 3 (sum-a-string "1,2"))

;; any amount of comma separated numbers should be summed
(expect  15 (sum-a-string "1,2,3,4,5"))

;; newline characters instead of commas allowed
(expect 15 (sum-a-string "1,2\n3\n4,5"))
