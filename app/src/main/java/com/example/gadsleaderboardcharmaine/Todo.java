package com.example.gadsleaderboardcharmaine;

import androidx.annotation.NonNull;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Todo {


    public class Example {

        @SerializedName("live")
        @Expose
        private Boolean live;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("message")
        @Expose
        private String message;

        /**
         * No args constructor for use in serialization
         */
        public Example() {
        }

        /**
         * @param name
         * @param message
         * @param live
         */
        public Example(Boolean live, String name, String message) {
            super();
            this.live = live;
            this.name = name;
            this.message = message;
        }

        public Boolean getLive() {
            return live;
        }

        public void setLive(Boolean live) {
            this.live = live;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

    }
}
