;; Write a function which separates the items
;; of a sequence by an arbitrary value.
;; (= (__ 0 [1 2 3]) [1 0 2 0 3])
(fn [delim li]
  (drop-last (interleave 
              li
              (repeat (count li) delim))))

;; Optimized for code-golf ;-)
#(drop-last (interleave %2 (repeat %1)))
;; Remember! Repeat is evaluated lazily, so 
;; this code works
