;; Write a function which takes a vector of keys and a vector of values and constructs a map from them.
;; (= (__ [:a :b :c] [1 2 3]) {:a 1, :b 2, :c 3})
#(apply assoc {}
        (interleave %1 %2))

;; OR 
#(apply hash-map (interleave %1 %2))
