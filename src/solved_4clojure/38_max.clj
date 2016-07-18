;; Write a function which takes a variable number of parameters
;; and returns the maximum value.

(fn [& args]
  (reduce (fn [x y]
            (if (> x y) x
                y)) args))