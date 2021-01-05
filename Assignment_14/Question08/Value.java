package com.cybertek.java_classes.Assignment_14.Question08;

// this is a copy of solution which get from internet
// because i dont understand the question. it is not clear.

    public class Value {
        private boolean modified = false;
        public int val;

        public Value(int v) {
            val = v;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int st) {
            val = st;
            modified = true;
        }

        public boolean wasModified() {
            return modified;
        }
    }

