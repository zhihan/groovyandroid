package me.zhihan.helloworld1

import android.view.View
import groovy.transform.CompileStatic

@CompileStatic
class utils {
    /** Given a closure of create an object of onClickListener */
    static View.OnClickListener createOnClickListener(Closure<Void> c) {
        return new View.OnClickListener() {
            public void onClick(View v) {
                c(v)
            }
        }
    }
}