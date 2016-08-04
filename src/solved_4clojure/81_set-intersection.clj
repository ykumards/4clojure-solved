;; Write a function which returns the intersection of two sets. The intersection is the sub-set of items that each set has in common.

#(clojure.set/difference %1 (clojure.set/difference %1 %2))
