;; Write a function which returns the first X fibonacci numbers.
;; The solution is of the form (map <some function> <over some list>)


#(map (fn fib [x]
        (if (<= x 2) 1
            (+ (fib (dec x)) (fib (- x 2)))))
      (range 1 (inc %)))

;; Another solution

(fn fibonacci [n]
  (case n 1 '(1)
          2 '(1 1)
          (let [f (fibonacci (- n 1))] (concat f (list (reduce + (take-last 2 f)))))))


