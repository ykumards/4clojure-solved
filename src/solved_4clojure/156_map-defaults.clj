;; When retrieving values from a map, you can specify default values in case the key is not found:

;; (= 2 (:foo {:bar 0, :baz 1} 2))

;; However, what if you want the map itself to contain the default values? Write a function which takes a default value and a sequence of keys and constructs a map.

;; (= (__ 0 [:a :b :c]) {:a 0 :b 0 :c 0})

(fn [dval keys] 
  (zipmap keys (repeat dval)))
