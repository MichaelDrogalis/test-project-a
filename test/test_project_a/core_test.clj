(ns test-project-a.core-test
  (:require [clojure.test :refer :all]
            [test-project-a.core :refer :all]))

(deftest a-test
  (testing "Pass"
    (is (= 1 1))))
