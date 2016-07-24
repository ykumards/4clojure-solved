;; Write a function which drops every Nth item from 
;; a sequence.
;; (= (__ [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])
(fn drop-nth [li n]
  (cond (empty? li) '()
        :else (concat (take (dec n) li)
                      (drop-nth (drop n li) n))))
