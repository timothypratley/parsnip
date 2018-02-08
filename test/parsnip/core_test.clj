(ns parsnip.core-test
  (:require [clojure.java.io :as io]
            [clojure.test :refer :all]
            [cross-parinfer.core :as par])
  (:import (java.io File)))

(deftest test-paren-zen
  (testing "Zen prevails as the parens set sail"
    (doseq [f (remove #(.isDirectory ^File %)
                      (mapcat (fn [dir]
                                (file-seq (io/file dir)))
                              ["src" "test"]))
            :let [text (slurp f)]]
      (is (= text (:text (par/paren-mode text 0 0))))))
  )
