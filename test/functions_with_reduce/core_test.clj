(ns functions-with-reduce.core-test
  (:require [clojure.test :refer :all]
            [functions-with-reduce.core :refer :all]))

(deftest my-map-test
  (testing "with a vector"
    (is (= [2 3 4 5] 
           (my-map inc [1 2 3 4]))))
  (testing "with a map"
    (is (= '(1 2) 
           (my-map :val [{:val 1} {:val 2}])))))

(deftest my-filter-test
  (testing "my-filter"
    (is (= [4 5 6] 
           (my-filter (fn [x] (> x 3)) 
                      [1 2 3 4 5 6])))))
