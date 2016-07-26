;; Write a function which multiplies two numbers and returns the result as a sequence of its digits.
;; (= (__ 99 9) [8 9 1])
(fn [x y] 
   (map #(Character/getNumericValue %)
(into [] (str (* x y)))))
