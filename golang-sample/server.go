package main

import (
	"fmt"
	"net/http"
)

func main() {
	http.HandleFunc("/api/v1/messages", func(w http.ResponseWriter, r *http.Request) {
		fmt.Fprintf(w, "Hello BCX!")
	})

	http.ListenAndServe(":8080", nil)
}