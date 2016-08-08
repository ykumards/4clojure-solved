(ns solved-4clojure.107-simple-closures)
;; A closure is a function that has access to some named value/variable 
;; outside its own scope., so from a higher scope surrounding the function
;;  when it was created. This excludes function arguments and local named 
;; values created within the function. 

#(fn f [x] (reduce * (repeat % x)))

;; Note how partial is used here
partial #(Math/pow %2 %1)
