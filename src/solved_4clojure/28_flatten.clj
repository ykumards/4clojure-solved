;; Write a function which flattens a sequence.
;; (= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))

(fn flatter [x]
    (reduce
        (fn [acc e]
          (if (or (list? e) (vector? e))
                (concat acc (flatter e))
                (concat acc (list e))))
        '()
        x
))

;; Checking for Sequential

(fn flatter [x]
  (reduce (fn [acc e]
            (if (sequential? e)
              (concat acc (flatter e))
              (concat acc (list e))))
          '()
          x))
