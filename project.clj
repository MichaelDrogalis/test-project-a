(defproject test-project-a "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 ^{:voom {:repo "git@github.com:clojure/core.async.git" :branch "master"}}
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]])
