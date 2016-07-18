;; Write a function which duplicates each element of a sequence.

;; Example (= (__ [1 2 3]) '(1 1 2 2 3 3))

(fn dup [li]
  (cond (empty? li) '()
    :else
    (let [el (first li)]
      (cons el (cons el (dup (rest li)))))))

;; Interleave solution
#(interleave % %)