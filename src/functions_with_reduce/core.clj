(ns functions-with-reduce.core)

;;;;  Reimplementing some functions

;;; Reimplementing functions map, filter and some using reduce. 
;;; This was suggested by Daniel Higginbotham in his book named Clojure for the Brave and True in chapter 4

(defn my-map [f list]
  (reverse
   (reduce
    (fn [new-seq val]
      (cons (f val) new-seq))
    '()
    list)))

