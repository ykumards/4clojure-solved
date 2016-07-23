;; Write a function which replicates each element of a 
;; sequence a variable number of times.
;; (= (__ [1 2 3] 2) '(1 1 2 2 3 3))
(fn [li n]
  (mapcat #(repeat n %) li))
