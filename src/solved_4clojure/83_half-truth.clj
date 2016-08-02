;; Write a function which takes a variable number of 
;; booleans. Your function should return true if some
;; of the parameters are true, but not all of the 
;; parameters are true. Otherwise your function 
;; should return false.
(fn [& args]
  (let [trueCount (count (filter true? args))]
    (cond (= trueCount (count args)) false
          (zero? trueCount) false
          :else true)))

;; Much cleaner solution
(fn[& args]
  (and (boolean (some true? args))  (not-every? true? args)))
