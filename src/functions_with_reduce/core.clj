(ns functions-with-reduce.core)

;;;;  Reimplementing some functions

;;; Reimplementing functions map, filter and some using reduce. 
;;; This was suggested by Daniel Higginbotham in his book named Clojure for the Brave and True in chapter 4

(defn my-map 
  "Returns a sequence consisting of the result of applying f to items of coll"
  [f list]
  (reverse
   (reduce
    (fn [new-seq val]
      (cons (f val) new-seq))
    '()
    list)))

