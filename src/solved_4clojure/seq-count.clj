;; Write a function which returns the total number of elements in a sequence.

(fn seq-count [li]
  (cond (empty? li) 0
        :else (+ 1 (seq-count (rest li)))))