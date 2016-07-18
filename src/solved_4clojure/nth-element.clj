;; Write a function which returns the Nth element from a sequence.

(fn nth-ele [li idx]
  (cond (empty? li) nil
        (zero? idx) (first li)
        :else (nth-ele (rest li) (dec idx))))