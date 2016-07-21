;; Write a function which creates a list of all integers in a given range.

;; (= (__ 1 4) '(1 2 3))
(fn rang-e [start end]
    (cond (= start (dec end)) (list start)
        :else (cons start (rang-e (inc start) end))))

;; Here's a clojure specific answer from user '_artem_uv'
;; iterate is kinda like a 'lazy' map
#(take (- %2 %1) (iterate inc %1))
