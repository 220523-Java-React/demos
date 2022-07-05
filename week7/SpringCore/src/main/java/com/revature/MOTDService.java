package com.revature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *      Message of the Day Service to get messages of the day from a pre-populated list
 *
 *      we should be able to get messages by their index 0-4
 *
 */
public class MOTDService {

    private List<String> messages = new ArrayList<>();


    // not going to instantiate this here, we're once again going to rely on our configuration to set the value
    private int defaultIndex;

    public String getMessage(int index){ // what if someone passes in 17...?

        if(index <= 4 && index >= 0){   // index is valid
            return messages.get(index); // what does this leave us vulnerable to? -> ArrayIndexOutOfBounds -> Unchecked
        } else {                        // index is not valid, so return the default
            return messages.get(defaultIndex);
        }
    }

    // we will instruct the application context to run this init method when the object gets created
    protected void initMotds(){
        messages.addAll(Arrays.asList(
                "Good Morning",
                "It seems impossible until it's done",
                "You always pass failure on your way to success",
                "Positive anything is better than negative nothing",
                "The first step of the journey is always the most difficult"
        ));
    }

    // we are going to use spring configuration to inject a primitive value via Setter Injection
    public void setDefaultIndex(int defaultIndex){
        this.defaultIndex = defaultIndex;
    }
}
