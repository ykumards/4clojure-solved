;; Given two integers, write a function which returns the greatest common divisor.
(fn gcd [a b]
  (if (zero? b) 
      a
      (gcd b (mod a b))))
