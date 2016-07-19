;; Solutions to initial problems

;; 1
true

;; 2
4

;; 3
"HELLO WORLD"

;; 4
:a :b :c

;; 5
'(1 2 3 4)

;; 6
:a :b :c

;; 7
[1 2 3 4]

;; 8
#{:a :c :b :d}

;; 9
2

;; 10
20

;; 11
[:b 2]

;; 12
3

;; 13
[20 30 40]

;; 14
8

;; 15
#(* 2 %1)

;; 16
#(str "Hello, " % "!")

;; 17
'(6 7 8)

;; 18
'(6 7)

;; 35
7

;; 36
[x 7
 y 3
 z 1]

 ;; 37
 "ABC"

 ;; 57
 '(5 4 3 2 1)

 ;; 64
 +

 ;;

;; 19 Implement (last li)
(fn my-last [li]
  (cond (empty? (rest li)) (first li)
        :else (my-last (rest li))))

;; Better Answer 19
#(nth % (dec (count %)))

;; 20
#(second (reverse %))

;; 25 Write a function which returns only the odd numbers from a sequence.
#(filter odd? %)

;; 52
[c e]

;; ## 68
;; Clojure only has one non-stack-consuming looping construct: recur.
;; Either a function or a loop can be used as the recursion point.
;; Either way, recur rebinds the bindings of the recursion point to
;; the values it is passed. Recur must be called from the tail-position,
;; and calling it elsewhere will result in an error.

;; (= __
;;  (loop [x 5
;;         result []]
;;    (if (> x 0)
;;      (recur (dec x) (conj result (+ 2 x)))
;;      result)))

[7 6 5 4 3]

;; ## 71
;; The -> macro threads an expression x through a variable number of forms.
;; First, x is inserted as the second item in the first form, making a list
;; of it if it is not a list already. Then the first form is inserted as the
;; second item in the second form, making a list of that form if necessary.
;; This process continues for all the forms. Using -> can sometimes make your
;; code more readable.

;; (= (__ (sort (rest (reverse [2 5 4 1 3 6]))))
;; (-> [2 5 4 1 3 6] (reverse) (rest) (sort) (__))
;; 5)

last

;; # 72
;; The ->> macro threads an expression x through a variable number of forms.
;; First, x is inserted as the last item in the first form, making a list of
;; it if it is not a list already. Then the first form is inserted as the last
;; item in the second form, making a list of that form if necessary. This process
;; continues for all the forms. Using ->> can sometimes make your code more readable.

;; (= (__ (map inc (take 3 (drop 2 [2 5 4 1 3 6]))))
;;    (->> [2 5 4 1 3 6] (drop 2) (take 3) (map inc) (__))
;;    11)
reduce +

;; ## 134
;; Write a function which, given a key and map, returns true iff the map contains an
;; entry with that key and its value is nil.

(fn [k m]
  (and (contains? m k) (nil? (k m))))

;; 145
;; Clojure's for macro is a tremendously versatile mechanism for producing a sequence
;; based on some other sequence(s). It can take some time to understand how to use it
;; properly, but that investment will be paid back with clear, concise sequence-wrangling
;; later. With that in mind, read over these for expressions and try to see how each of
;; them produces the same result.

;; (= __ (for [x (range 40)
;;            :when (= 1 (rem x 4))]
;;        x))

'(1 5 9 13 17 21 25 29 33 37)
;; or
(range 1 38 4)
;; 161
#{1 2}

;; 162
1


