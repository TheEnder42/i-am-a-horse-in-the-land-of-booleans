(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if(false? x)
  false
  (if(nil? x)
  false
  true)))

;(if cond
;  value-if-true
;  value-if-false)

(defn abs [x]
  (if(< x 0)
  (* -1 x)
  x))

(defn divides? [divisor n]
  (if ;(0? (mod n divisor))
    (= (mod n divisor) 0)
    ;(zero? x)
  true
  false))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else ""))

(defn teen? [age]
  (if(<= 13 age 19)
  true
  false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (list? x) (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else true))

(defn leap-year? [year]
  (cond
    ;((divides? [400 year])?) true
    (divides? 400 year) true
    (divides? 100 year) false
    (divides? 4 year) true
    :else false))

; '_______'
