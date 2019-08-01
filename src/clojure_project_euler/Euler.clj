(ns clojure_project_euler.Euler)

(def fib-seq
  (lazy-cat [0 1] (map + (rest fib-seq) fib-seq)))

(defn prime? [n]
  (let [certainty 5]
    (.isProbablePrime (BigInteger/valueOf n) certainty)))

(defn get-nth-prime [n]
  (last (take n (filter prime? (range Integer/MAX_VALUE)))))

(defn get-primes [n]
  (filter prime? (range n)))