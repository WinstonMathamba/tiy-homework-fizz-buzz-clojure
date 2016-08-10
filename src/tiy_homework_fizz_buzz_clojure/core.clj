(ns tiy-homework-fizz-buzz-clojure.core)



(defn fizz-buzz[start end]
  (for [x (range start end)]
    (cond
        (and (= (mod x 5) 0)
             (= (mod x 3) 0)) (str "FizzBuzz")
        (= (mod x 5) 0) (str "Buzz")
        (= (mod x 3) 0) (str "Fizz")
        :else (str x))))



    ;For multiples of three print "Fizz" instead of the number.
    ;For the multiples of five it print "Buzz".
    ;For numbers which are multiples of both three and five print "FizzBuzz".

(defn -main[]
  (print (fizz-buzz 1 101)))

(-main)


