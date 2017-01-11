(ns stringcalc.core-test
  (:require [expectations :refer :all]
            [stringcalc.core :refer :all]))

;; expect zero for empty string
;;(expect 0 (sum-a-string ""))

;; a single digit should return itself
;;(expect 1 (sum-a-string "1"))

;; two numbers separated by comma should be added
;;(expect 3 (sum-a-string "1,2"))

;; any amount of comma separated numbers should be summed
;;(expect  15 (sum-a-string "1,2,3,4,5"))

;; newline characters instead of commas allowed
;;(expect 15 (sum-a-string "1,2\n3\n4,5"))

;;======== penultimate element
;;(expect 4 (penult '(1 2 3 4 5)))
;;(expect "b" (penult ["a" "b" "c"]))
;;(expect [1 2] (penult [[1 2][3 4]]))


;;======== nth element
;;(expect 6 (nth_element '(4 5 6 7) 2))
;;(expect :a (nth_element [:a :b :c] 0))
;;(expect [5 6] (nth_element '([1 2] [3 4] [5 6]) 2))

;;======== count a sequence
;;(expect 5 (s_len '(1 2 3 3 1)))
;;(expect 11 (s_len "Hello World"))
;;(expect 3 (s_len [[1 2] [3 4] [5 6]]))
;;(expect 3 (s_len '(:a :b :c)))

;;======== Find the odd numbers
;;(expect '(1 3 5) (just_odd #{1 2 3 4 5}))
;;(expect '(1) (just_odd [4 2 1 6]))
;;(expect '() (just_odd [2 2 4 6]))
;;(expect '(1 1 1 3) (just_odd [1 1 1 3]))

;;======== Palindrome?
; (expect false (palindrome? '(1 2 3 4 5)))
; (expect true (palindrome? "racecar"))
; (expect true (palindrome? [:foo :bar :foo]))
; (expect true (palindrome? '(1 1 3 3 1 1)))
; (expect false (palindrome? '(:a :b :c)))

;;======== Fibonacci
; (expect '(1 1 2) (fibon 3))
; (expect '(1 1 2 3 5 8) (fibon 6))
; (expect '(1 1 2 3 5 8 13 21) (fibon 8))

;;======== max
; (expect 8 (posintmax 1 8 3 4))
; (expect 30 (posintmax 30 20))
; (expect 67 (posintmax 45 67 11))

;;======== CAPS only from string
; (expect "HLOWRD" (CAPs "HeLlO, WoRlD!"))
; (expect "" (CAPs "nothing"))
; (expect "AZ" (CAPs "$#A(*&987Zf"))

;;======== duplicate each element of a sequence
;(expect '(1 1 2 2 3 3) (dups [1 2 3]))
;(expect '(:a :a :a :a :b :b :b :b) (dups [:a :a :b :b]))
;(expect '([1 2] [1 2] [3 4] [3 4]) (dups [[1 2] [3 4]]))

;;======== range basic
; (expect '(1 2 3) (intrange 1 4)) 
; (expect '(-2 -1 0 1) (intrange -2 2))
; (expect '(5 6 7) (intrange 5 8))

;;======== compress sequence
;(expect "Leroy" (comps "Leeeeeerrroyyy")) 
;(expect '(1 2 3 2 3) (comps [1 1 2 3 3 2 2 3]))
;(expect '([1 2] [3 4] [1 2]) (comps [[1 2] [1 2] [3 4] [1 2]]))

;;======== factorial
;(expect 1 (fact 1))
;(expect 6 (fact 3))
;(expect 120 (fact 5))
;(expect 40320 (fact 8))

;;======== interleave two seqs
; (expect '(1 :a 2 :b 3 :c) (ilv [1 2 3] [:a :b :c]))
; (expect '(1 3 2 4) (ilv [1 2] [3 4 5 6]))
; (expect [1 5] (ilv [1 2 3 4] [5]))
; (expect [30 25 20 15] (ilv [30 20] [25 15]))

;;======== flatten a sequence
(expect '(1 2 3 4 5 6) (flatit '((1 2) 3 [4 [5 6]])))
(expect '("a" "b" "c") (flatit ["a" ["b"] "c"]))
(expect '(:a) (flatit '((((:a))))))

