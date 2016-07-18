;; Write a function which reverses a sequence.

(defn myrev
  [in-list]
  (if (empty? in-list)
    '()
    (distinct (concat (myrev (rest in-list)) (list (first in-list))))))