;; Write a function which takes two sequences and
;; returns the first item from each, then the second
;;  item from each, then the third, etc.
;; (= (__ [1 2] [3 4 5 6]) '(1 3 2 4))
(defn interlev [l1 l2]
  (cond (and (empty? l1) (empty? l2)) '()
        (or (empty? l1) (empty? l2))  '()
        :else (let [fr1 (first l1)
                    fr2 (first l2)
                    res1 (rest l1)
                    res2 (rest l2)]
                (cons fr1 (cons fr2 (interlev res1 res2))))))

;; Using mapcat
mapcat list
