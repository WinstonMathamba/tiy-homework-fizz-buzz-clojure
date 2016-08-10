(ns tiy-homework-fizz-buzz-clojure.core)

(defn -main[])

  (defn fizz-buzz[start end]
    (for [x (range start end)]
        (cond
          (= (mod x 15) 0) (println "FizzBuzz")
          (= (mod x 5) 0) (println "Buzz")
          (= (mod x 3) 0) (println "Fizz")
                :else (println x)))
      )


    ;For multiples of three print "Fizz" instead of the number.
    ;For the multiples of five it print "Buzz".
    ;For numbers which are multiples of both three and five print "FizzBuzz".


(-main)

(fizz-buzz 1 101)
