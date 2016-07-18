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

;; 161
#{1 2}
