(ns demo.chrome-ext-v3.browser-action
  (:require ["react" :as react]))

(js/console.log "yo!")

(defn init []
  (js/console.warn "browser-action" react)

  (-> (js/chrome.extension.getBackgroundPage)
      (.-console)
      (.warn "browser-action" react)))
