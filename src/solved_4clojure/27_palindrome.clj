;; Write a function which returns true if the given sequence is a palindrome.

;; Hint: "racecar" does not equal '(\r \a \c \e \c \a \r)

(fn [li]
  (= (seq li) (reverse li)))