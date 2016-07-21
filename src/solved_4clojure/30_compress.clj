;; Write a function which removes consecutive duplicates from a sequence.
;; (= (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))

(fn compress [a-seq]
  (cond
    (empty? a-seq) '()
    :else (let [val (first a-seq)]
            ;; drop-while is the secret sauce, drops all values from a list
            ;; till the predicate remains true
            (cons val (compress (drop-while (fn [x]
                                              (= x val)) a-seq))))))