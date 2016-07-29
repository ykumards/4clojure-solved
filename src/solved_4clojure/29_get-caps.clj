;; Write a function which takes a string and returns a new string containing only the capital letters.
;; (= (__ "HeLlO, WoRlD!") "HLOWRD")

#(apply str (filter (set (map char (range 65 91))) %))

;; Regex solution
#(apply str (re-seq #"[A-Z]" %))

;; Using java library
(fn [s] (reduce str (filter #(Character/isUpperCase %)) s))
