;; Write a function which calculates factorials.

(fn facto [n]
    (cond (zero? n) 1
          (= 1 n) 1
          :else (* n (facto (dec n)))))

;; Also
#(reduce * (range 1 (inc %)))