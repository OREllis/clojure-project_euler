(ns clojure_project_euler.core
  (:require [clojure_project_euler.Euler :as Euler]))

(defn euler1 []
  (->> (range 1000)
       (filter #(or (= 0 (mod % 3)) (= 0 (mod % 5))))
       (reduce +)))

(defn euler2 []
  (->> (take 35 Euler/fib-seq) (filter even?) (reduce +)))

(defn euler3 [])

(defn euler4 [])

(defn euler5 [])

(defn euler6 []
  (let [nums (range 1 100)]
    (- (Math/pow (reduce + nums) 2) (->> nums (map #(* % %)) (reduce +)))))

(defn euler7 []
  (Euler/get-nth-prime 10001))

(defn euler8 [])

(defn euler9 [])

(defn euler10 []
  (reduce + (Euler/get-primes 2000000)))

(defn -main [& args]
  (println (euler10)))
