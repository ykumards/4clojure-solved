;; Write a function which returns the sum of a sequence of numbers.

(fn sum-it [li] (cond (empty? li) 0
               :else (+ (first li) (sum-it (rest li)))))


;; Simpler built-in function
apply +